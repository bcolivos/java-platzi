'use strict'

//Localstorage

//Con esto verificamos si el navegador es compatible con localstorage
if(typeof(Storage) !== 'undefined'){
    console.log("Disponible")
}else{
    console.loh("No disponible")
}

//Guardar datos
localStorage.setItem("titulo", "NomTitulo");

//recuperar elemento
console.log(localStorage.getItem("titulo"));

//Guardar objetos
var user = {
    nombre: "nom",
    email:  "mail"
}
localStorage.setItem("usuario", user);  //lo almacena como object por lo que esta mal
localStorage.setItem("usuario", JSON.stringify(user));  //Forma correcta, la info viaja como jsonstring 

//recuperar objeto
console.log(localStorage.getItem("usuario"));   //incorrecto ya que trae un string
var userObj = JSON.parse(localStorage.getItem("usuario"));    //parsea a object json
console.log(userObj);

//borrar
localStorage.removeItem("usuario"); //borra 1
localStorage.clear();               //borra todo 
