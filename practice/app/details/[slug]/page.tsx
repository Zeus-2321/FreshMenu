"use client"
import React, { useState, useEffect } from 'react';
import axios from 'axios';

interface DetailsProps {
  slug: string;
}

const Details: React.FC<DetailsProps> = ({ slug }) => {
  const [phone, setPhone] = useState(null);

  useEffect(() => {
    console.log(slug)
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await axios.get(`https://phone-specs-api.vercel.app/${slug}`);
      setPhone(response.data.data);
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div className="details-container">
      <div className="details-header">
        <h2>{phone.brand} {phone.phone_name}</h2>
        {/* Rest of the code */}
      </div>

      <div className="details-specs">
        <h3>Specifications:</h3>
        {/* Rest of the code */}
      </div>
    </div>
  );
};

export default Details;




