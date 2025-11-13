const h=require('http');
var url = require('url');
const server =h.createServer
(
    function(request,response) 
    {
        let d= request.url;
        let d2=url.parse(d,true).query;
        

        response.writeHead(200,{'content-type':'text/html'});
        // console.log(request.headers);
        
        if(d2.name == 'merge' && d2.fname=='please')
        {
            response.write("<h1>" + d2.name + d2.fname + "</h1>")

        }
        
        response.end();
    
    }   
);
server.listen(8080);