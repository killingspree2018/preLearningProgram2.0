import React from "react";
import {
  MDBNavbar,
  MDBNavbarBrand,
  MDBNavbarNav,
  MDBNavbarToggler,
  MDBCollapse,
  MDBNavItem,
  MDBNavLink,
  MDBContainer,
  MDBMask,
  MDBView,
} from "mdbreact";
import { BrowserRouter as Router } from "react-router-dom";
function Navbar() {
  return (
    <nav class='navbar navbar-expand-lg navbar-light bg-light'>
      <a class='navbar-brand' href='#'>
        MDB
      </a>
      <button
        class='navbar-toggler'
        type='button'
        data-toggle='collapse'
        data-target='#navbarNav'
        aria-controls='navbarNav'
        aria-expanded='false'
        aria-label='Toggle navigation'
      >
        <span class='navbar-toggler-icon'></span>
      </button>
      <div class='collapse navbar-collapse' id='navbarNav'>
        <ul class='navbar-nav ml-auto'>
          <li class='nav-item'>
            <a class='nav-link' href='#'>
              Shop
            </a>
          </li>
          <li class='nav-item'>
            <a class='nav-link' href='#'>
              Contact
            </a>
          </li>
          <li class='nav-item'>
            <a class='nav-link' href='#'>
              Sign in
            </a>
          </li>
          <li class='nav-item'>
            <a class='nav-link' href='#'>
              Sign Up
            </a>
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default Navbar;
