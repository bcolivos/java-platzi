'use strict'

document.write("Ejercicio 2<br/>");

var suma = 0;
var contador = 0;

do{
    var numero = parseInt(prompt("Introduce numeros hasta que metas uno negativo", 0));
    if(isNaN(numero)){
        number = 0;
    }else if(numero >= 0){
        suma += numero;
        contador++;
    }
    console.log(suma);
    console.log(contador);
}while(numero >= 0)

document.write("resul = " + suma);