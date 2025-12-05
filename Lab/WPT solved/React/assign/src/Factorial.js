import { useState } from "react";
import Calculator from "./Calculator";
function Factorial(){
     let fact=1;
     const[number,setnum]=useState(0);
    for(let i=1; i<=number;i++){
         fact=fact*i;
    }
    
    const bala=(e)=>setnum(e.target.value)
    const lala=(e)=>setnum(e.target.value)


    return(
     <>
    
       <h1>Factorial: {fact}</h1>
       <div>
           <input
            type="number"
             onChange={bala} value={number} placeholder="Enter the number"></input>
<input type="number" onClick={lala} ></input>
       </div>
       <form>
  
       </form>
       <label>Enter The number:{number}</label>
      
      
     </>
   
    )
}
export default Factorial;