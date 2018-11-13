'use strict'

//los ejemplos eran de usar if anidados y demas operadores condicionales
//operadores <, >, ==, !=, <=, >=
//AND &&, OR ||, Negacion !

var edad1 = 30;
var edad2 = 20;

if(edad1 > edad2){
    console.log("e1 > e2");
}else{
    console.log("e1 < e2");
}

//switch

var n = 18;

switch(n){
    case 18:
        console.log("18 = 18");
        break;
    case 25:
        console.log("18 < 25");
        break;
    case 17:
        console.log("18 > 17");
        break;
    default:
        console.log("default switch");
        break;
}