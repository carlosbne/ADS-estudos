import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class q3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        if(a <= 0){
            System.out.println("Impossivel calcular\n");
        }
        else{
            Double delta = (Math.pow(b, 2) - 4 * a * c);

            if(delta < 0){
                System.out.println("Impossivel calcular\n");
            }
            else{
                Double x = (-b + Math.sqrt(delta)) / (a * 2);
                Double y = (-b - Math.sqrt(delta)) / (a * 2);

                System.out.printf("%f\n", x);
                System.out.printf("%f\n", y);
            }
        }
        
    }
}