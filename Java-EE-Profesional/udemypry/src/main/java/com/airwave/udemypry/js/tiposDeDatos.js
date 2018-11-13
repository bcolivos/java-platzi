'use strict'

//Operaciones y tipos de datos
var n1 = 7;
var n2 = 5;

console.log(n1 + n2);
console.log(n1 - n2);
console.log(n1 * n2);
console.log(n1 / n2);
console.log(n1 % n2);

var int = 22;
var string = "Text Text TexT";
var boolean = true;


//Funciones
var numFalso = "33.7";
console.log(Number(numFalso) + 7);          //puede convertir a flotante
console.log(parseInt(numFalso) + 7);        //a entero
console.log(parseFloat(numFalso) + 7);      //a flotante

console.log(String(int) + 7); 

//typeof
console.log(typeof int);
console.log(typeof string);
console.log(typeof boolean);
console.log(typeof numFalso);