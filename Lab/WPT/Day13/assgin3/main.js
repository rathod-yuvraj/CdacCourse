import express from 'express'
let app = express()
import path from "path"
// import bodyParser from 'body-parser';
app.use(bodyParser.urlencoded({ extended: true }));

app.set('views', './views');//  template different 
app.set('view engine', 'hbs');

app.listen(3030);
app.use(bodyParser.json());

// validation  get invoked 
app.use((req, res, next) => {
    req.data = "from use";  // set a custom property
    next();
});

// app.use((req, res, next) => {
//     console.log('Time:', Date.now())

//     // validate   user pass 
//     req.data = "from use";

//     // req.set('data', "from use");  // add data in req 
//     next()  /// pass the control to next method 
// })

// app.get("/about", (req, res) => {
//     console.log('about');
//     // req.set('data', "from use");
//     if (req.body.data) {

// console.log("my req.body.data get!");
//     } else {

//     }  
//     res.render("aboutus")
// })
app.get("/about", (req, res) => {
    if (req.data) {
        console.log("my req.data get!");
    }
    res.render("aboutus");
});









app.get("/Calc", (req, res) => {
    res.render("Calc")
})

import bodyParser from 'body-parser'
app.use(bodyParser.urlencoded({ extended: true }));

//   Object --- []
//user { id :  , name ,  skills [c++ , html , jquery ] }  

app.post("/docalculation", (req, res) => {

    //req.body
    let n1 = req.body.num1
    let n2 = req.body.num2
    // json 
    let sum = parseInt(n1) + parseInt(n2)
    res.render("calc", { result: sum })
})


app.get("/maths", (req, res) => {
    res.render("mathstable")
})

app.post("/generate-table", (req, res) => {
    let n1 = req.body.num1
    let arr = []
    for (var i = 0; i <= 10; i++) {
        arr[i] = `${n1}*${i}=${n1 * i}`
    }
    res.render("mathstable", { rowdata: arr })
})










