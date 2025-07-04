
document.addEventListener("DOMContentLoaded",function(){
  document.getElementById('formVeiculo').addEventListener('submit', async function(e) {
  e.preventDefault();

  const formData = new FormData(this);
  const dadosVeiculo = Object.fromEntries(formData.entries());

  const resposta = await fetch('http://localhost:8082/veiculos', {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(dadosVeiculo)
  });

  if (resposta.ok) {
    alert('Veículo atualizado com sucesso!');
    this.reset();
  } else {
    alert('Erro ao atualizar o veículo.');
  }
})
})



