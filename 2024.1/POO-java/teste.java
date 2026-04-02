import java.util.Scanner;
/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        
        /* Primeiro input */
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter usarname");
        
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        
        /* Hello word, primeiro print */
        System.out.println("Hello, World!"); 
        
        /* Atribuição e soma de variaveis */
        int a, b;
        a = 1234;
        b = 99;
        
        int c = a + b;

        System.out.printf("%d", c);
    }
}