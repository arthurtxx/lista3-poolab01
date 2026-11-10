import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do cateto 1: ");
        double c1 = leitor.nextDouble();

        System.out.print("Digite o valor do cateto 2: ");
        double c2 = leitor.nextDouble();

        Triangulo triangulo = new Triangulo();

        // Calcula a hipotenusa e a área
        double h = triangulo.calculaHipotenusa(c1, c2);
        double area = triangulo.calculaArea();

        System.out.println("Hipotenusa = " + h);
        System.out.println("Área = " + area);

        leitor.close();
    }
}