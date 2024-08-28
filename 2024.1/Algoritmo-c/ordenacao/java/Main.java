public class Main {
    public static void main(String[] args) {
        SelectionSort selec = new SelectionSort();
        int arr[] = {14, 64, 23, 15, 82, 19};
        selec.sort(arr);
        selec.imprimir(arr);
        System.err.println();

        InsertionSort insert = new InsertionSort();
        insert.inserSort(arr);
        insert.imprimir(arr);
    }
}
