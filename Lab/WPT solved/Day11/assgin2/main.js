const parsedUrl = url.parse('/todos/1?sort=asc', true);

console.log(parsedUrl.pathname);  // "/todos/1"
console.log(parsedUrl.query);

const myURL = new URL(req.url, `http://${req.headers.host}`);
console.log(myURL.pathname);  // "/todos/1"
console.log(myURL.searchParams.get('sort'));  // "asc"
