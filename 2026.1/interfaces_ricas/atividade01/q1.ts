/* 1. Faça um programa TypeScript que calcule o quadrado de cada elemento do array, use as seguintes estratégias:
a. iterando com for simples
b. iterando com forEach */

//a.
let arr =  [3,5,7,3,8,9,1];

for(let i = 0; i < arr.length; i++){
    arr[i] *= arr[i];
}

console.log(arr)


//b.
let arr1 =  [3,5,7,3,8,9,1];
let arrQuadrado:number[] = [];  //definindo tipo do array

arr1.forEach((el) => arrQuadrado.push(el*el));

console.log(arrQuadrado)