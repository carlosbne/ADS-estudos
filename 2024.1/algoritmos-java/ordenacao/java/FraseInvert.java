import java.util.ArrayList;
import java.util.List;

public class FraseInvert {
    public static void invert(String frase){
        // Quebrar a frase em palavras e armazenar em uma lista
        String[] palavras = frase.split(" ");
        List<String> listaPalavras = new ArrayList<>();

        // Adicionar palavras à lista
        for (String palavra : palavras) {
            listaPalavras.add(palavra);
        }

        // Inverter a ordem das palavras usando um loop
        List<String> listaInvertida = new ArrayList<>();
        for (int i = listaPalavras.size() - 1; i >= 0; i--) {
            listaInvertida.add(listaPalavras.get(i));
        }

        // Montar a frase invertida
        String fraseInvertida = String.join(" ", listaInvertida);

        // Imprimir a frase invertida
        System.out.println(fraseInvertida);
    }

    public static void main(String[] args) {
        String frase = "Ana Katarina, que nome feio";
        invert(frase);
    }
}