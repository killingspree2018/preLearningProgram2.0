import React, { Fragment } from "react";
import NavbarMDN from "./components/layouts/NavbarMDN";
import Footer from "./components/layouts/Footer";
import Home from "./components/pages/Home";
import "./App.css";

function App() {
  return (
    <div className='App'>
      <Fragment>
        <NavbarMDN />
        <Home />
        <Footer />
      </Fragment>
    </div>
  );
}

export default App;
