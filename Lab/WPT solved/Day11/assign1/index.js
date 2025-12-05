const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
  // Parse the URL and get query parameters
  const queryObject = url.parse(req.url, true).query;

  const fName = queryObject.fName || 'Guest'; // Default to 'Guest' if fName is not provided

  // Prepare HTML response
  const html = `
    <!DOCTYPE html>
    <html>
    <head><title>Greeting</title></head>
    <body>
      <h1>Hello ${fName}</h1>
    </body>
    </html>
  `;

  // Set response headers
  res.writeHead(200, {'Content-Type': 'text/html'});
  res.end(html);
});

server.listen(8080, () => {
  console.log('Server running at http://localhost:8080');
});
