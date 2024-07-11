/*4) Calcule a complexidade, no pior caso, do fragmento de codigo abaixo:*/
    

int i , j , k , s ;
for ( i =0; i < N−1; i ++){             //  i executa N - 1 vezes
    for ( j= i +1; j < N; j ++){        //  j executa N - 1 i vezes / 2
        for ( k=1; k < j ; k++){        //  k executa N - 1 j vezes / 2
            s = 1 ;                     //  resultado pior dos casos O(n^3)
        }
    }

}

