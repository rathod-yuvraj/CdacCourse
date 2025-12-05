const file=require('fs');

const data= file.readFile('yuvraj.txt',(err)=>{

    console.log(err);
});
const yuvraj=file.readFileSync('yuvraj.txt','utf8');


 console.log('File content:', yuvraj);

