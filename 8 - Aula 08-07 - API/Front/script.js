let produtos = [];

fetch("http://localhost:3000/produtos")
.then(res => res.json())
.then(p => {
    produtos=p;
    renderizarTabela();
});

let renderizarTabela = () => {
    let tabela = document.getElementById("tabela");

    tabela.innerHTML = "";

    for(let i=0; i<produtos.length; i++){
        let linha = tabela.insertRow(-1);

        let colunaId = linha.insertCell(0);
        let colunaNome = linha.insertCell(1);
        let colunaMarca = linha.insertCell(2);
        let colunaValor = linha.insertCell(3);
        let colunaSelecionar = linha.insertCell(4);

        colunaId.innerText = produtos[i].id
        colunaNome.innerText = produtos[i].Nome
        colunaMarca.innerText = produtos[i].Marca
        colunaValor.innerText = produtos[i].Valor
        colunaSelecionar.innerHTML= `<button onclick="selecionar(${i})" class="btn btn-primary">Selecionar</button>`;
    }
}
const cadastrar = () => {
    let nome = document.getElementById("nome");
    let marca = document.getElementById("marca");
    let valor = document.getElementById("valor");

    let obj = {
        "Nome":nome.value,
        "Marca":marca.value,
        "Valor":parseFloat(valor.value)
    }
    fetch("http://localhost:3000/produtos", 
        {
            method:"POST",
            body:JSON.stringify(obj),
            headers:{"Content-Type":"application/json"}
        }
    )
    .then(res => res.json())
    .then(p => {
        produtos.push(p)

        let i = produtos.length -1;

        let tabela = document.getElementById("tabela");
         
        let linha = tabela.insertRow(-1);

        let colunaId = linha.insertCell(0);
        let colunaNome = linha.insertCell(1);
        let colunaMarca = linha.insertCell(2);
        let colunaValor = linha.insertCell(3);
        let colunaSelecionar = linha.insertCell(4);

        colunaId.innerText = p.id;
        colunaNome.innerText = p.Nome;
        colunaMarca.innerText = p.Marca;
        colunaValor.innerText = p.Valor;
        colunaSelecionar.innerHTML= `<button onclick="selecionar(${i})" class="btn btn-primary">Selecionar</button>`;

        nome.value = "";
        marca.value = "";
        valor.value = "";

        nome.focus();
    })
}
const selecionar = (i) => {
    
    let id = document.getElementById("id");
    let nome = document.getElementById("nome");
    let marca = document.getElementById("marca");
    let valor = document.getElementById("valor");
    let btnCadastrar = document.getElementById("btnCadastrar");
    let btnAlterar = document.getElementById("btnAlterar");
    let btnRemover = document.getElementById("btnRemover");
    let btnCancelar = document.getElementById("btnCancelar");

    let obj = produtos[i]

    id.value = obj.id;
    nome.value = obj.Nome;
    marca.value = obj.Marca;
    valor.value = obj.Valor;

    btnCadastrar.style.display = "none";
    btnAlterar.style.display = "inline-block";
    btnRemover.style.display = "inline-block";
    btnCancelar.style.display = "inline-block";

    nome.focus();
}
const cancelar = () => {
    
    let id = document.getElementById("id");
    let nome = document.getElementById("nome");
    let marca = document.getElementById("marca");
    let valor = document.getElementById("valor");
    let btnCadastrar = document.getElementById("btnCadastrar");
    let btnAlterar = document.getElementById("btnAlterar");
    let btnRemover = document.getElementById("btnRemover");
    let btnCancelar = document.getElementById("btnCancelar");

    id.value = "";
    nome.value = "";
    marca.value = "";
    valor.value = "";

    btnCadastrar.style.display = "inline-block";
    btnAlterar.style.display = "none";
    btnRemover.style.display = "none";
    btnCancelar.style.display = "none";

    nome.focus();
}
const alterar = () => {
    let id = document.getElementById("id")
    let nome = document.getElementById("nome");
    let marca = document.getElementById("marca");
    let valor = document.getElementById("valor");

    let obj = {
        "Nome":nome.value,
        "Marca":marca.value,
        "Valor":parseFloat(valor.value)
    }
    fetch(`http://localhost:3000/produtos/${id.value}`, 
        {
            method:"PUT",
            body:JSON.stringify(obj),
            headers:{"Content-Type":"application/json"}
        }
    )
    .then(res => res.json())
    .then(p => {
        let i = produtos.findIndex(produto => produto.id == p.id);

        produtos[i] = p;
        
        renderizarTabela();

        id.value = "";
        nome.value = "";
        marca.value = "";
        valor.value = "";

        nome.focus();
    })
}
const remover = () => {
    let id = document.getElementById("id")

    fetch(`http://localhost:3000/produtos/${id.value}`, 
        {
            method:"DELETE",
            headers:{"Content-Type":"application/json"}
        }
    )
    .then(res => res.json())
    .then(p => {
        let i = produtos.findIndex(produto => produto.id == p.id);

        produtos.splice(i, 1);
        
        renderizarTabela();

        id.value = "";
        nome.value = "";
        marca.value = "";
        valor.value = "";

        nome.focus();
    })
}