// Modulo de pago
const tipoTarjeta = document.getElementById('tipoTarjeta');
const tarjetahabiente = document.getElementById('tarjetahabiente');
const numeroTarjeta = document.getElementById('numeroTarjeta');
const documento = document.getElementById('documento');
const mes = document.getElementById('mes');
const anyo = document.getElementById('anyo');
const codigoTarjeta = document.getElementById('codigoTarjeta');

// Verificación de campos
tipoTarjeta.addEventListener('change', verificarCamposCompletosPago);
tarjetahabiente.addEventListener('input', verificarCamposCompletosPago);
numeroTarjeta.addEventListener('input', verificarCamposCompletosPago);
documento.addEventListener('input', verificarCamposCompletosPago);
mes.addEventListener('change', verificarCamposCompletosPago);
anyo.addEventListener('change', verificarCamposCompletosPago);
codigoTarjeta.addEventListener('input', verificarCamposCompletosPago);

function verificarCamposCompletosPago() {
  const tipoTarjetaPago = tipoTarjeta.value.trim();
  const tarjetahabientePago = tarjetahabiente.value.trim();
  const numeroTarjetaPago = numeroTarjeta.value.trim();
  const documentoPago = documento.value.trim();
  const mesVencimiento = mes.value.trim();
  const anoyVencimiento = anyo.value.trim();
  const codigoTarjetaPago = codigoTarjeta.value.trim();

  if (
    tipoTarjetaPago !== '' &&
    tarjetahabientePago !== '' &&
    numeroTarjetaPago !== '' &&
    documentoPago !== '' &&
    mesVencimiento !== '' &&
    anoyVencimiento !== '' &&
    codigoTarjetaPago !== ''
  ) {
    finalizarCompra.disabled = false; // Habilitar el botón de resumen
  } else {
    finalizarCompra.disabled = true; // Deshabilitar el botón de resumen
  }
}

// Enviar el formulario después de 3 segundos
function delaySubmit(event) {
    event.preventDefault();

    var myForm = document.getElementById('formTicket');
    var submitButton = myForm.querySelector('button[type="submit"]');

    submitButton.disabled = true;

    setTimeout(function() {
      myForm.submit();
    }, 1500);
  }