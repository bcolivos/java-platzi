'use strict'

//funciones anonimas:
//funcion que no tiene nombre y es almacenada en una variable
var pelicula = function(nombre){
    return "La pelicula es: " + nombre;
}
//en la consola se llama asi:
//pelicula("pela1");

//callback:
//funcion que se ejecuta dentro de otra
//funcion anonima que se pasa como paramentro en otra funcion
function suma(num1, num2){
    var sumar = num1 + num2;
    return sumar;
}

console.log(suma(1, 5));

function sumaConCallback(num1, num2, sumaYMuestra, sumaXDos){
    var sumar = num1 + num2;
    sumaYMuestra(sumar);
    sumaXDos(sumar);
    return sumar;
}

sumaConCallback(10, 20, function(dato){
    //Comportamiento de sumaYMuestra
    console.log("La suma es: " + dato);
},function(dato){
    //Comportamiento de sumaXDOS
    console.log("La suma por dos es: " + (dato * 2));
});

//funcion de flecha
//quita la palabra function y a la derecha de los parametros se pone =>
//todos los paramentros se ponen a la izquierda y a la derecha la funcion
//Lambda

sumaConCallback(50, 50, dato => {
    //Comportamiento de sumaYMuestra
    console.log("La suma es: " + dato);
},dato => {
    //Comportamiento de sumaXDOS
    console.log("La suma por dos es: " + (dato * 2));
});