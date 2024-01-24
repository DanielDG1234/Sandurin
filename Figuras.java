import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Áreas Geométricas");

        // Calcular área de un círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        double areaCirculo = calcularAreaCirculo(radioCirculo);
        System.out.println("Área del círculo: " + areaCirculo);

        // Calcular área de un rectángulo
        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitudRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la anchura del rectángulo: ");
        double anchuraRectangulo = scanner.nextDouble();
        double areaRectangulo = calcularAreaRectangulo(longitudRectangulo, anchuraRectangulo);
        System.out.println("Área del rectángulo: " + areaRectangulo);

        scanner.close();
    }

    // Método para calcular el área de un círculo
    private static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el área de un rectángulo
    private static double calcularAreaRectangulo(double longitud, double anchura) {
        return longitud * anchura;
    }
}
