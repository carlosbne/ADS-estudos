//Lista de elementos que normalmente são do mesmo tipo, pode ser interado
//o array sempre começa com o index 0

let arr = new Array;
let cores = ['verde, azul, vermelho' , 1, 5, 'bege']
let nums = [3, 6, 9]

cores.push(5)

arr[0] = 'zero'
console.log(arr)
console.log(typeof(cores))


/*operações array:
    Push : Add ao final do array
    Pop : Remove do final
    Shift : Add no inicio
    Unshift : Remove do inicio
    Concat : junta duas arrays
*/

//laços em array
for (let cor of cores){
    console.log(cor)
}

//for in and for each