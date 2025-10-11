
import React from "react";
import{ BrowserRouter as Router, Routes,Route,Link } from "react-router-dom"
import Login from "./component/Pages/login";
import Home from "./component/Pages/Home";
import About from "./component/hook/AbountUs";
import Contact from "./component/Pages/Contact";

import './App.css'
function RoutDemo() {
  return (
 
     <Router>
     <nav >
     {/* <Link to='/ome'>Home</Link> */}
     <Link to='/'>Home </Link>
     <Link to='/about' >About</Link>
     <Link to='/login'>Login</Link>
     <Link to='/contact'>Contact</Link>
     </nav>
     <Routes>
     
      <Route path="/" element={
        <Home></Home>} > 
     </Route>
      <Route path="/login" element={
        <Login></Login>} > 
     </Route>
      <Route path="/about" element={
        <About></About>} > 
     </Route>
      <Route path="/contact" element={<Contact></Contact>} > 
     </Route>
     
     </Routes>
    
     </Router>
   
  );
}

export default RoutDemo;
