function showData() {
    let request = new XMLHttpRequest();
    request.open("GET", "https://jsonplaceholder.typicode.com/posts");
    request.send();

    request.onload = function () {
        if (this.status === 200) {
            let data = JSON.parse(this.responseText);
            let table = document.getElementById("t1");

            data.forEach(item => {
                let row = table.insertRow();
                let cell1 = row.insertCell(0);
                let cell2 = row.insertCell(1);
                cell1.innerText = item.id;
                cell2.innerText = item.title;
            });
        }
    };
}

window.onload = showData;
