'use strict'

// Transformacion de textos

var numero = 444;
var texto = "texto ejemplo";
var texto2 = "texto 2";

var numString = numero.toString();
var textoMayus = texto.toUpperCase();
var textoMinus = texto.toLowerCase();
var textLenght = texto.length;

var textoConcat = texto + " " +  texto2;
var textoConcat2 = texto.concat(" " + texto2);

//BUSQUEDA

//devuelve la primera coincidencia en el indice del texto (ej: resul = 6)
var textoBusqueda = texto.indexOf("ejemplo");

//lo mismo pero con la ultima aparicion de la palabra (ej: resul = 20)
var textoNuevo = "texto ejemplo texto ejemplo";
var textoBusquedaLast = textoNuevo.lastIndexOf("ejemplo");

//resul = 6
var searchTexto = texto.search("ejemplo");

//match devuelve un array de los resultados que encuentre
//este ejemplo solo busca la primera coincidencia
var matchTexto = textoNuevo.match("ejemplo");
console.log(matchTexto);

//con la expresion regular si devuelve la cantidad de coincidencias en un array
var matchTexto2 = textoNuevo.match(/ejemplo/g);
console.log(matchTexto2);

//saca los caracteres indicados en la funcion por sus parametros
//parametro 1 = 6   indice desde donde se cortara el string
//parametro 2 = 7   cantidad de caracteres a guardar
var substrTexto = texto.substr(6, 7);
console.log(substrTexto);

//sacar una letra segun su indice
var charAtTexto = texto.charAt(6);
console.log(charAtTexto);

//devuelve true o false segun el parametro definido segun el inicio del str
var startsWhithTexto = texto.startsWith("te");
console.log(startsWhithTexto);

//lo mismo pero al final del string
var endsWithTexto = texto.endsWith("plo");
console.log(endsWithTexto);

//busca la palabra exacta
var includesTexto = texto.includes("ejemplo");
console.log(includesTexto);

//REEMPLAZAR CORTAR ETC

//reemplazar texto del para1 por el para2
var replaceTexto = texto.replace("ejemplo", "EJEMPLO!");

//cortar el texto a partir del indice indicado
var sliceTexto = texto.slice(6,9);

//split recortar una palabra y meterla en un array
var splitTexto = texto.split();     //resul = array con "texto ejemplo"
console.log(splitTexto);
var splitTexto2 = texto.split(" "); //resul = array en 0 texto y en 1 ejemplo
console.log(splitTexto2);

//trim: quitar espacios por delante y por detras del texto
var trimTexto = texto.trim();











