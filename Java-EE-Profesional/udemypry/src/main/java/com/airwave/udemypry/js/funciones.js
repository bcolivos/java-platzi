'use strict'

// Funciones
function showText(){
    return "Inside Function";
}

console.log(showText);
console.log(showText());
var resul = showText();
console.log(resul);

//parametros
function showNumber(n1, n2, mostrar = false){       //mostrar actua como flag
    if(mostrar == false){
        console.log(n1+n2);
        return n1+n2;
    }else{
        console.log("mostrar = true");
    }
    
}

console.log(parseInt(showNumber(2,2)));

//parametros opcionales
showNumber(1, 4, true);

//funciones anidadas

function porConsola(texto){
    console.log("por consola: " + texto);
}

function porPantalla(texto){
    document.write("por pantalla: " + texto);    
}

function show(texto, mostrar = true){
    if(mostrar){
        porConsola(texto + " /true");
    }else{
        porPantalla(texto + " /false")
    }
}

show("hola");
show("adios", false);
