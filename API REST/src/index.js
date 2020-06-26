const express = require('express');
const app = express(); 

//settings
var port = process.env.PORT || 3000;


//middlewares
app.use(express.json());
app.use((req, res, next) => {
    res.header('Access-Control-Allow-Origin', '*');
    res.header('Access-Control-Allow-Headers', 'Authorization, X-API-KEY, Origin, X-Requested-With, Content-Type, Accept, Access-Control-Allow-Request-Method');
    res.header('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, DELETE');
    res.header('Allow', 'GET, POST, OPTIONS, PUT, DELETE');
    next();
});

//routes
app.use(require('./routes/hoteles'));


var server = app.listen(port, function() {
    console.log("server started at "+ port);
  });
  server.timeout = 1000;
  