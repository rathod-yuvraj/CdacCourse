const express=require('express')
const path=require('path')
const app=express();

app.get('/users/aboutus', (req, res) => {
    res.sendFile(path.join(__dirname, 'aboutus.html'));
});
app.listen(3000, () => {
    console.log('Server running on port 3000');
});


app.get('/yuvraj',(req,res)=>{

    res.sendFile(path.join(__dirname,'index.html'));
    
});
