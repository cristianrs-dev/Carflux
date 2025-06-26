
  // Função para formatar preço como moeda brasileira
import  {formatarPreco} from "../js/utils.js";
import { listarVeiculos } from "./api/veiculo.service.js";
import { closeBtnFechar } from "./components/modal.js";
import { closeBtnModal } from "./components/modal.js";
import { showModal } from "./components/modal.js";
import { buscarVeiculoPeloId } from "./api/veiculo.service.js";

  // Função que busca os veículos e popula a tabela
  async function carregarVeiculos() {
    try {
     
      const veiculos = await listarVeiculos()
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
  
closeBtnModal()
closeBtnFechar()

document.addEventListener("click", function (event) {
  if (event.target.classList.contains("editar")) {
    const id = event.target.dataset.id
   const veiculo = buscarVeiculoPeloId(id)
   document.querySelector("#marca").value = veiculo.marca
   document.querySelector("#modelo").value = veiculo.modelo
   document.querySelector("#ano").value = veiculo.ano
   document.querySelector("#cor").value = veiculo.cor
   document.querySelector("#km").value = veiculo.km
   document.querySelector("#combustivel").value = veiculo.combustivel
   document.querySelector("#cambio").value = veiculo.cambio
   document.querySelector("#preco").value = veiculo.preco
    showModal();
  }
});

  // Chama a função quando a página carregar
  window.addEventListener('DOMContentLoaded', carregarVeiculos);


    
  