'use strict'

window.addEventListener('load', function(){

    var boton = document.querySelector("#btnOk");
    var boton2 = document.querySelector("#btnOke")
    
    function cambiarColor(){
        var bg = boton.style.background;
        if(bg == "green"){
            boton.style.background = "red"
        }else{
            boton.style.background = "green"
        }
        boton.style.padding = "10px";
        boton.style.border = "1px solid #ccc";
    
        return true;
    }
    
    //click
    boton2.addEventListener('click', function(){
        cambiarColor();
    });
    
    //mouse over
    boton.addEventListener('mouseover', function(){
        boton2.style.background = "#ccc";
        boton2.style.color = "black";
    });
    
    //mouse out
    boton.addEventListener('mouseout', function(){
        boton2.style.background = "black";
        boton2.style.color = "white";
    });
    
    //focus
    var input = document.querySelector("#campoNombre");
    input.addEventListener('focus', function(){
        console.log("[focus] Dentro del input");
    });
    
    //blur
    input.addEventListener('blur', function(){
        console.log("[blur] Fuera del input");
    });
    
    //keydown
    input.addEventListener('keydown', function(){
        console.log("[keydown] Tecla pulsando: " + String.fromCharCode(event.keyCode));
    });
    
    //keypress
    input.addEventListener('keypress', function(){
        console.log("[keypress] Tecla presionada: " + String.fromCharCode(event.keyCode));
    });
    
    //keyup
    input.addEventListener('keyup', function(){
        console.log("[keyup] Tecla levantada: " + String.fromCharCode(event.keyCode));
    });
    
});//final de load


