FILE * fp = fopen("exemplo", "w+");
int count = 1;
while (count < 5) {
  fprintf(fp, "%d ", count);
  count++;
}
fclose(fp);