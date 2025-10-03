import React,{useState} from "react";
 
function PasswordGen() {

   
    const [uotp,setopt]=useState(0);

    function Otpgenerator() {
       let num=Math.floor(1000+Math.random()*1000);
        // setotp= Math.random();
      setopt(num);
    //    console.log(uotp);
       console.log("Password: "+num);
        
    }
    return(
        <div>
   
    <h1>OTP:{uotp}</h1>
    
            <button onClick={Otpgenerator}> OTP</button>
        
        </div>
        
    );
}
export default PasswordGen;