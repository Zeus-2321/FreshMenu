import Image from 'next/image';

const Images = () => {
  return (
    <div className="flex justify-center items-center flex-wrap gap-16 my-8">
      <div className="w-80">
        <Image
          src="/images/14.jpg"
          alt="Image 1"
          width={500}
          height={300}
          layout="responsive"
          className="rounded-lg"
        />
      </div>
      <div className="w-80">
        <Image
          src="/images/s23.jpg"
          alt="Image 2"
          width={500}
          height={300}
          layout="responsive"
          className="rounded-lg"
        />
      </div>
      <div className="w-80">
        <Image
          src="/images/pro.jpg"
          alt="Image 3"
          width={500}
          height={300}
          layout="responsive"
          className="rounded-lg"
        />
      </div>
    </div>
  );
};

export default Images;

