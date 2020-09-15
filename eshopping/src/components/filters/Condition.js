import React from "react";

function Condition() {
  return (
    <div class='mb-2'>
      <h3>Condition</h3>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='new'
          name='new'
          value='new'
        />
        <label class=' custom-control-label' htmlFor='new'>
          NEW
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='used'
          name='used'
          value='used'
        />
        <label class=' custom-control-label' htmlFor='used'>
          USED
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='collectible'
          name='collectible'
          value='collectible'
        />
        <label class=' custom-control-label' htmlFor='collectible'>
          COLLECTIBLE
        </label>
      </div>
      <div class='custom-control custom-checkbox'>
        <input
          class='custom-control-input'
          type='checkbox'
          id='renewed'
          name='renewed'
          value='renewed'
        />
        <label class=' custom-control-label' htmlFor='renewed'>
          RENEWED
        </label>
      </div>
    </div>
  );
}

export default Condition;
