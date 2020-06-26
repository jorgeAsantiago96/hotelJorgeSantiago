const mysql = require('mysql');

var pool = mysql.createPool({
    host: 'us-cdbr-east-05.cleardb.net',
    user: 'bbcf79d92031a5',
    password: 'a89abcdf',
    database: 'heroku_a2c7d6bfb235681'
});


module.exports = pool;