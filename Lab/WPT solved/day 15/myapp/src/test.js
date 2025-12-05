import { Component } from "react"
export default class Conversion extends Component{
    
    uppercase()
    {
        let a =document.getElementById("txt").value;
        if(a===""){
             document.getElementById("res").innertext="please fill the textfield";
        }else{
        document.getElementById("res").innerHTML=a.toUpperCase();
        }
        document.getElementById("txt").value=""
    }
    lowercase()
    {
        let a =document.getElementById("txt").value;
        if(a===""){
             document.getElementById("res").innertext="please fill the textfield";
        }else{
        document.getElementById("res").innerHTML=a.toLowerCase();
        }
        document.getElementById("txt").value=""
    }

    render(){
        return(
            <>
              <p>enter trxt</p>
             <input type ="text" id="txt"/>
             <h2 id = "res">output</h2>

             <button type ="submit" value="uppercase" id ="uppercase"
             onClick={this.uppercase}>
             convert to uppercase</button>
             
             <button type ="submit" value="uppercase" id ="uppercase"
             onClick={this.lowercase}>
             convert to lowercasecase</button>
            
            
            </>
        )
    }

    }