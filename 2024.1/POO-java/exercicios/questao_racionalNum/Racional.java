/**
 * Racional
 */
public class Racional {
    private int numerador;
    private int denominador;


    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Racional somar(Racional outro){
        int novoNumerador = this.numerador * outro.denominador + this.denominador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    public Racional subtrair(Racional outro){
        int novoNumerador = this.numerador * outro.denominador - this.denominador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    public Racional multiplicar(Racional outro){
        int novoNumerador = this.numerador * outro.numerador;
        int novoDenominador = this.denominador * outro.denominador;
        return new Racional(novoNumerador, novoDenominador);
    }

    public Racional dividir(Racional outro){
        int novoNumerador = this.numerador * outro.denominador;
        int novoDenominador = this.denominador * outro.numerador;
        return new Racional(novoNumerador, novoDenominador);
    }

    public float valor(int numerador, int denominador){
        float resultado = numerador / denominador;
        return resultado;
    }

    public boolean igual_a(Racional outro){
        return this.numerador == outro.numerador && this.denominador == outro.denominador;
    }

    public boolean menor_que(Racional outro){
        return valor(this.numerador, this.denominador) < valor(outro.numerador, outro.denominador);
    }



}