const express = require('express');
const cors = require('cors');
const fileupload = require('express-fileupload');
const path = require('path');

const app = express();

app.use(cors());
app.use(fileupload());

app.post('/', (req, res) => {
    const arquivo = req.files.arquivo;
    const destino = path.join(__dirname, 'uploads', arquivo.name);
    arquivo.mv(destino);
    res.status(200).json({mensagem: 'Upload realizado com sucesso'})
});

app.listen(8080);