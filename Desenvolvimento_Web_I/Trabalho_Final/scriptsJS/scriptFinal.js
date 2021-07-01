let name = window.localStorage.getItem('nameStorage');
let emergencyName = window.localStorage.getItem('emergencyStorage');
let localizador = window.localStorage.getItem('localizadorStorage');
let chair = window.localStorage.getItem('chairStorage');

document.getElementById('subtitleName').innerText =
  name.toUpperCase() + ', uma boa viagem!';
document.getElementById('chairSelected').innerText = chair;
document.getElementById('subtitleEmergency').innerText =
  'Caso dê algo errado na sua viagem, fique tranquilo! Avisaremos o(a) ' +
  emergencyName.toUpperCase() +
  '!';
document.getElementById('subtitleLocalizador').innerText =
  'Localizador: ' + localizador;

function goToIndex() {
  window.location.href = './index.html';
}
setTimeout(goToIndex, 10000);
