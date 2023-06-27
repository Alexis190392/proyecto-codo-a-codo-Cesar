// Realizar una solicitud GET al endpoint /list del controlador
fetch('/list')
  .then((response) => response.json())
  .then((comentarios) => {
    const comentariosContainer = document.getElementById(
      'comentariosContainer'
    );

    // Generar el contenido del carousel con los comentarios recibidos
    comentarios.forEach((comentario, index) => {
      const carouselItem = document.createElement('div');
      carouselItem.classList.add('carousel-item');
      if (index === 0) {
        carouselItem.classList.add('active');
      }

      const h5 = document.createElement('h3');
      h5.textContent = comentario.comentarios;

      const p = document.createElement('h6');
      p.textContent = comentario.nombreCompleto;

      carouselItem.appendChild(h5);
      carouselItem.appendChild(p);
      comentariosContainer.appendChild(carouselItem);
    });
  })
  .catch((error) => console.error('Error al obtener los comentarios:', error));