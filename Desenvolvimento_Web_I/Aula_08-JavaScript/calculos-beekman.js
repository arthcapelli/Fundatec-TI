console.log('------SOMA------');
function soma(numero1, numero2) {
  let calculo = numero1 + numero2;
  return calculo;
}
console.log(soma(10, 15));
console.log(soma(1.5, 1.2));

console.log('------SUBTRAÇÃO------');
function subtracao(numero1, numero2) {
  let calculo = numero1 - numero2;
  return calculo;
}
console.log(subtracao(100, 20));
console.log(subtracao(5, 0));

console.log('------MULTIPLICAÇÃO------');
function multiplicacao(numero1, numero2) {
  let calculo = numero1 * numero2;
  return calculo;
}
console.log(multiplicacao(7, 3));
console.log(multiplicacao(25, 4));

console.log('------DIVISÃO------');
function divisao(numero1, numero2) {
  let calculo = numero1 / numero2;
  return calculo;
}
console.log(divisao(2, 1));
console.log(divisao(25, 5));

console.log('------BEEKMAN------');
function potenciacao(numero1, numero2) {
  let potencia = 1;
  for (let i = 0; i < numero2; i++) {
    potencia = potencia * numero1;
  }
  return potencia;
}
console.log(potenciacao(2, 3));
console.log(potenciacao(2, 4));
console.log(potenciacao(2, 5));

console.log('-----PALAVRA INVERTIDA-----');
function deTrasPraFrente(palavra) {
  let resultado = '';
  for (let i = palavra.length - 1; i >= 0; i--) {
    resultado = resultado + palavra.charAt(i);
  }
  return resultado;
}
console.log(deTrasPraFrente('Marcelo'));
