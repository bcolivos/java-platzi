'use strict'

let prueba = "prueba";

//diferencia let y var
//let perimite definir variable limitando su alcance al bloque declaracion u expresion donde se esta usando
//var define una variable global o local en una funcion sin importar el ambito del bloque

console.log("Diferencia de var y let");

//ejemplo var
console.log("(Var)")
var numero = 40;            //valor 40
console.log(numero);
if(true){
    var numero = 50;        //valor 50
    console.log(numero); 
}
console.log(numero);        //valor 50

//ejemplo let
console.log("(Let)")
let texto = "Curso JS";         //valor js
console.log(texto);
if(true){
    let texto = "Curso Java";   //valor java
    console.log(texto);
}
console.log(texto);             //valor js