const BASE_URL = "http://localhost:8082/veiculos";

export async function listarVeiculos() {
  const resposta = await fetch(BASE_URL);
  return await resposta.json();
}

export async function cadastrarVeiculo(veiculo) {
  const resposta = await fetch(BASE_URL, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(veiculo)
  });
  return await resposta.json();
}

export async function deletarVeiculo(id) {
  return await fetch(`${BASE_URL}/${id}`, { method: "DELETE" });
}

export async function atualizarVeiculo(id, dados) {
  return await fetch(`${BASE_URL}/${id}`, {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(dados)
  });
}

export async function buscarVeiculoPeloId(id) {
  const resposta = await fetch(`${BASE_URL}/${id}`,{ method:"GET" });
  const dadosVeiculo =await resposta.json();
  console.log(dadosVeiculo)
  return dadosVeiculo
  
}
