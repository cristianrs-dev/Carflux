
  // Função para formatar preço como moeda brasileira
  function formatarPreco(valor) {
    return parseFloat(valor).toLocaleString('pt-BR', {
      style: 'currency',
      currency: 'BRL'
    });
  }

  // Função que busca os veículos e popula a tabela
  async function carregarVeiculos() {
    try {
      const resposta = await fetch('http://localhost:8082/veiculos');
      if (!resposta.ok) {
        throw new Error('Erro ao buscar veículos.');
      }

      const veiculos = await resposta.json();
      const corpoTabela = document.querySelector('table tbody');
      corpoTabela.innerHTML = ''; // Limpa a tabela antes de adicionar os novos dados

      veiculos.forEach(veiculo => {
        const linha = document.createElement('tr');

        linha.innerHTML = `
          <td>${veiculo.codigoVeiculo}</td>
          <td>${veiculo.marca}</td>
          <td>${veiculo.ano}</td>
          <td>${veiculo.cor}</td>
          <td>${formatarPreco(veiculo.preco)}</td>
          <td><i class="fa-solid fa-pen editar"  data-id=${veiculo.codigoVeiculo}></i></td>
          <td><i class="fa-solid fa-trash-can apagar" style="color: #e00b20;" data-id=${veiculo.codigoVeiculo}></i></td>
        `;

        corpoTabela.appendChild(linha);
      });
    } catch (erro) {
      console.error(erro);
      alert('Erro ao carregar os veículos.');
    }
  }

  document.addEventListener("click", function(event) {
    if (event.target.classList.contains("editar")) {
      const id = event.target.dataset.id;
      //alert("Editar: " + id);
      window.location.replace("atualizarVeiculo.html");
    }
  
    if (event.target.classList.contains("apagar")) {
      const id = event.target.dataset.id;
     // alert("Apagar: " + id);
     window.location.replace("apagarRegistro.html");
    }
  });
  
  // Chama a função quando a página carregar
  window.addEventListener('DOMContentLoaded', carregarVeiculos);


    
  