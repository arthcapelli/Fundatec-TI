let btnFinal = document.getElementById('btnFinal');
let btnChairs = document.getElementsByClassName('chair');
let cadeiraSelecionada = '';

function reset() {
  for (let i = 0; i < btnChairs.length; i++) {
    if (btnChairs[i].className.includes('btn-success')) {
      btnChairs[i].className = 'btn btn-secondary chair';
    }
  }
}

function selectChairs(eventoClick) {
  reset();

  let btnAtual = eventoClick.target;
  btnAtual.className += ' btn-success';
  cadeiraSelecionada = btnAtual.value;
  window.localStorage.setItem('chairStorage', cadeiraSelecionada);
}

function validacaoChairs() {
  let errorField = document.getElementById('errorFieldChairs');
  if (cadeiraSelecionada == '') {
    errorField.innerText =
      'Selecione seu assento, clicando sobre a cadeira desejada!';
    errorField.className = 'alert alert-danger';
  } else {
    window.location.href = './finalMsg.html';
  }
}

for (let i = 0; i < btnChairs.length; i++) {
  btnChairs[i].addEventListener('click', selectChairs);
}

btnFinal.addEventListener('click', validacaoChairs);
