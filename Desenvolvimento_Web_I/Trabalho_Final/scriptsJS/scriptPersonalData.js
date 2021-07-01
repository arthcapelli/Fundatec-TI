let btnDados = document.getElementById('btnDados');
function validacaoDados() {
  let inputCPF = document.getElementById('cpf');
  let cpf = inputCPF.value;
  let inputName = document.getElementById('inputName');
  let name = inputName.value;
  let inputDoB = document.getElementById('inputBirthday');
  let birthday = inputDoB.value;
  let inputPhone = document.getElementById('inputPhone');
  let phone = inputPhone.value;
  let inputMale = document.getElementById('male');
  let inputFemale = document.getElementById('female');
  let inputEmergency = document.getElementById('inputEmergency');
  let emergency = inputEmergency.value;
  let inputPhoneEmergency = document.getElementById('phoneNumberEmergency');
  let emergencyPhone = inputPhoneEmergency.value;
  let errorField = document.getElementById('errorFieldData');

  let ehValido = true;

  function reset() {
    errorField.innerText = '';
    inputCPF.className = 'form-control';
    inputName.className = 'form-control uppercase';
    inputDoB.className = 'form-control';
    inputPhone.className = 'form-control';
    inputMale.className = 'form-check-input';
    inputFemale.className = 'form-check-input';
    inputEmergency.className = 'form-control uppercase';
    inputPhoneEmergency.className = 'form-control';
  }

  reset();

  if (cpf.length > 11) {
    errorField.innerText = 'CPF inválido (Mais de 11 caracteres)!';
    inputCPF.className += ' incomplete';
    ehValido = false;
  } else if (cpf.length < 11) {
    errorField.innerText = 'CPF inválido (Menos de 11 caracteres)!';
    inputCPF.className += ' incomplete';
    ehValido = false;
  } else if (name.length < 10 || name.length > 100) {
    errorField.innerText += 'Nome inválido!';
    inputName.className += ' incomplete';
    ehValido = false;
  } else if (birthday == '') {
    errorField.innerText += 'Preencha a Data de Nascimento!';
    inputDoB.className += ' incomplete';
    ehValido = false;
  } else if (phone.length != 11) {
    errorField.innerText +=
      'Telefone inválido! O número precisa ter 11 caracteres!';
    inputPhone.className += ' incomplete';
    ehValido = false;
  } else if (inputMale.checked == false && inputFemale.checked == false) {
    errorField.innerText += 'Informe um Gênero!';
    inputMale.className += ' incomplete';
    inputFemale.className += ' incomplete';
    ehValido = false;
  } else if (emergency.length < 10 || name.length > 100) {
    errorField.innerText += 'Nome do Contato de Emergência inválido!';
    inputEmergency.className += ' incomplete';
    ehValido = false;
  } else if (emergencyPhone.length != 11) {
    errorField.innerText += 'Telefone para Contato de Emergência inválido!';
    inputPhoneEmergency.className += ' incomplete';
    ehValido = false;
  }

  if (!ehValido) {
    errorField.className = 'alert alert-danger';
  } else {
    window.localStorage.setItem('nameStorage', name);
    window.localStorage.setItem('emergencyStorage', emergency);
    window.location.href = './chairs.html';
  }
}
btnDados.addEventListener('click', validacaoDados);
