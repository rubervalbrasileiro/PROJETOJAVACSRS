document.addEventListener("DOMContentLoaded", function () {
  const form = document.querySelector("form");
  
  form.addEventListener("submit", function (event) {
      event.preventDefault(); // Evita o envio automático do formulário

      let nome = document.querySelector("#nome").value.trim();
      let email = document.querySelector("#email").value.trim();
      let cpf = document.querySelector("#cpf").value.trim();

      if (nome === "" || email === "" || cpf === "") {
          alert("Por favor, preencha todos os campos obrigatórios.");
      } else {
          alert("Cadastro realizado com sucesso!");
          form.reset(); // Limpa os campos do formulário
      }
  });
});

document.addEventListener("DOMContentLoaded", function () { 
  const atualizarBtn = document.querySelector("#atualizar");
  const excluirBtn = document.querySelector("#excluir");
  const form = document.querySelector("form");

  function validarFormulario() {
    let nome = document.querySelector("#nome").value.trim();
    let email = document.querySelector("#email").value.trim();
    let cpf = document.querySelector("#cpf").value.trim();

    if (nome === "" || email === "" || cpf === "") {
      alert("Por favor, preencha todos os campos obrigatórios.");
      return false; // Impede a ação se os campos não estiverem preenchidos
    }
    return true;
  }

  // ✅ Atualizar: Mantém validação antes de limpar
  atualizarBtn.addEventListener("click", function (event) {
    event.preventDefault();
    
    if (validarFormulario()) {
      alert("Dados atualizados com sucesso!");
      form.reset(); // Limpa os campos após validação
    }
  });

  // ✅ Excluir: Agora só exclui se os campos forem preenchidos!
  excluirBtn.addEventListener("click", function (event) {
    event.preventDefault();

    if (!validarFormulario()) {
      return; // Se a validação falhar, não continua
    }

    let confirmacao = confirm("Tem certeza que deseja excluir os dados?");
    if (confirmacao) {
      alert("Dados excluídos com sucesso!");
      localStorage.clear(); // Remove os dados armazenados
      form.reset(); // Limpa os campos do formulário
    }
  });

  // ✅ Ajuste nos estilos das labels para checkbox e radio
  const labels = document.querySelectorAll(".label");
  labels.forEach(label => {
    label.style.display = "flex";
    label.style.alignItems = "center";
    label.style.gap = "10px"; // Espaço entre o checkbox e o texto
  });
});
