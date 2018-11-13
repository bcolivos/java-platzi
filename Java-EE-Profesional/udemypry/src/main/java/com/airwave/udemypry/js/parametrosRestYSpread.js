'use strict'

//Parametros REST y SPREAD

function listadoElementos(elemnt1, elemnt2){
    console.log(elemnt1, elemnt2);
}
listadoElementos("x", "y");
listadoElementos("a", "b", "c", "d");

//Con ... (REST) interpreta el valor como un array
function listadoElementosRest(elemnt1, elemnt2, ...otrosElemnts){
    console.log(elemnt1, elemnt2);
    for(var i = 0; i < otrosElemnts.length; i ++){
        console.log(otrosElemnts[i]);
    }
}

listadoElementosRest("A1", "B2");
listadoElementosRest("1", "2", "3", "4", "5", "6");

var elementos = ["ele1", "ele2"];
listadoElementosRest("e1", "e2", elementos);

//Spread
//Interpreta el primer indice del arreglo elementos como primer parametro de la funcion
// y asi con los siguientes
//elementos[0] = elemnt1, elementos[1] = elemnt2
listadoElementosRest(...elementos ,"e1", "e2", "e4");