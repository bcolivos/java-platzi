'use strict'

//fetch y peticiones a servicios/apis rest
//fetch es un sustituto del ajax, es un metodo que hace peticiones ajax

//VIDEO DE FETCH
//fetch devuelven una promesa
var divUsuarios = document.querySelector("#usuarios");
var divUserJanet = document.querySelector("#janet");
const url = "https://reqres.in";
/*var usuarios = [];


fetch('https://reqres.in/api/users?page=2')
    .then(data => data.json())
    .then(users => {
        usuarios = users.data;
        console.log(usuarios);
        usuarios.map((user, i) => {
            let nombre = document.createElement('h2');
            nombre.innerHTML = (i + 1) + ". " + user.first_name + " " + user.last_name;
            divUsuarios.appendChild(nombre);
            document.querySelector(".loading").style.display = "none";
        })
    }
);
*/

//VIDEO DE PROMESAS

//promeas una detras de otra para evitar el callback hell

getUsuarios().then(data => data.json())
    .then(users => {
        listadoUsuarios(users.data)
        return getInfo();
    })
    .then(data => {
        console.log(data);
        return getUsuarioJanet();
    })
    .then(data => data.json())
    .then(user => {
        console.log(user);
        mostrarUserJanet(user.data);
    })
    .catch(error => {
        console.log(error);
    });
    

function getUsuarios() {
    return fetch(url + '/api/users');
}

function getUsuarioJanet() {
    return fetch(url + '/api/users/2');
}

function listadoUsuarios(usuarios) {
    usuarios.map((user, i) => {
        let nombre = document.createElement('h2');
        nombre.innerHTML = (i + 1) + ". " + user.first_name + " " + user.last_name;
        divUsuarios.appendChild(nombre);
        document.querySelector(".loading").style.display = "none";
    });
}

function mostrarUserJanet(user) {
    console.log(user);
    let nombre = document.createElement('h3');
    let avatar = document.createElement('img');
    nombre.innerHTML = user.first_name + " " + user.last_name;
    avatar.src = user.avatar;
    divUserJanet.appendChild(nombre);
    divUserJanet.appendChild(avatar);
    document.querySelector("#janet .loading").style.display = "none";
}

function getInfo(){
    var profesor = {
        nombre:     "nom1",
        apellido:   "ape1"
    };

    //Crear promesa
    return new Promise((resolve, reject) => {
        var profesor_string = "";
        setTimeout(() => {
            profesor_string = JSON.stringify(profesor);
            if(typeof profesor_string != 'string' || profesor_string == ''){
                return reject('error');
            }
            return resolve(profesor_string);
        }, 3000);
        
    });
}