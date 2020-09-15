import React from "react";

function Subcategories() {
  return (
    <div class='m-2 mt-4'>
      <h1>Subcategories</h1>
      <a href='/'>RETURN TO CLOTHING, SHOES, ACCESSORIES</a>
      <p />
      <ul
        style={{
          listStyleType: "none",
          paddingInlineStart: "0px",
        }}
      >
        <li>
          <a href='/'>DRESSES</a>
        </li>
        <li>
          <a href='/'>TOPS,TEES & BLOUSES</a>
        </li>
        <li>
          <a href='/'>SWEATERS</a>
        </li>
        <li>
          <a href='/'>FASHION HOODIES & SWEATSHIRT</a>
        </li>
        <li>
          <a href='/'>JEANS</a>
        </li>
      </ul>
    </div>
  );
}

export default Subcategories;
