

import React, { useContext, useState } from "react";
import ThemeContext from './Context'; 


function MyComponent() {
    const theme = useContext(ThemeContext);
   
    const[col,setcolor]=useState('');
    return (
        <div style={{ 
            background: theme === 'dark' ? 'black' : 'white', 
            color: theme === 'dark' ? 'white' : 'black' 
        }}>
            Current theme: {theme}

              






            <button onChange={(e)=>{
                setcolor(theme);
            }}>Context Toggle</button>
        </div>
    );
}


 


export default MyComponent;