
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