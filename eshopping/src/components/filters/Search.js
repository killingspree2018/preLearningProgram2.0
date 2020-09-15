import React, { useState } from "react";

function Search() {
  const [text, setText] = useState("");
  const onChange = (e) => setText(e.target.value);
  return (
    <div class='mb-4'>
      <h1 class='mb-4'>Filters</h1>
      <form class='form-inline'>
        <input
          class='form-control form-control-sm mr-3 w-75"'
          type='text'
          value={text}
          placeholder='Search...'
          onChange={onChange}
        />
        <span>
          <i class='fas fa-search' />
        </span>
      </form>
    </div>
  );
}

export default Search;
