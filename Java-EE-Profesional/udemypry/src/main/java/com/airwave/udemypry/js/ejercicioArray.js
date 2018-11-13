'use strict'

var numeros = [];

function mostrarArray(elementos, customText = ""){
    document.write("<h1>Array Content " +  customText + "</h1>");
    document.write("<ul>");
    elementos.forEach((elemento, index) => {
        document.write("<li>" + (index + 1) + ". " + elemento +  "</li>");
    });
    document.write("</ul>");
    document.write("<hr></hr>"); 
}

for(var i = 0; i < 6; i++){
    numeros.push(parseInt(prompt("Introduce un numero", 0)));
}

//mostrar array en el document
mostrarArray(numeros);
console.log("Lista almacenada: " + numeros);

//Ordenar y mostrar
numeros.sort(function(a, b){        //Esta funcion permite ordenar de manera numerica
    //return b - a;           dsc   //ya que sort ordena de manera alfabetica
    return a - b;           //asc
});
mostrarArray(numeros, "- Sort");
console.log("Lista ordenada: " + numeros);

//mostrar numeros al reves
numeros.reverse();
mostrarArray(numeros, "- Reverse");

//Contar elementos de un array
document.write("<h2>Cantidad de elementos: " + numeros.length + "</h2>");
document.write("<hr></hr>"); 

//busqueda
var busqueda = parseInt(prompt("Ingresar numero a buscar",0));
var posicion = numeros.findIndex(numero => numero == busqueda);
if(posicion && posicion != -1){
    console.log("ENCONTRADO");
    document.write("<h2>ENCONTRADO</h2>");
    document.write("<h2>Posicion de la busqueda: " + posicion + "</h2>");
    document.write("<hr></hr>"); 
}else{
    document.write("<h2>NO ENCONTRADO</h2>");
    document.write("<h2>Posicion de la busqueda: ERROR </h2>");
    document.write("<hr></hr>"); 
}
