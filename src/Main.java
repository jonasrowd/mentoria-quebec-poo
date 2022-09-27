// import java.util.Scanner;

// Classes Vendedor e Consultor herdam da super classe Funcionario
// Implementado encapsulamento
// Implementado abstração

public class Main {
    public static void main(String[] args) throws Exception {
        Vendedor vendedor = 
            new Vendedor("Joao", "1234567890", 10.0, 10);

        double salarioVendedor = vendedor.calcularSalario();

        System.out.println("O salario do vendedor e: " + salarioVendedor);

        Consultor consultor = 
            new Consultor("Maria", "01234567891", 100.0, 10L);

        System.out.println("O salario de Maria e: " + consultor.calcularSalario());

        // // Teste Scanner
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Informe o seu nome aqui: ");
        // String nome = scanner.next();
        // System.out.println(nome);
        // scanner.close();

    }
}
