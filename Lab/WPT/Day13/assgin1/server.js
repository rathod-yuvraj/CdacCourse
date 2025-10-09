
const data1=require('./MOCK_DATA.json')
const express=require('express');
const f=require('fs');
const app=express();




app.get('/', (req,res)=>{

    // res.send("get data start");
    res.send(data1);
})
app.post('/user',(req,res)=>{


    res.send("server was created from app");

});


app.use(express.urlencoded({ extended: false }))

app.post('/add', (req, res) => {
    const data = req.body; 
    console.log("data " + data.email);
    // console.log("data id " + data.id);
    console.log("data frist " + data.first_name);
    console.log("data gender " + data.gender);
    data1.push(
        { data, id: data1.length + 1 });
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(data1), (err) => {
            console.log(err)
        });

    return res.json("data added ");

})









app.listen(3000);