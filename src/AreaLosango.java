import java.util.Scanner;

public class AreaLosango {
 public void calcularAreaLosango(Scanner entrada){
        double diagonalMaior, diagonalMenor, area;

        System.out.println("Digite a diagonal maior do losango: ");
        diagonalMaior = entrada.nextDouble();
        System.out.println("Digite a diagonal menor do losango: ");
        diagonalMenor = entrada.nextDouble();

        area = (diagonalMaior * diagonalMenor)/2;

        System.out.printf("A área do losango é: %.2f\n", area);
    }
}
