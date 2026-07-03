import java.util.Scanner;

public class AreaTrapezio {
    public void calcularAreaTrapezio(Scanner entrada){
        double baseMaior, baseMenor, altura, area;

        System.out.println("Digite a base maior do trapezio: ");
        baseMaior = entrada.nextDouble();
        System.out.println("Digite a base menor do trapezio: ");
       baseMenor = entrada.nextDouble();
        System.out.println("Digite a altura do trapezio: ");
        altura = entrada.nextDouble();

        area =((baseMaior + baseMenor) * altura) / 2.0;

        System.out.printf("A área do trapezio é: %.2f\n", area);
    }
}
