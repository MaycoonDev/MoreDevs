let pessoas = [];

const verificarCampos = (nome,cep,estado,cidade,bairro,logradouro) => {
    if (
        nome.value.trim() === "" ||
        cep.value.trim() === "" ||
        estado.value.trim() === "" ||
        cidade.value.trim() === "" ||
        bairro.value.trim() === "" ||
        logradouro.value.trim() === ""
    ) {
        return 1
    }
}

const limparCampos = () => {
    let id = document.getElementById("inputId");
    let nome = document.getElementById("inputNome");
    let cep = document.getElementById("inputCep");
    let estado = document.getElementById("inputEstado");
    let cidade = document.getElementById("inputCidade");
    let bairro = document.getElementById("inputBairro");
    let logradouro = document.getElementById("inputLogradouro");

    id.value = "";
    nome.value = "";
    cep.value = "";
    estado.value = "";
    cidade.value = "";
    bairro.value = "";
    logradouro.value = "";
}

const apiPessoas = ("http://localhost:3000/pessoas");

let renderizarTabela = () => {

    let tabela = document.getElementById("tabelaPessoas");

    tabela.innerHTML = "";
    for(let i=0; i<pessoas.length; i++){
        let linha = tabela.insertRow(-1);

        let colunaId = linha.insertCell(0);
        let colunaNome = linha.insertCell(1);
        let colunaCep = linha.insertCell(2);
        let colunaEstado = linha.insertCell(3);
        let colunaCidade = linha.insertCell(4);
        let colunaBairro = linha.insertCell(5);
        let colunaLogradouro = linha.insertCell(6);
        let colunaSelecionar = linha.insertCell(7);

        colunaId.innerText = pessoas[i].id;
        colunaNome.innerText = pessoas[i].nome;
        colunaCep.innerText = pessoas[i].cep;
        colunaEstado.innerText = pessoas[i].estado;
        colunaCidade.innerText = pessoas[i].cidade;
        colunaBairro.innerText = pessoas[i].bairro;
        colunaLogradouro.innerText = pessoas[i].logradouro;
        colunaSelecionar.innerHTML = `<button onclick='selecionar(${i})' class='btn btn-primary'>Selecionar</button>`;
    }
}

fetch(apiPessoas)
.then(res => res.json())
.then(p => {
    pessoas=p;
    renderizarTabela();
});

const buscarCep = () => {

    let cep = document.getElementById("inputCep");
    let estado = document.getElementById("inputEstado");
    let cidade = document.getElementById("inputCidade");
    let bairro = document.getElementById("inputBairro");
    let logradouro = document.getElementById("inputLogradouro");
    
    let apiCep = (`https://viacep.com.br/ws/${cep.value}/json/`);

    if(cep.value.length != 8){
        alert("cep");
        return;
    }

    fetch(apiCep)
    .then(res => {
        if(!res.ok){
            throw new Error("Erro ao buscar pelo CEP");
        }
        return res.json();
    })

    .then(data => {
      if (data.erro) {
        alert("CEP não encontrado.");
        return;
      }

      estado.value = data.estado;
      cidade.value = data.localidade;
      bairro.value = data.bairro;
      logradouro.value = data.logradouro;
})
}

const cadastrar = () => {

    let nome = document.getElementById("inputNome");
    let cep = document.getElementById("inputCep");
    let estado = document.getElementById("inputEstado");
    let cidade = document.getElementById("inputCidade");
    let bairro = document.getElementById("inputBairro");
    let logradouro = document.getElementById("inputLogradouro");
    
    if (verificarCampos(nome,cep,estado,cidade,bairro,logradouro) == 1){
        alert("Confira se todos os campos estão preenchidos.");
        return;
    }

    let obj = {
        nome: nome.value,
        cep: cep.value,
        estado: estado.value,
        cidade: cidade.value,
        bairro: bairro.value,
        logradouro: logradouro.value
    };

    fetch(apiPessoas, {
        method: "POST",
        body: JSON.stringify(obj),
        headers: { "Content-Type": "application/json" }
    })
    .then(res => res.json())
    .then(p => {
        pessoas.push(p);
        renderizarTabela();

        limparCampos();

        nome.focus();
    })
    .catch(err => {
        console.error("Erro ao cadastrar:", err);
        alert("Erro ao cadastrar pessoa.");
    });
};

const selecionar = (i) => {
    
    let id = document.getElementById("inputId")
    let nome = document.getElementById("inputNome");
    let cep = document.getElementById("inputCep");
    let estado = document.getElementById("inputEstado");
    let cidade = document.getElementById("inputCidade");
    let bairro = document.getElementById("inputBairro");
    let logradouro = document.getElementById("inputLogradouro");
    let btnCadastrar = document.getElementById("btnCadastrar");
    let btnAtualizar = document.getElementById("btnAtualizar");
    let btnDeletar = document.getElementById("btnDeletar");
    let btnCancelar = document.getElementById("btnCancelar");

    let obj = pessoas[i];

    id.value = obj.id
    nome.value = obj.nome
    cep.value = obj.cep
    estado.value = obj.estado
    cidade.value = obj.cidade
    bairro.value = obj.bairro
    logradouro.value = obj.logradouro

    btnCadastrar.style.display = "none";
    btnAtualizar.style.display = "inline-block";
    btnDeletar.style.display = "inline-block";
    btnCancelar.style.display = "inline-block";
}

const cancelar = () => {
        
    let id = document.getElementById("inputId")
    let nome = document.getElementById("inputNome");
    let cep = document.getElementById("inputCep");
    let estado = document.getElementById("inputEstado");
    let cidade = document.getElementById("inputCidade");
    let bairro = document.getElementById("inputBairro");
    let logradouro = document.getElementById("inputLogradouro");
    let btnCadastrar = document.getElementById("btnCadastrar");
    let btnAtualizar = document.getElementById("btnAtualizar");
    let btnDeletar = document.getElementById("btnDeletar");
    let btnCancelar = document.getElementById("btnCancelar");

    limparCampos();

    btnCadastrar.style.display = "inline-block";
    btnAtualizar.style.display = "none";
    btnDeletar.style.display = "none";
    btnCancelar.style.display = "none";
}

const atualizar = () => {

    let id = document.getElementById("inputId")
    let nome = document.getElementById("inputNome");
    let cep = document.getElementById("inputCep");
    let estado = document.getElementById("inputEstado");
    let cidade = document.getElementById("inputCidade");
    let bairro = document.getElementById("inputBairro");
    let logradouro = document.getElementById("inputLogradouro");

    if (verificarCampos(nome,cep,estado,cidade,bairro,logradouro) == 1){
        alert("Confira se todos os campos estão preenchidos.");
        return;
    }

    let obj = {
        nome: nome.value,
        cep: cep.value,
        estado: estado.value,
        cidade: cidade.value,
        bairro: bairro.value,
        logradouro: logradouro.value
    };

    fetch(`${apiPessoas}/${id.value}`,{
        method:"PUT",
        body: JSON.stringify(obj),
        headers: { "Content-Type": "application/json" }
    })
    .then(res => res.json())
    .then(p => {
        let i = pessoas.findIndex(pessoa => pessoa.id == p.id);

        pessoas[i] = p;

        renderizarTabela();
        limparCampos();

        nome.focus
    })
}

const deletar = () => {

    let id = document.getElementById("inputId");

    fetch(`${apiPessoas}/${id.value}`,{
        method:"DELETE",
        headers: { "Content-Type": "application/json" }
    })

    .then(res => res.json())
    .then(p => {
        let i = pessoas.findIndex(pessoa => pessoa.id == p.id);

        pessoas.splice(i, 1);

        renderizarTabela();
        limparCampos();

        nome.focus
})
}