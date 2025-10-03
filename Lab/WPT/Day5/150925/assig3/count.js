


let count=0;
function clkcout(){

    count=count+1;
    document.getElementById("cnt").innerHTML=count;
    if (count >= 10) {
                
                const btn = document.getElementById("clickBtn");
                btn.disabled = true;
                btn.style.backgroundColor = "#ccc";
                btn.style.cursor = "not-allowed";
            }
    console.log(count);
}