import java.util.Scanner;

public class AreaTriangulo {
    public void calcularAreaTriangulo(Scanner entrada) {
         double base, altura, area;

        System.out.println("---------------------------");
        System.out.println("Digite a base do triangulo: ");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        altura = entrada.nextDouble();

        area = (base * altura)/2;

        System.out.println("---------------------------");
    	System.out.println("A área do triangulo é: " + area);
    }
}
