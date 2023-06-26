"use client";

import Image from "next/image";
import Link from "next/link";
import { useEffect, useState } from "react";

import "tailwindcss/tailwind.css";

export default function Navbar() {
  const [customclass, changeCustomclass] = useState({
    dot: "ml-5 hover:animate-[wave_5s_ease-in-out_2] ",
    text: "ml-1 ",
    hamburger: "hidden ",
  });

  useEffect(() => {
    let path = window.location.pathname;
    if (path === "/notes") {
      changeCustomclass({
        dot: " ml-5 animate-rotate-stop  relative",
        text: "ml-5 animate-slide-transition",
        hamburger: "animate-pulse absolute inset-0 ml-2 mt-8 rotate-90 w-8 h-6",
      });
    } else {
      console.log("path is not notes");
    }
  }, []);

  return (
    <div className="  py-2 flex items-center h-24 justify-between bg-navbarbg ">
      <div className="flex items-center">
        <div className={`${customclass.dot}`}>
          <Image
            src="/assets/navbar/logodot.png"
            width={50}
            height={70}
            alt="dot of logo"
          />
        </div>
        <div className={`${customclass.text}`}>
          <Image
            src="/assets/navbar/logotext.png"
            width={110}
            height={30}
            alt="text of logo"
          />
        </div>
      </div>
      <div className="mx-4 flex items-center">
        <Link className="mx-2 mb-1" href={"/"}>
          <Image
            src="/assets/navbar/Home.png "
            width={90}
            height={25}
            alt="home"
          />
        </Link>
        <Link className="mx-2" href={"/blog"}>
          <Image
            src="/assets/navbar/Blogs.png "
            width={80}
            height={25}
            alt="blog"
          />
        </Link>
        <Link className="mx-2" href={"/notes"}>
          <Image
            src="/assets/navbar/Notes.png "
            width={80}
            height={25}
            alt="notes"
          />
        </Link>
      </div>
    </div>
  );
}
