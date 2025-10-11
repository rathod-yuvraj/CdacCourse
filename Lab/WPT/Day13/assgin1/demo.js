const express = require('express');
const path = require('path');
const app = express();

// Middleware to parse urlencoded POST data
app.use(express.urlencoded({ extended: false }));

// GET request to display aboutus.html
app.get('/users/aboutus', (req, res) => {
    res.sendFile(path.join(__dirname, 'aboutus.html'));
});

// POST request example for /users/aboutus (if needed)
app.post('/users/aboutus', (req, res) => {
    // Process form data or any post logic here
    res.send('POST request received on /users/aboutus');
});

app.listen(3000, () => {
    console.log('Server running on port 3000');
});
