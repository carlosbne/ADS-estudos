//percorre cada elemento do array efetuando a função definida
let mat = ['Hidrogenio', 'Helio', 'Litio', 'Berilio'];
mat.forEach ((elemento) => console.log(elemento.length));

//retorna uma nova array com o resultado da função passada para cada elemento
let mat2 = ['Hidrogenio', 'Helio', 'Litio', 'Berilio'];
console.log(mat2.map((elemento) => elemento.length));

//retorna um array com elementos que passaram na condição
let mat3 = ['Hidrogenio', 'Helio', 'Litio', 'Berilio'];
console.log(mat3.filter((elemento)=> elemento.length > 5));

//retorna o primeiro elemento que passa na condição
let mat4 = ['Hidrogenio', 'Helio', 'Litio', 'Berilio'];
console.log(mat4.find((elemento)=> elemento.length > 5));

//Every se todos passarem na condição volta com o booleano true/ se não false
let mat5 = ['Hidrogenio', 'Helio', 'Litio', 'Berilio'];
console.log(mat5.every((elemento)=> elemento.length > 5));

//Some se pelo menos um passar na condição, volta como true
let mat6 = ['Hidrogenio', 'Helio', 'Litio', 'Berilio'];
console.log(mat6.some((elemento)=> elemento.length < 5));