/*
5. Calcule a complexidade, no pior caso, do fragmento de codigo abaixo:*/

Listing 2: Código

    int i , j , s ;
    s = 0;
    for ( i =1; i < N−1; i ++){           // i executa N - 2vezes
        for ( j =1; j < 2∗N; j ++){       // j executa 2N - 1
            s = s + 1 ;                   // resultado pior dos casos O(n^2)
        }
    }
