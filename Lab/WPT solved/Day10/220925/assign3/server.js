const http=require('http');

const server = http.createServer((req, res) => {
    res.writeHead(200, {
        'Content-Type': 'text/html' 
    });
    res.end("Hello world");
});
const PORT=3000;
server.listen(PORT||8080, () => {
    if(PORT==3000){
        console.log("Server running at http://localhost:3000/");

    }
    else
        {
            console.log("Server running at http://localhost:8080/");
    }
    
    
});
