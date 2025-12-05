setInterval(clocktime,1000)

function clocktime(){
    let date=new Date();
    document.getElementById("t").innerHTML=date.toLocaleDateString();
}

 let timert=document.getElementById("timeclock");
let Sec=0;
function sectimer(){
    Sec=Sec+1;
    timert.textContent=Sec;
}
setInterval(sectimer,1000)