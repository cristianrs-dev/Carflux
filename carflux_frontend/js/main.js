document.addEventListener("click", function(event) {
    const modal = document.getElementById("modal")
    if (event.target.classList.contains("editar")) {
      const id = event.target.dataset.id;
     // window.location.href=`atualizarVeiculo.html?id=${id}`
      
    }
  
    if (event.target.classList.contains("apagar")) {
      const id = event.target.dataset.id;
     // alert("Apagar: " + id);
   //  window.location.replace("apagarRegistro.html");
    }
  });

