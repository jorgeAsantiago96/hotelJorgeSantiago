/*app.post('/reservacion', (req, res) =>{ 
    const sql = 'Insert into Reservacion SET ?';
    var form = {
        Usuario: req.body.Usuario,
        tipoHabitacion: req.body.tipoHabitacion, 
        fechaLlegada: req.body.fechaLlegada, 
        fechaSalida: req.body.fechaSalida,
        personas: req.body.personas,
        precio: req.body.precio
    }                              
    //const { Usuario, tipoHabitacion, fechaLlegada, fechaSalida, numPersonas, precio} = req.body;  
    //mysqlconn.query('INSERT INTO Reservacion ("Usuario", "tipoHabitacion", "FechaLlegada", "FechaSalida", "personas", "precio") VALUES (?, ?, ?, ?, ?, ?)', [ Usuario, tipoHabitacion, fechaLlegada, fechaSalida, numPersonas, precio], (err, rows, fields)=>{
    mysqlconn.query(sql, form, err =>{
        if(!err){
            res.json({
                mensaje: "reservacion correcta"
            });
        }else{
            console.log(err);
        }
    });
});*/
    //res.send("id " + id);



/*app.get('/cliente/:id',  function(req, res){
    const {id} = req.params;
    const sql = 'select * from Usuario where correo = "'+id+'"';
    mysqlconn.query(sql, (err, rows)=>{
        if(!err){
            res.json({
                mensaje: "usuario existe",
                usuario : rows[0]
            });
        }else{
            res.json({
                mensaje: "no existe el usuario " + id
            });
        }
    });
});*/
/*app.get('/habitaciones/:id', (req, res) => {
    const { id } = req.params;
    mysqlconn.query('select * from Habitacion where numeroHab = ?', [id], (err, rows, fields)=>{
        if(!err){
            res.json(rows[0]);
        }else{
            console.log(err);
        }
    });
});*/

//router.post('/reservacion', function(req, res) {
//});

/*app.get('/habitaciones', async (req, res) => {
    await mysqlconn.query('select * from Habitacion', (err, rows, fields)=>{
        if(!err){
            res.json(rows);
        }else{
            console.log(err);
        }
    });
});*/

//const mysqlconn = require('../db');

///////////////////////////////////////////////////

/*var db_config = {
    host: 'us-cdbr-east-05.cleardb.net',
    user: 'bbcf79d92031a5',
    password: 'a89abcdf',
    database: 'heroku_a2c7d6bfb235681'
};*/

/*mysqlconn.connect(function (err){
    if(err){
        console.log(err);
        return;
    }else{
        console.log('conexion correcta');
    }
});
var connection;

function handleDisconnect() {
    connection = mysql.createConnection(db_config); // Recreate the connection, since
                                                    // the old one cannot be reused.
  
    connection.connect(function(err) {              // The server is either down
      if(err) {                                     // or restarting (takes a while sometimes).
        console.log('error when connecting to db:', err);
        setTimeout(handleDisconnect, 2000); // We introduce a delay before attempting to reconnect,
      }                                     // to avoid a hot loop, and to allow our node script to
    });                                     // process asynchronous requests in the meantime.
                                            // If you're also serving http, display a 503 error.
    connection.on('error', function(err) {
      console.log('db error', err);
      if(err.code === 'PROTOCOL_CONNECTION_LOST') { // Connection to the MySQL server is usually
        handleDisconnect();                         // lost due to either server restart, or a
      } else {                                      // connnection idle timeout (the wait_timeout
        throw err;                                  // server variable configures this)
      }
    });
  }
  
  handleDisconnect();
*/

/*const mysqlconn = mysql.createConnection({
    host: 'us-cdbr-east-05.cleardb.net',
    user: 'bbcf79d92031a5',
    password: 'a89abcdf',
    database: 'heroku_a2c7d6bfb235681'
});*/
//////////////////////////////
//starting the server
/*app.listen(app.get('port'), ()=>{
    console.log("server ready");
});*/
////////////////////////
//app.set('port', process.env.PORT || 3000);
//a