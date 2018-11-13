'use strict'

var categorias = ["Accion", "Comedia", "Terror", "Fantasia"];
var peliculas = ["pela3", "pela1", "pela4", "pela1"];

var cine = [categorias, peliculas];
console.log(cine[0][1]);

//agregar al array
peliculas.push("pela5");
console.log(peliculas);

//eliminar el ultimo elemento del array
peliculas.pop();
console.log(peliculas);

//eliminar array por su contenido en un indice especifico
var indice = peliculas.indexOf('pela1');
console.log(indice);

if(indice > -1){
    //en base a un indice borrar tantos pasos como quiera en adelante
    peliculas.splice(indice, 1);
}
console.log(peliculas);

//convertir arrays a texto separado por comas
var peliculasToString = peliculas.join();
console.log(peliculasToString);

//convertir String a array todo lo que este separado, en este caso, por ", "
var cadena =  "texto1, texto2, texto3, texto4";
var cadenaArray = cadena.split(", ");
console.log(cadenaArray);

//ORDENAR ARRAYS

var pelas = ["El Padrino", "Coco", "Nemo", "El rey leon", "Otra Pela", "Pela 2"];

//ordenar por orden alfabetico o numerico
pelas.sort();
console.log(pelas);

//array ordenado alreves
pelas.reverse();
console.log(pelas);

//recorrer array con for in

for(let pela in pelas){
    console.log(pelas[pela]);
}

//Busquedas en un array
var busqueda = pelas.find(pela => {
    return pela == "Coco";
});

console.log(busqueda);

var busqueda = pelas.findIndex(pela => {
    return pela == "Coco";
});

console.log(busqueda);

//some muestra los valores segun la funcion condicion
var precios = [10, 50, 12, 13, 42];
var busquedaPrecios = precios.some(precio => precio <= 20);
console.log(busquedaPrecios);