import React from 'react';
import Link from 'next/link';

const Navbar: React.FC = () => {
  return (
    <nav className="flex items-center justify-between p-4 bg-gray-800">
      <div className="flex items-center">
        <Link href="/" passHref>
          <span className="text-white text-xl font-bold cursor-pointer">PhoneWise</span>
        </Link>
      </div>
      <div className="flex items-center">
        <input
          type="text"
          placeholder="Search"
          className="px-4 py-2 mr-2 rounded-lg bg-gray-200 text-gray-800 focus:outline-none focus:ring focus:border-blue-500"
        />
        <button className="px-4 py-2 text-white bg-blue-500 rounded-lg hover:bg-blue-600 focus:outline-none focus:ring focus:border-blue-500">
          Search
        </button>
      </div>
      <div className="flex items-center">
        <ul className="flex space-x-4">
        <li>
            <Link href="/images" passHref>
              <span className="text-white cursor-pointer">Images</span>
            </Link>
          </li>
          <li>
            <Link href="/about" passHref>
              <span className="text-white cursor-pointer">About Us</span>
            </Link>
          </li>
        </ul>
      </div>
    </nav>
  );
};

export default Navbar;


