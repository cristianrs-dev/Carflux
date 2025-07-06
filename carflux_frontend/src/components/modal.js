
  /*modal atualizar veiculo*/
  export function closeBtnModal(){
      document.querySelector(".btn-close").addEventListener("click",function(){
        document.getElementById("modal").style.display="none"
    
  })
  }

  export function closeBtnFechar(){
     document.querySelector(".fechar").addEventListener("click",function(){
    document.getElementById("modal").style.display="none"
  })
  }
 
  export function showModal(){

   document.getElementById("modal").style.display="block"

  }

                    /*******modal cadastrar veiculo**********/

  export function showModalCadastrarVeiculo(){
    document.getElementById("modalCadastrar").style.display="block"
  }


  export function closeModalCadastrarVeiculo(){

    document.querySelector(".close-modal").addEventListener("click",function(){

        document.getElementById("modalCadastrar").style.display="none"

    })
    
  }
  export function closeBtnModalCadastrarVeiculo(){

    document.querySelector(".btn-closeModal").addEventListener("click",function(){

        document.getElementById("modalCadastrar").style.display="none"

    })
    
  }