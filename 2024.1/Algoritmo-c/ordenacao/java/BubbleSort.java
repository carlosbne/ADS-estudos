class Bubble {
    void bubbleSort(int arr[]) {
      int len = arr.length;                   //tamanho do array
      int temp;                               //variavel temporária para troca
      for (int i = 0; i < len - 1; i++) {     //loop para cada elemento
        for (int j = 0; j < len - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {          //verifica se o elemento ao lado é maior
            temp = arr[j];                    //usa o temp para aux na troca
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
    }
  
    //função para imprimir o array
    void imprimir(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }
  
  public class BubbleSort{
    public static void main(String args[]) {
      Bubble obj = new Bubble();
      int arr[] = { 14, 64, 23, 15, 82, 19 };
      obj.bubbleSort(arr);
      obj.imprimir(arr);
    }
  }
  