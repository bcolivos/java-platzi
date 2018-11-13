'use strict'

//Plantillas de texto

var nombre = prompt("Ingresar nombre");
var apellidos = prompt("Ingresar apellidos");

//comillas invertidas: `` ctrl + alt + boton de llave derecha (})
var texto = `
    <h1>Hola!</h1>
    <h3>Mi nombre es: ${nombre}</h3>
    <h3>Mis apellidos es: ${apellidos}</h3>
`;

document.write(texto);