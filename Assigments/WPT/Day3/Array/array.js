


function array(a)
{
    let n=10;
    console.log("Display the Array:");
    for (let i=0;i<n;i++){
        a[i]
    }
    console.log(a);

}

function sorting(a) {
    a.sort((a,b)=>a-b);
    return a[a.length-2];
    
}
//array(a)
var a=[89,78,23,99,34,56,77,14];
console.log(sorting(a));