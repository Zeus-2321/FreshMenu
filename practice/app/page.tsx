"use client"
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Link from 'next/link';

const Home = () => {
  const [phones, setPhones] = useState([]);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await axios.get('https://phone-specs-api.vercel.app/latest');
      setPhones(response.data.data.phones);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div className="flex justify-center">
      <div className="flex flex-wrap gap-4 my-8">
        {phones.map((phone) => (
          <div key={phone.slug} className="p-4 border border-gray-300 rounded-lg w-64 flex flex-col items-center shadow-md hover:shadow-lg">
            <img src={phone.image} alt={phone.phone_name} className="w-48 mb-2" />
            <h4 className="text-lg font-semibold mb-1">{phone.phone_name}</h4>
            <Link href={`/details/${phone.slug}`} passHref>
              <p className="text-blue-500 hover:text-blue-700">View details</p>
            </Link>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Home;


