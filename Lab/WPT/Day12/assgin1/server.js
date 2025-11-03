const express=require('express')
const data=require('./MOCK_DATA.json')
const app=express();
const port=3000

app.get('/',(req,res)=>{
    res.send("Hello From Express");

});

app.get('/sai',(req,res)=>{
    res.send("Sairaj is my brother !!");

});
app.get('/yuvraj', (req, res) => {

    res.json(data);
});




app.get('/users', (req, res) => {

    res.json(data);
});
app.get('/users/:id',(req ,res)=>{
    const id=Number(req.params.id)
    const d=data.find(
        d=>d.id===id
    )
    return res.json(d)
    

});


app.post('/yuvraj/:id',(req,res)=>{
    const id=Number(req.params.id)


    const da=data.find(
        da=>da.id===id

    )
    if(!da){
         return res.json("Data was delete or Data is not Found ");
    }
    return res.json(da);
})
app.delete('/yuvraj/:id', (req, res) => {
    const id = Number(req.params.id); 
    
    const userIndex = data.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = data.splice(userIndex, 1);
    return res.json("Data was delete ");
});



app.listen(port);
