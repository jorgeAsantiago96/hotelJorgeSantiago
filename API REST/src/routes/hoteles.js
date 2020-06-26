const express = require('express')
const bodyParser = require('body-parser')
const app = express();

const pool = require('../db');

const getHabitaciones = async (req, res) => {
    const response = await pool.query('SELECT * FROM Habitacion', (err, rows, fields)=>{
        if(!err){
            res.json(rows);
        }else{
            console.log(err);
        };
});
}
app.get('/habitaciones', getHabitaciones);



const getHabitacion = async (req, res) => {
    var id = req.params.id;
    const response = await pool.query('select * from Habitacion where numeroHab = ?', [id], (err, rows, fields)=>{
        if(!err){
            res.json(rows);
        }else{
            console.log(err);
        };
});
};
app.get('/habitaciones/:id', getHabitacion);




const getCliente = async (req, res) => {
    var id = req.params.id;
    const response = await pool.query('select * from Usuario where correo = ?', [id], (err, rows, fields)=>{
        if(!err){
            res.json({
                mensaje: "usuario existe",
                usuario : rows
            });
        }else{
            console.log(err);
        };
});
};
app.get('/clientes/:id', getCliente);


const addUsuario= async (req, res) => {
    const sql = 'Insert into Usuario SET ?';
    var form = {
        usuario: req.body.usuario,
        contraseña: req.body.contraseña, 
        nombre: req.body.nombre, 
        apellido: req.body.apellido,
        correo: req.body.correo
    }  

    const response = await pool.query(sql, form, err=>{
        if(err){
            console.log(err);
        }else{
            res.json({
                mensaje: "usuario creado correctamente"
            });
        }
    });
};
app.post('/clientes', addUsuario);



const deleteCliente = async (req, res) => {
    var id = req.params.id;
    const response = await pool.query('delete from Usuario where usuario = ?', [id], (err, rows, fields)=>{
        if(!err){
            res.json({
                mensaje: "usuario eliminado correctamente",
            });
        }else{
            console.log(err);
        };
});
};
app.delete('/clientes/:id', deleteCliente);



const UpdateUsuario= async (req, res) => {
    const id = req.params.id;
    var form = {
        usuario: req.body.usuario,
        contraseña: req.body.contraseña, 
        nombre: req.body.nombre, 
        apellido: req.body.apellido,
        correo: req.body.correo
    }  

    const response = await pool.query('Update Usuario SET ? where usuario = ?', [form,id] , err=>{
        if(!err){
            res.json({
                mensaje: "Datos del usuario actualizados correctamente"
            });
        }else{
            console.log(err);
        }
    });
};
app.put('/clientes/:id', UpdateUsuario);



const getReservaciones = async (req, res) => {
    const response = await pool.query('SELECT * FROM Reservacion', (err, rows, fields)=>{
        if(!err){
            res.json(rows);
        }else{
            console.log(err);
        };
});
}
app.get('/reservaciones', getReservaciones);



const addReservacion = async (req, res) => {
    const sql = 'Insert into Reservacion SET ?';
    var form = {
        Usuario: req.body.Usuario,
        tipoHabitacion: req.body.tipoHabitacion, 
        fechaLlegada: req.body.fechaLlegada, 
        fechaSalida: req.body.fechaSalida,
        personas: req.body.personas,
        precio: req.body.precio
    }  

    const response = await pool.query(sql, form, err=>{
        res.json({
            mensaje: "reservacion correcta"
        });
    });
};
app.post('/reservaciones', addReservacion);



const deleteReservacion = async (req, res) => {
    var id = req.params.id;
    const response = await pool.query('delete from Reservacion where Usuario = ?', [id], (err, rows, fields)=>{
        if(!err){
            res.json({
                mensaje: "Reservacion eliminada correctamente",
            });
        }else{
            console.log(err);
        };
});
};
app.delete('/reservaciones/:id', deleteReservacion);


const addCompra= async (req, res) => {
    const sql = 'Insert into Compras SET ?';
    var numC = Math.floor((Math.random() * 100) + 1);
    var form = {
        numeroCompra: numC,
        UsuarioReservacion: req.body.Usuario, 
        fechacompra: req.body.fechacompra, 
        monto: req.body.monto,
    }  

    const response = await pool.query(sql, form, err=>{
        res.json({
            mensaje: "reservacion correcta"
        });
    });
};
app.post('/compras', addCompra);


const getCompras = async (req, res) => {
    const response = await pool.query('SELECT * FROM Compras', (err, rows, fields)=>{
        if(!err){
            res.json(rows);
        }else{
            console.log(err);
        };
});
}
app.get('/compras', getCompras);


app.get('/', (req, res)=>{
    res.send("True");
});


module.exports = app;