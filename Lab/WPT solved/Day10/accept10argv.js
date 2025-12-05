// Accept 10 munbers  from Command Line Args and store in array 
//   then display 
//   1) addition of even numbers only 
//   2) addition of even index numbers
//   3) addition of prime numbers 
function addition(a,b){
    console.log(a+b);

}
for(let i=3; i<11;i++){
a= parseInt(process.argv[i]);
b= parseInt(process.argv[i]);
}

// b= parseInt(process.argv[3]);
// b= process.argv[3];
// c= process.argv[4];
// d= process.argv[5];
// e= process.argv[6];
// f= process.argv[7];
// g= process.argv[8];
// h= process.argv[9];
// i= process.argv[10];
// j= process.argv[11];
// k= process.argv[12];

addition(a,b);
