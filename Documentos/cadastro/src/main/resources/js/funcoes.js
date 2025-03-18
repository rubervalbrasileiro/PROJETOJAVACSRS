
document.addEventListener("DOMContentLoaded", function() {
    function setAction(action) {
        document.getElementById('clienteForm').action = action;
    }

    function limparFormulario() {
        document.getElementById("clienteForm").reset();
    }

    function setAction(action) {
        document.getElementById('clienteForm').action = action;
    }
    window.setAction = setAction;
    window.limparFormulario = limparFormulario;
});




