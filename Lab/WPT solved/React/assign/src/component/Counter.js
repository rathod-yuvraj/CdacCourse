import { useState } from "react";

function Counter(){
    const[count,setcount]=useState(0);


    return(
        <div>
            <h1>Counter: {count}</h1>
            <button onClick={()=>setcount(p=>p+1)}>Increment</button>
            <button onClick={()=>setcount(p=>p-1)}>Decreament </button>
        </div>
    )
}

export default Counter;