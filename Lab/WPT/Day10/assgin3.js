//  accept command line args input from user 
//  between 1 -  5 
//  if input is valid then display * pattern output 
 
//  if input is 3 then display
//  * * *
//  * *
//  *
//   if number is not other that 1 to 5 then throw the error 
//   and display error message 
function dispaly(){

    let num=3;

    for(let i=0;i<num;i++){
        for(let j=0;j<num;j++){
            console.log("*");
        }
    }
}
dispaly();