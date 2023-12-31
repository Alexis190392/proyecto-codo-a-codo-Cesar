// Obtener los elementos del DOM
const nombreInput = document.getElementById('nombre');
const apellidoInput = document.getElementById('apellido');
const correoInput = document.getElementById('correo');
const cantidadInput = document.getElementById('cantidad');
const categoriaSelect = document.getElementById('categoria');
const resumenBtn = document.getElementById('resumenBtn');
const totalAPagarInput = document.getElementById("total-a-pagar");
const totalPagoModal = document.getElementById("total-pago-modal");

// detectar cambios en los campos
nombreInput.addEventListener('input', verificarCamposCompletos);
apellidoInput.addEventListener('input', verificarCamposCompletos);
correoInput.addEventListener('input', verificarCamposCompletos);
cantidadInput.addEventListener('input', verificarCamposCompletos);
categoriaSelect.addEventListener('change', verificarCamposCompletos);

// verificar si todos los campos están completos y habilitar el botón resumen
function verificarCamposCompletos() {
  const nombreValue = nombreInput.value.trim();
  const apellidoValue = apellidoInput.value.trim();
  const correoValue = correoInput.value.trim();
  const cantidadValue = cantidadInput.value.trim();
  const categoriaValue = categoriaSelect.value.trim();

  if (
      nombreValue !== '' &&
      apellidoValue !== '' &&
      correoValue !== '' &&
      cantidadValue !== '' &&
      categoriaValue !== ''
    ) {
      if (cantidadValue > 0) {
        resumenBtn.disabled = false; // Habilitar el botón de resumen
      }
    } else {
      resumenBtn.disabled = true; // Deshabilitar el botón de resumen
    }
}

cantidadInput.addEventListener("input", calcularTotalAPagar);
categoriaSelect.addEventListener("change", calcularTotalAPagar);

function calcularTotalAPagar() {
  // Obtener los valores de cantidad y categoría
  const cantidad = parseFloat(cantidadInput.value);
  const categoria = categoriaSelect.value;

  let totalAPagar = 0;

  if (!isNaN(cantidad) && categoria) {
    if (categoria === "estudiante") {
      totalAPagar = cantidad * 200 * 0.2;
    } else if (categoria === "trainee") {
      totalAPagar = cantidad * 200 * 0.5;
    } else if (categoria === "junior") {
      totalAPagar = cantidad * 200 * 0.85;
    }
  }

  // Mostrar el resultado en el campo "Total a Pagar"
  totalAPagarInput.value = `Total a Pagar: $${totalAPagar.toFixed(2)}`;
  // Mostrar el resultado dentro de la ventana modal
  totalPagoModal.textContent = `Total a pagar: $${totalAPagar.toFixed(2)}`;
}
