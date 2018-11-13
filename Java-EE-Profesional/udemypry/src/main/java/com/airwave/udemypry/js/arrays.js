'use strict'

var nombres = ["nombre 1", "nombre 2", "nombre 3", "nombre 4", 52, true];

var lenguajes = new Array("PHP", "JavaScript", "Go", "Java", "C++");

/*console.log(nombres);
console.log(nombres[2]);
console.log(lenguajes);
console.log(lenguajes[1]);*/

console.log(nombres.length);
/*
var elemento = parseInt(prompt("Agregar elemento al array", 0));
if(elemento >= nombres.length){
    console.log("error");
}else{
    console.log(nombres[elemento]);
}*/

document.write("<h1>Lenguajes progra</h1>");
document.write("<ul>")
/*for(var i = 0; i < lenguajes.length; i++){
    document.write("<li>" + lenguajes[i] + "</li>");
}*/

//Parametro 1) elemento: de la lista a iterar: elemento
//Parametro 2) indice: indice donde esta almacenado el elemento
//Parametro 3) data: array en si 
lenguajes.forEach((elemento, indice, data) => {
    console.log(data);
    document.write("<li>"+ (indice + 1) + " - " + elemento + "</li>");
});
document.write("</ul>")
