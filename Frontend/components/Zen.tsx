import { useState } from "react";
import "react-quill/dist/quill.snow.css";
import ReactQuill from "react-quill";

export default function ZenMode() {
  const [value, setValue] = useState("");

  return (
    <div className="flex flex-col items-center h-screen bg-slate-500">
      <ReactQuill
        className="w-full h-full bg-slate-400"
        theme="snow"
        value={value}
        onChange={setValue}
      />
    </div>
  );
}