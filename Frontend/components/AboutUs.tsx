import Image from "next/image";
export default function About() {
  return (
    <div className="-mt-5">
      <div className="bg-[url(/assets/backgrounds/aboutus.png)] bg-cover bg-no-repeat h-[25vw] items-center justify-center flex ">
            <Image className="mt-3" src={'/images/circle.png'} width={430} height={430} alt="circle"></Image>
      </div>
    </div>
  );
}
