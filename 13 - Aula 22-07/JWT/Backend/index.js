const express = require('express');
const cors = require('cors');
const jwt = require('jsonwebtoken');

const app = express();
app.use(cors());
app.use(express.json());

const segredo = 'abc';

app.post('/', (req,res) => {
    const {nome} = req.body;
    const token = jwt.sign({nome}, segredo, {expiresIn:'1h'});
    res.status(200).json(token);
});
app.get('/', (req,res)=> {

    const headers = req.headers.authorization;
    const token = headers.split(' ')[1];

    try {
        const validarToken = jwt.verify(token, segredo);
        res.status(200).json({mensagem:'Autenticado o nome informado é: '+ validarToken.nome})
    } catch (error) {
        res.status(400).json({mensagem:'Falha ' + error})
        
    }
})
app.listen(8080)