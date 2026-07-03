import java.util.Scanner;

public class AreaRetangulo {
    public void calcularAreaRetangulo(Scanner entrada) {
         double base, altura, area;

        System.out.println("---------------------------");
        System.out.println("Digite a base do retangulo: ");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        altura = entrada.nextDouble();

        area = base * altura;

        System.out.println("---------------------------");
    	System.out.println("A área do retangulo é: " + area);
    }
}
