import  {formatarPreco} from "../utils/utils.js"; 
import { listarVeiculos, buscarVeiculoPeloId,atualizarVeiculo,deletarVeiculo } from "../api/veiculo.service.js";
import { closeBtnModal, closeBtnFechar,closeModalCadastrarVeiculo,closeBtnModalCadastrarVeiculo,showModal, showModalCadastrarVeiculo } from "../components/modal.js";


  // Função que busca os veículos e popula a tabela
 export async function preencherTabelaComVeiculos() {
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
      alert('Erro ao carregar os veículos.',erro);
    }
  }



  //função pra cadastrar Novo veiculo
document.getElementById("btnCadastrar").addEventListener("click",function(){
  showModalCadastrarVeiculo()
})


//função para settar os campos do form editar veículo
document.addEventListener("click", async function (event) {
  if (event.target.classList.contains("editar")) {
    try {
      
      const id = event.target.dataset.id
      const veiculo = await buscarVeiculoPeloId(id)

      if(!veiculo){
        throw new Error("veículo não encontrado!")
      }

      document.querySelector("#codigoVeiculo").value = veiculo.codigoVeiculo
      document.querySelector("#marca").value = veiculo.marca
      document.querySelector("#modelo").value = veiculo.modelo
      document.querySelector("#ano").value = veiculo.ano
      document.querySelector("#cor").value = veiculo.cor
      document.querySelector("#km").value = veiculo.km
      document.querySelector("#combustivel").value = veiculo.combustivel
      document.querySelector("#cambio").value = veiculo.cambio
      document.querySelector("#preco").value = veiculo.preco

     
   //função para exibir o modal
    showModal();

    } catch (error) {
      console.log(`erro ao carregar dados ${error}`)
      alert("Não foi possível carregar os dados do veículo. Tente novamente.");
    }

  }

});

                                //Atualiar registro do veículo
document.addEventListener("click", async function(event) {
  
  if(event.target.classList.contains("salvar")){
    try {

      const form = document.querySelector("#formVeiculo")
      if(!form) throw new Error("formulário não encontrado!")

      const formData = new FormData(form)
      const dadosVeiculo = Object.fromEntries(formData.entries())

      if(!dadosVeiculo.codigoVeiculo){
        throw new Error(`${dadosVeiculo.codigoVeiculo} está vazio ou indefinido`)
      }

      const idVeiculo = parseInt(dadosVeiculo.codigoVeiculo)

      if(isNaN(idVeiculo)){
        throw new Error(`${idVeiculo} não é um número válido!`)
      }

      const resposta = await atualizarVeiculo(idVeiculo,dadosVeiculo)
      
      if(resposta.ok){
        alert("registro atualizado com sucesso!")
        
      }else{
        const erroText = await resposta.text()
        throw new Error(`erro ao salvar o registro ${resposta.status} - ${erroText}`)
      }
      
    } catch (error) {
      console.log(`erro ao buscar os dados do form ${error}`)
      alert("Erro ao salvar os dados do veículo. Verifique os campos e tente novamente.");
    }
      
    }
  
})

                             //DELETAR REGISTRO DO VEÍCULO
document.addEventListener("click", async function(event){
  if(event.target.classList.contains("apagar")){
    try {
      
      const idVeiculo = event.target.dataset.id
      if(isNaN(idVeiculo)) throw new Error("não é um valor válido")
      
    const resposta = await deletarVeiculo(idVeiculo)

    if(resposta.ok){

      alert("Registro apagado com sucesso!")
      preencherTabelaComVeiculos()
      
    }else if(resposta.status === 400){

      alert("verifique os dados do formulário")
      

    }else if(resposta.status === 404){

      alert("registro não encontrado")

    }else {
      const erroText = resposta.text()
      throw new Error(`erro ao pagar o resgitro ${resposta.status} - ${erroText}`)
    }

    } catch (error) {

      console.log(`não foi possível apagar os dados do veículo ${error}`)

    }
      
  }

})

closeBtnModal()
closeBtnFechar()
closeModalCadastrarVeiculo()
closeBtnModalCadastrarVeiculo()
  // Chama a função quando a página carregar
  window.addEventListener('DOMContentLoaded', preencherTabelaComVeiculos);


    
  