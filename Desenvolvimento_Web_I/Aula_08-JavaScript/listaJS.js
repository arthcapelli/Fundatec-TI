console.log('-----PARES-----');
function imprimePares() {
  for (let i = 1; i < 100; i++) {
    if (i % 2 == 0) {
      console.log(i);
    }
  }
}
imprimePares();

console.log('-----MÉDIA-----');
function calculaMedia(arrayNumeros) {
  let media = 0;
  let soma = 0;
  for (let i = 0; i < arrayNumeros.length; i++) {
    soma = soma + arrayNumeros[i];
  }
  media = soma / arrayNumeros.length;
  console.log(media);
}
calculaMedia([1, 2, 3, 4]);

console.log('-----MENOR NÚMERO-----');
function menorNumero(arrayNumeros) {
  let menor = 0;
  for (let i = 0; i < arrayNumeros.length; i++) {
    if (i == 0) {
      menor = arrayNumeros[i];
    } else if (arrayNumeros[i] < menor) {
      menor = arrayNumeros[i];
    }
  }
  console.log(menor);
}
menorNumero([4, 3, 2, 1]);
menorNumero([4, 1, 2, 3]);

console.log('-----MAIOR NÚMERO-----');
function maiorNumero(arrayNumeros) {
  let maior = 0;
  for (let i = 0; i < arrayNumeros.length; i++) {
    if (i == 0) {
      maior = arrayNumeros[i];
    } else if (arrayNumeros[i] > maior) {
      maior = arrayNumeros[i];
    }
  }
  console.log(maior);
}
maiorNumero([4, 3, 2, 1]);
maiorNumero([2, 1, 4, 3]);

console.log('-----PALÍNDROMO-----');
function ehPalindromo(palavra) {
  let palavraInv = deTrasPraFrente(palavra).toLowerCase();

  if (palavra.toLowerCase() === palavraInv) {
    return true;
  } else {
    return false;
  }
}
function deTrasPraFrente(palavra) {
  let palavraInvertida = '';
  for (let i = palavra.length - 1; i >= 0; i--) {
    palavraInvertida = palavraInvertida + palavra.charAt(i);
  }
  return palavraInvertida;
}
console.log(ehPalindromo('Ovo'));
console.log(ehPalindromo('Ovro'));
console.log(ehPalindromo('Renner'));
console.log(ehPalindromo('Palindromo'));

console.log('-----ARRAY INVERTIDO-----');
function inverteArray(array) {
  return array.reverse();
}
console.log(inverteArray([1, 2, 3, 4]));

console.log('-----FATORIAL-----');
function fatorial(numero) {
  let resultado = 1;
  while (numero >= 1) {
    resultado = resultado * numero;
    numero--;
  }
  return resultado;
}
console.log(fatorial(4));
console.log(fatorial(5));

console.log('-----PRIMOS-----');
function imprimeNumerosPrimos() {
  for (let i = 2; i < 20; i++) {
    let primo = 0;
    let cont = 0;
    for (let j = i - 1; j > 1; j--) {
      if (i % j === 0) {
        cont++;
        break;
      }
    }
    if (cont == 0) {
      primo = i;
      console.log(primo);
    }
  }
}
imprimeNumerosPrimos();
