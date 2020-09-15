import React, { useState } from "react";
import {
  MDBNavbar,
  MDBNavbarBrand,
  MDBNavbarNav,
  MDBNavbarToggler,
  MDBCollapse,
  MDBNavItem,
  MDBNavLink,
  MDBMask,
  MDBView,
  MDBDropdown,
  MDBDropdownToggle,
  MDBDropdownMenu,
  MDBDropdownItem,
} from "mdbreact";
import { BrowserRouter as Router } from "react-router-dom";

const NavbarMDN = () => {
  const [collapse, setCollapse] = useState("false");
  const toggleState = () => setCollapse(!collapse);
  return (
    <div>
      <header>
        <Router>
          <MDBNavbar color='transparent' dark expand='md' fixed='top'>
            <MDBNavbarBrand href='/'>
              <strong>MDB</strong>
            </MDBNavbarBrand>
            <MDBNavbarToggler onClick={toggleState} />
            <MDBCollapse isOpen={collapse} navbar>
              <MDBNavbarNav right>
                <MDBNavItem>
                  <MDBNavLink to='#'>
                    <span class='badge red' style={{ borderRadius: "0.5rem" }}>
                      1
                    </span>
                    <i class='fas fa-shopping-cart'></i>
                  </MDBNavLink>
                </MDBNavItem>
                <MDBNavItem>
                  <MDBDropdown>
                    <MDBDropdownToggle nav caret>
                      <span className='mr-2'>
                        <i class='united states flag'></i>
                      </span>
                    </MDBDropdownToggle>
                    <MDBDropdownMenu>
                      <MDBDropdownItem href='#!'>
                        <i class='india flag'></i>
                      </MDBDropdownItem>
                      <MDBDropdownItem href='#!'>
                        <i class='united states flag'></i>
                      </MDBDropdownItem>
                      <MDBDropdownItem href='#!'>
                        <i class='france flag'></i>
                      </MDBDropdownItem>
                      <MDBDropdownItem href='#!'>
                        <i class='spain flag'></i>
                      </MDBDropdownItem>
                    </MDBDropdownMenu>
                  </MDBDropdown>
                </MDBNavItem>
                <MDBNavItem>
                  <MDBNavLink to='#'>Shop</MDBNavLink>
                </MDBNavItem>
                <MDBNavItem>
                  <MDBNavLink to='#'>Contact</MDBNavLink>
                </MDBNavItem>
                <MDBNavItem>
                  <MDBNavLink to='#'>Sign in</MDBNavLink>
                </MDBNavItem>
                <MDBNavItem active>
                  <MDBNavLink to='#'>Sign Up</MDBNavLink>
                </MDBNavItem>
              </MDBNavbarNav>
            </MDBCollapse>
          </MDBNavbar>
        </Router>
        <MDBView src='https://mdbootstrap.com/img/Photos/Others/img%20(49).jpg'>
          <MDBMask
            overlay='black-light'
            className='flex-center flex-column text-white text-center'
          >
            <h2>SHOP</h2>
          </MDBMask>
        </MDBView>
      </header>
    </div>
  );
};

export default NavbarMDN;
