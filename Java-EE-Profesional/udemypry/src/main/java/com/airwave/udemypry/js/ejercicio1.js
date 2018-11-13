'use strict'

alert("Ingresar numeros");
var n1 = Number(prompt("Ingresar numero 1"));
var n2 = Number(prompt("Ingresar numero 2"));

//isNan: funcion para saber si el numero no es un numero
//Nan: Not A Number
while(n1 <= 0 || n2 <= 0 || isNaN(n1) || isNaN(n2)){
    alert("Error");
    alert("Ingresar numeros");
    n1 = Number(prompt("Ingresar numero 1"));
    n2 = Number(prompt("Ingresar numero 2"));
}

if(n1 > n2){
    console.log(n1 + " es mayor que " + n2);
}else if(n1 < n2){
    console.log(n1 + " es menor que " + n2);
}else if(n1 == n2){
    console.log("Son iguales");
}else{
    console.log("datos no numericos");
}

