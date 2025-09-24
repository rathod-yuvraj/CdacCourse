
const http=require('http');

const url=require('url')

const server=http.createServer((req,res)=>{
    const y=req.url;
    const r=url.parse(y,true).query;

   res.writeHead(200,{
        'content-type':'text/html'
    })
   
    res.write('<h1>'+r.name+'</h1');
   
 
    console.log(res.header);

    res.end();
});
server.listen(8080);