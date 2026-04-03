/*sintaxe de função :definição

def       nome          parametros        tipo de retorno
function multiplicar(n1:tipo1, n2:tipo2): tipo3{
    return n1 * n2;
}     retorno da função

*/

function multiplicar(n1: number, n2:number): number{
    return n1 * n2;
}

function divisaoDeDoisNumerosERetorna(n1: number, n2:number){
    return n1 / n2;
}

console.log(multiplicar(3, 2))

console.log(divisaoDeDoisNumerosERetorna(6,8))

//---------------------------------------------------------
//Funções anônimas

let resto = function(n1: number, n2: number){
    return n1 % n2
}
console.log(resto(64,4))

// ---------------------------------------------
//Array Function
let rest = (resto: number) =>{ return resto * 2}

console.log(rest(resto(64,5)))