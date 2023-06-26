import Link from "next/link";
import Navbar from "@/components/Navbar";
import Image from "next/image";
import About from "@/components/AboutUs";
export default function Page() {
  return (
    <div>
      <Navbar />
      <div className="bg-blackbg h-[75vh] items-center bg-cover flex px-10">
        <div className="flex-1 ml-44">
          <Image
            className="mb-5"
            src="/assets/text/heading1.png"
            width={400}
            height={80}
            alt="title"
          />
          <Image
            src="/assets/text/desc1.png"
            width={600}
            height={50}
            alt="title"
          />
          <button className="mt-5">
            <Link href={"/notes"}>
              <Image
                src="/assets/GetStarted.png"
                width={120}
                height={40}
                alt="get started button"
              />
            </Link>
          </button>
        </div>
        <div className="flex-1 items-center">
          <Image
            className="ml-36  mt-28"
            src={"/images/Image1.png"}
            alt="image 1"
            width={500}
            height={500}
          />
        </div>
      </div>
      <div className="bg-whitebg h-[75vh] items-start bg-cover flex px-10 justify-around">
        <div className="flex flex-col items-center mt-16 ml-16">
          <Image
            src="/assets/navbar/Blogs.png "
            width={80}
            height={25}
            alt="blog"
          />
          {/* carousel to be added by dev */}
        </div>
        <div className="flex flex-col items-center mt-16 mr-16">
          <Image
            src="/assets/navbar/Notes.png "
            width={80}
            height={25}
            alt="notes"
          />
          {/* carousel to be added by dev */}
        </div>
      </div>
      <div className="bg-blackbg h-[75vh] items-center bg-cover flex px-10 relative">
        <div className=" absolute top-36 left-0">
          <Image
            className=""
            src={"/images/Image2.png"}
            alt="image 1"
            width={700}
            height={700}
          />
        </div>
        <div className="flex-1 ml-[40vw] mt-24">
          <Image
            className="mb-5"
            src="/assets/text/heading2.png"
            width={400}
            height={80}
            alt="title"
          />
          <Image
            src="/assets/text/desc2.png"
            width={700}
            height={50}
            alt="title"
          />
          <button className="mt-5">
            <Link href={"/blogs"}>
              <Image
                src="/assets/ReadBlogs.png"
                width={125}
                height={40}
                alt="get started button"
              />
            </Link>
          </button>
        </div>
      </div>
      <div className="bg-whitebg h-[75vh] flex-1 bg-cover"></div>
      <About />
    </div>
  );
}
