public class Circulo {
    private double pi = 3.14159;
    private double raio;
  
    public Circulo(double raio) {
      this.raio = raio;
    }
  
    // getters
    public double getRaio() {
      return this.raio;
    }
  
    // setters
    public void setRaio(double raio) {
      this.raio = raio;
    }
  
    public double calcArea() {
      return pi * raio * raio;
    }
  
    public double calcCircunferencia() {
      return 2 * pi * raio;
    }
    
}
