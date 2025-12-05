const http = require('http');
const url = require('url');
const fs = require('fs');
const path = require('path');

const templatePath = path.join(__dirname, 'template.html');

const server = http.createServer((req, res) => {
  const queryObject = url.parse(req.url, true).query;
  const fName = queryObject.fName || 'Guest';


  fs.readFile(templatePath, 'utf8', (err, data) => {
    if (err) {
      res.writeHead(500, {'Content-Type': 'text/plain'});
      res.end('Server Error');
      return;
    }

    
    const html = data.replace('{{fName}}', fName);

  
    res.writeHead(200, {'Content-Type': 'text/html'});
    res.end(html);
  });
});

server.listen(8080, () => {
  console.log('Server running at http://localhost:8080');
});
