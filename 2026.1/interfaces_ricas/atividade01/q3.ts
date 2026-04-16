/* 3. Faça um programa que ordene os elementos de um array. Use o método SORT
da classe Array para ordenar de forma decrescente, passando uma função arrow como parâmetro.
3.1 Escreva um teste com o array [‘carro’, ’boneco’, ’ave’, ‘lapis’] */


let arr4 = ['carro', 'boneco', 'ave', 'lapis']


let sortArray = (arr: string[]) => {
    return arr.sort((a, b) => a > b ? -1 : 1);
}

console.log(sortArray(arr4))