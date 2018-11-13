'use strict'

window.addEventListener('load', function () {
    console.log("DOM cargado");

    var formulario = document.querySelector("#formulario");
    var boxDashed = document.querySelector(".dashed");
    boxDashed.style.display = "none";

    formulario.addEventListener('submit', function () {
        console.log("submit");
        var nombre = document.querySelector("#nombre").value;
        var apellidos = document.querySelector("#apellidos").value;
        var edad = parseInt(document.querySelector("#edad").value);

        if (nombre.trim() == null || nombre.trim().length == 0) {
            alert("Nombre no valido");
            return false;
        }
        if (apellidos.trim() == null || apellidos.trim().length == 0) {
            alert("Apellidos no validos");
            return false;
        }
        if (edad == null || apellidos <= 0 || isNaN(edad)) {
            alert("Edad no valida");
            return false;
        }
        console.log(typeof edad);

        boxDashed.style.display = "block";

        var pNombre = document.querySelector("#p_nombre span");
        var pApellidos = document.querySelector("#p_apellidos span");
        var pEdad = document.querySelector("#p_edad span");

        pNombre.innerHTML = nombre;
        pApellidos.innerHTML = apellidos;
        pEdad.innerHTML = edad;

        /*var datosUser = [nombre, apellidos, edad];
        var indice;
        for(indice in datosUser){
            var parrafo = document.createElement("p");
            parrafo.append(datosUser[indice]);
            boxDashed.append(parrafo);
        }*/
    });

});