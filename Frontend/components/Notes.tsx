import React, { useState } from 'react';

interface DisplayNotes {
  list: string[];
}

export default function NotesDisplay({ list }: DisplayNotes) {
  const [notesList, setNotesList] = useState(list);

  const deleteItem = (index: number) => {
    const updatedList = notesList.filter((_, i) => i !== index);
    setNotesList(updatedList);
  };

  return (
    <div className='grid grid-cols-3 gap-4  overflow-y-scroll max-h-[45.3vw]'>
      {notesList.map((e, index) => (
        <div className='bg-yellow-300 p-8 mx-1 ml-10 my-1 max-w-[20vw] min-w[10vw] min-h-[20vw] relative' key={index}>
          <div dangerouslySetInnerHTML={{ __html: e }} />
          <button onClick={() => deleteItem(index)}>delete</button>
        </div>
      ))}
    </div>
  );
}
