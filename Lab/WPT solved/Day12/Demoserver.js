const express = require('express');
const data = require('./MOCK_DATA.json');
const app = express();
const port = 3000;


app.use(express.json());

app.get('/', (req, res) => {
    res.send("Hello From Express");
});

app.get('/sai', (req, res) => {
    res.send("Sairaj is my brother !!");
});

app.get('/yuvraj', (req, res) => {
    res.json(data);
});

app.get('/users', (req, res) => {
    res.json(data);
});

app.get('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const d = data.find(d => d.id === id);
    if (!d) {
        return res.status(404).send('User not found');
    }
    return res.json(d);
});


app.post('/yuvraj/:id', (req, res) => {
    const id = Number(req.params.id);
    const da = data.find(da => da.id === id);
    if (!da) {
        return res.status(404).send('User not found');
    }
    return res.json(da);
});


app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const userIndex = data.findIndex(user => user.id === id);
    if (userIndex === -1) {
        return res.status(404).send('User not found');
    }
    const [deletedItem] = data.splice(userIndex, 1);
    return res.status(200).json({ message: "User deleted", user: deletedItem });
});

app.listen(port);
