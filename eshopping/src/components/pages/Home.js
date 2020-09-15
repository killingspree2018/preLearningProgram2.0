import React from "react";
import { MDBContainer, MDBRow, MDBCol } from "mdbreact";
import Products from "../products/Products";
import SideBar from "../layouts/SideBar";

const Home = () => {
  return (
    <MDBContainer>
      <MDBRow>
        <SideBar className='m-2' />
        <MDBCol>
          <Products />
        </MDBCol>
      </MDBRow>
    </MDBContainer>
  );
};

export default Home;
