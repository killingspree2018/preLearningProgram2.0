import React from "react";
import { MDBRow, MDBCol } from "mdbreact";
import Subcategories from "../filters/Subcategories";
import Condition from "../filters/Condition";
import Reviews from "../filters/Reviews";
import Price from "../filters/Price";
import Size from "../filters/size";
import Color from "../filters/Color";
import Search from "../filters/Search";

function SideBar() {
  return (
    <MDBCol size='4'>
      <MDBRow>
        <Subcategories />
      </MDBRow>
      <MDBRow>
        <Search />
      </MDBRow>
      <MDBRow>
        <Condition />
      </MDBRow>
      <MDBRow>
        <Reviews />
      </MDBRow>
      <MDBRow>
        <Price />
      </MDBRow>
      <MDBRow>
        <Size />
      </MDBRow>
      <MDBRow>
        <Color />
      </MDBRow>
    </MDBCol>
  );
}

export default SideBar;
