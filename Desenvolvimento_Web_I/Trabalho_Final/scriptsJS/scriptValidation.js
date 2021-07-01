let btnValidation = document.getElementById('btnValidation');
function validacaoLocalizador() {
  let inputLocalizador = document.getElementById('localizador');
  let localizador = inputLocalizador.value;
  let localizadorValidos = [
    'A75HB2',
    'B56T23',
    '2MJ03J',
    '3LQ7RZ',
    'BNS981',
    'MJ765S',
    'BN78JH',
    'EUAN82',
    '28SN96',
  ];
  let ehValido = true;
  let errorField = document.getElementById('errorFieldValidation');
  function reset() {
    errorField.innerText = '';
    inputLocalizador.className = 'form-control';
  }

  reset();

  if (localizador.length < 6) {
    errorField.innerText = 'Localizador inválido!';
    inputLocalizador.className += ' incomplete';
    ehValido = false;
  } else if (!localizadorValidos.includes(localizador.toUpperCase())) {
    errorField.innerText = 'Localizador não encontrado!';
    inputLocalizador.className += ' incomplete';
    ehValido = false;
  }

  if (!ehValido) {
    errorField.className = 'alert alert-danger';
  } else {
    window.localStorage.setItem('localizadorStorage', localizador);
    window.location.href = './personalData.html';
  }
}
btnValidation.addEventListener('click', validacaoLocalizador);
