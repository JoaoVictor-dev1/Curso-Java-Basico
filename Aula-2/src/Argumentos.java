import java.util.Scanner;

public class Argumentos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String argumento;

        System.out.print("Digite um argumento: ");
        argumento = scanner.nextLine();
        
        System.out.println("Você digitou: " + argumento);

        scanner.close();
    }
}
