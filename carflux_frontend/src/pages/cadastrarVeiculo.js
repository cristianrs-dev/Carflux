
document.addEventListener("DOMContentLoaded",function(){

  document.getElementById('formCadastrarVeiculo').addEventListener('submit', async function(e) {
  e.preventDefault();

  const formData = new FormData(this);
  const dadosVeiculo = Object.fromEntries(formData.entries());

  const resposta = await fetch('http://localhost:8082/veiculos', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(dadosVeiculo)
  });

  if (resposta.ok) {
    alert('Veículo cadastrado com sucesso!');
    this.reset();
    preencherTabelaComVeiculos()
  } else {
    alert('Erro ao cadastrar o veículo.');
  }
});

})

