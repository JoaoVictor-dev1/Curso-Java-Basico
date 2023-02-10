//Erro3 - Erros em tempo de execução

//public class Erro3 {
    //public static void Main (String[] args) throws Exception {
        //System.out.println("Resultado: " + 1/0);
    //}
//}


// Código funcionando:

import java.util.Scanner;

public class Erro3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        float a, b, resultado;

        System.out.print("Digite o Dividendo: ");
        a = scanner.nextFloat();

        System.out.print("Digite o Divisor: ");
        b = scanner.nextFloat();

        resultado = a/b;

        
        System.out.println("Resultado: " + a + "/" + b + " = " + resultado);

        scanner.close();
    }
}