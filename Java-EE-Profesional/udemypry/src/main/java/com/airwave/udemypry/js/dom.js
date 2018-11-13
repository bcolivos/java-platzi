'use strict'

function cambiaColor(color){
    ejemplo.style.background = color;    
}


var ejemplo = document.getElementById("divDomEjemplo");
//console.log(ejemplo);
//var ejemplo1 = document.getElementById("divDomEjemplo").innerHTML;
//console.log(ejemplo1);
ejemplo.innerHTML = "DOM/ div desde JS";
ejemplo.style.background = "red";
ejemplo.style.padding = "20px";
ejemplo.style.color = "white";

//ejemplo.class = "hola";
ejemplo.className = "hola2";
//console.log(ejemplo);

//Query Selector
//dentro del parametro:
//sin nada para seleccionar una etiqueta, ej: divDom
//Con # para seleccionar un id ej: #divDom
//Con . para seleccionar una clase ej: .divDom
var ejemploQuerySelector = document.querySelector("#divDomEjemplo");
//console.log(ejemploQuerySelector);
//ejemploQuerySelector.style.background = "blue";

//Conseguir elementos por su etiqueta
var todosLosDivs = document.getElementsByTagName('div');//array de div's, HTMLCollection
var contenidoDiv2 = todosLosDivs[2];
//console.log(todosLosDivs);
//console.log(contenidoDiv2);
contenidoDiv2.innerHTML = "Nuevo texto";

//append = añade despues
//prepend = añade antes

var seccion = document.querySelector("#miSeccion");
var valor;
for(valor in todosLosDivs){
    if(typeof todosLosDivs[valor].textContent == 'string'){
        var parrafo = document.createElement("p");
        var texto = document.createTextNode(todosLosDivs[valor].textContent);
        /*parrafo.appendChild(texto);        
        //parrafo.prepend(texto);
        document.querySelector("#miSeccion").appendChild(parrafo);  */
        parrafo.append(texto);
        seccion.append(parrafo);
    }
} 

//Conseguir elementos por su clase css
var divRojos = document.getElementsByClassName('rojo');
console.log(divRojos);
divRojos[0].style.background = "red";

//varios elementos con for - revisar querySelectorAll
/*var div;
for(div in divRojos){
    if(divRojos[div].className = "rojo"){
        //el error se produce porque luego de iterar los divs con classname = rojo
        //el siguiente itera un 2 que es la cantidad de valores dentro del arreglo
        //este 2 no tiene classnanme por eso falla en el if
        divRojos[div].style.background = "green";
    }
}*/

//query selector solo saca 1 elemento del html
//querySelectorAll - investigar

var allDivs = document.querySelectorAll("div");     //node list
console.log(allDivs);
var allDivsRojos = document.querySelectorAll("div.rojo");
console.log(allDivsRojos);

//nodelist
var parent = document.getElementById('divNodeListEjemplo');
var childNodes = parent.childNodes;
console.log(childNodes);
console.log(childNodes.length);
parent.appendChild(document.createElement('div'));
console.log(childNodes.length);
