#include <stdio.h>

int main() {
    FILE *fp = fopen("exemplo", "w+");
    int count = 1;
    
    while (count < 5) {
        fprintf(fp, "%d ", count);
        printf("%d\n", count);
        count++;
    }
    
    fclose(fp);
    return 0;
}