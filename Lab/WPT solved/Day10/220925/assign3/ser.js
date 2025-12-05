const http = require('http');
const ser = http.createServer((req, res) => {

    res.writeHead(200, { 
        'Content-Type': 'text/html' 
    });

    
    res.end('Hello from Node.js Server!\n');
});

ser.listen(3000);
