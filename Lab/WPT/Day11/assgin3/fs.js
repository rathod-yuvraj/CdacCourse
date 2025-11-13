// Try File Handling Write and Read data synchronous method 
//    and try asynchronous method 
const fs= require('fs');

fs.writeFile('yuvraj.txt','yuvraj rathod PRN 0064',(err)=>{
    console.log("this the my file created some Error for createing File!");
});



