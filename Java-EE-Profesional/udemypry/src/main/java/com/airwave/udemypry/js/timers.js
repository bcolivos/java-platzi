'use strict'

window.addEventListener('load', function(){

    //timers

    function intervalo(){
        //set interval: ejecuta algo cada x tiempo(segundo parametro)
        var tiempo = setInterval(function(){          // se ejecuta acada rato
            //var tiempo = setTimeout(function(){            //se ejecuta una vez
                console.log("Set Interval ejecutado");
        
                var encabezado = document.querySelector("h1");
                if(encabezado.style.fontSize == "50px"){
                    encabezado.style.fontSize = "20px";
                }else{
                    encabezado.style.fontSize = "50px";
                }
        
            }, 750);
        return tiempo;
    }
    var tiempo = intervalo();

    //set interval: ejecuta algo cada x tiempo(segundo parametro)
    /*var tiempo = setInterval(function(){          // se ejecuta acada rato
    //var tiempo = setTimeout(function(){            //se ejecuta una vez
        console.log("Set Interval ejecutado");

        var encabezado = document.querySelector("h1");
        if(encabezado.style.fontSize == "50px"){
            encabezado.style.fontSize = "20px";
        }else{
            encabezado.style.fontSize = "50px";
        }

    }, 750);*/

    var stop = document.querySelector("#stop");
    stop.addEventListener('click', function(){
        clearInterval(tiempo);
        console.log("Set Interval detenido");
    });

    var start = document.querySelector("#start");
    start.addEventListener('click', function(){
        intervalo();
        console.log("Set Interval iniciado");
    });

});