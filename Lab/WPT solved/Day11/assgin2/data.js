const http = require("http");
const url = require("url");
const fs = require("fs");

// Read yuvraj.json synchronously once at startup
const yuvraj = JSON.parse(fs.readFileSync('./yuvraj.json', 'utf-8'));

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const path = parsedUrl.pathname.split("/");

  res.writeHead(200, { "Content-Type": "application/json" });

  if (path[1] === "yuvraj" && path.length === 2) {
    res.end(JSON.stringify(yuvraj));
  }
  else if (path[1] === "yuvraj" && path[2]) {
    const id = parseInt(path[2]);
    const todo = yuvraj.find(t => t.id === id);

    if (todo) {
      res.end(JSON.stringify(todo));
    } else {
      res.writeHead(404, { "Content-Type": "text/plain" });
      res.end("Todo not found");
    }
  }
});

server.listen(3000, () => {
  console.log("Server listening on port 3000");
});
