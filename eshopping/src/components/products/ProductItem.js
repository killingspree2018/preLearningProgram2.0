import React from "react";

function ProductItem(props) {
  const { imgURL, name, price } = props.product;
  return (
    <div class='card my-5 mx-2'>
      <img class='card-img-top' src={imgURL} alt='card' />
      <div class='card-body text-center'>
        <h6 class='card-title'>
          <a href='/'>{name}</a>
        </h6>
        <h6>${price}</h6>
      </div>
    </div>
  );
}

export default ProductItem;
