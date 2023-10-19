document.getElementById('desplegablePM-toggle').addEventListener('click', function () {
    var dropdownMenu = document.getElementById('desplegablePM-menu');
    dropdownMenu.classList.toggle('desplegablePM-open');
});

// Escuchar clics en las casillas de verificación
var checkboxes = document.querySelectorAll('.checkbox-itemMP');
checkboxes.forEach(function (checkbox) {
    checkbox.addEventListener('click', function () {
        var listItem = this.parentElement;
        listItem.classList.toggle('checkeado'); // Agregar o quitar la clase 'checked'
    });
});
