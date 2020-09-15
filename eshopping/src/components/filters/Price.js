import React, { useState } from "react";

function Price() {
  const [min, setMin] = useState("");
  const [max, setMax] = useState("");
  const Max = (e) => setMax(e.target.value);
  const Min = (e) => setMin(e.target.value);
  return (
    <div>
      <h3>Price</h3>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='UNDER $25'
          name='UNDER $25'
          value='UNDER $25'
        />
        <label class=' custom-control-label' htmlFor='UNDER $25'>
          UNDER $25
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='$25 TO $50'
          name='$25 TO $50'
          value='$25 TO $50'
        />
        <label class=' custom-control-label' htmlFor='$25 TO $50'>
          $25 TO $50
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='$50 TO $100'
          name='$50 TO $100'
          value='$50 TO $100'
        />
        <label class=' custom-control-label' htmlFor='$50 TO $100'>
          $50 TO $100
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='$100 TO $200'
          name='$100 TO $200'
          value='$100 TO $200'
        />
        <label class=' custom-control-label' htmlFor='$100 TO $200'>
          $100 TO $200
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='$200 & ABOVE'
          name='$200 & ABOVE'
          value='$200 & ABOVE'
        />
        <label class=' custom-control-label' htmlFor='$200 & ABOVE'>
          $200 & ABOVE
        </label>
      </div>
      <form class='form-inline my-2'>
        <input
          class='form-control form-control-sm mr-3 w-75"'
          type='text'
          value={min}
          placeholder='$ Min'
          onChange={Min}
          style={{ width: "40%" }}
        />
        <span class='mr-2'>-</span>
        <input
          class='form-control form-control-sm mr-3 w-75"'
          type='text'
          value={max}
          placeholder='$ Max'
          onChange={Max}
          style={{ width: "40%" }}
        />
      </form>
      <div class='d-flex justify-content-center my-4'>
        <span>0$</span>
        <input
          type='range'
          class='custom-range'
          min='0'
          max='100'
          id='customRange1'
        />
        <span>100$</span>
      </div>
    </div>
  );
}

export default Price;
