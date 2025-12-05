const express = require('express');
const path = require('path');
const app = express();

app.use(express.urlencoded({ extended: false }));
app.use(express.json()); // to parse JSON bodies

// GET request to serve aboutus.html
app.get('/users/aboutus', (req, res) => {
    res.sendFile(path.join(__dirname, 'aboutus.html'));
});

// POST request example
app.post('/users/aboutus', (req, res) => {
    res.send('POST request received on /users/aboutus');
});

// PUT request to update resource at /users/aboutus
app.put('/users/aboutus', (req, res) => {
    // Here you would process update data,
    // e.g., req.body might have info to update
    console.log('PUT request data:', req.body);

    // Perform your update logic here (e.g. update database or in-memory object)

    res.send('PUT request handled - data updated');
});

app.listen(3000, () => {
    console.log('Server running on port 3000');
});
