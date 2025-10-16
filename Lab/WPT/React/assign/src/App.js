<<<<<<< HEAD
// import logo from './logo.svg';
// import './App.css';
// import Home from './Home';
// import 
// function App() {
//   return (
//     <div>
// <Home></Home>
//     </div>
//   );
// }

// export default App;
=======

import Home from './component/Home';
import AboutUs from './component/AboutUs';
import Counter from './component/Counter';
import Contact from './component/Contact';
import Suyog from './component/Suyog';

import { BrowserRouter,Routes, Route, Link } from 'react-router-dom';
function App() {
  return (
    <div>
      <BrowserRouter>

    <nav>
      <Link to="/">Home</Link>
       <Link to="/about">About</Link>
         <Link to="/counter">Counter</Link>
         <Link to="/yog">Yog</Link>
    </nav>
    <Routes>

          <Route path="/" element={
            <Home/>
          }/>

         
           <Route path="/about" element={
           <AboutUs/>
          }/>
           <Route path="/counter" element={
            <Counter/>
      
          }/>
            <Route path="/contact" element={
            <Contact/>
           }/>
           <Route path="/yog" element={<Suyog/>}
           />
        
        </Routes>
         </BrowserRouter>

    </div>
  );
}

export default App;
>>>>>>> 32558f955f463af33c75ee82b0c9ba8fe2153e5a
