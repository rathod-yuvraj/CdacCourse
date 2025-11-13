//  accept 2 numbers from user 
//   and perform multiplication 
  
//   using promise concept perform multiplication if both number 
//   are positive else reject the promise 




let myPromise = new Promise(function(myResolve, myReject) {
// "Producing Code" (May take some time)
  myResolve( );
  myReject();  // when error
});

myPromise.then(
  function(value) {
     /* code if successful */ 
    function mult(a,b){
    let result =a*b;
    console.log("multiplication: "+ result)
}

let a=process.argv[2];
let b=process.argv[3];
// Process.arvg[3];
mult(a,b);
    
    },
  function(error) {
    
    /* code if some error */

}
);
