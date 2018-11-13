'use strict'

var fecha = new Date();
console.log(fecha);

var year = fecha.getFullYear(fecha);
var month = fecha.getMonth(fecha); //cuenta desde 0
var day = fecha.getDate(fecha);
var hour = fecha.getHours(fecha);

var textoHora = `
    Año:    ${year}
    Mes:    ${month}
    Dia:    ${day}
    Hora:   ${hour}
`;

console.log(textoHora);