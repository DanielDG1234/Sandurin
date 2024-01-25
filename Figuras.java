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

        // Calcular área de un cilindro
        System.out.print("Ingrese el radio del cilindro: ");
        double radioCilindro = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double alturaCilindro = scanner.nextDouble();
        double areaCilindro = calcularAreaCilindro(radioCilindro, alturaCilindro);
        System.out.println("Área del cilindro: " + areaCilindro);
        
        // Calcular área de una pirámide de base cuadrada
        System.out.print("Ingrese la longitud del lado de la base de la pirámide: ");
        double ladoBasePiramide = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double alturaPiramide = scanner.nextDouble();
        double areaPiramide = calcularAreaPiramide(ladoBasePiramide, alturaPiramide);
        System.out.println("Área de la pirámide: " + areaPiramide);
        
        // Calcular área de un rombo
        System.out.print("Ingrese la longitud de la diagonal mayor del rombo: ");
        double diagonalMayorRombo = scanner.nextDouble();
        System.out.print("Ingrese la longitud de la diagonal menor del rombo: ");
        double diagonalMenorRombo = scanner.nextDouble();
        double areaRombo = calcularAreaRombo(diagonalMayorRombo, diagonalMenorRombo);
        System.out.println("Área del rombo: " + areaRombo);
        
	// Calcular área de un pentágono
	System.out.print("Ingrese la longitud del lado del pentágono: ");
	double ladoPentagono = scanner.nextDouble();
	double areaPentagono = calcularAreaPentagono(ladoPentagono);
	System.out.println("Área del pentágono: " + areaPentagono);

        
        // Calcular área de un hexágono
        System.out.print("Ingrese la longitud del lado del hexágono: ");
        double ladoHexagono = scanner.nextDouble();
        double areaHexagono = calcularAreaHexagono(ladoHexagono);
        System.out.println("Área del hexágono: " + areaHexagono);
	
	// Calcular área de un triángulo
	System.out.print("Ingrese la longitud de la base del triángulo: ");
	double baseTriangulo = scanner.nextDouble();
	System.out.print("Ingrese la altura del triángulo: ");
	double alturaTriangulo = scanner.nextDouble();
	double areaTriangulo = calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
	System.out.println("Área del triángulo: " + areaTriangulo);

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

    // Método para calcular el área de un cilindro
    private static double calcularAreaCilindro(double radio, double altura) {
        // El área de un cilindro es la suma del área de dos círculos (las bases) y el área de un rectángulo (la superficie lateral)
        double areaBases = 2 * calcularAreaCirculo(radio);
        double areaLateral = 2 * Math.PI * radio * altura;
        return areaBases + areaLateral;
    }
    System.out.print("Ingrese la longitud del lado de la base de la pirámide: ");
        double ladoBasePiramide = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double alturaPiramide = scanner.nextDouble();
        double areaPiramide = calcularAreaPiramide(ladoBasePiramide, alturaPiramide);
        System.out.println("Área de la pirámide: " + areaPiramide);

        scanner.close();
    }

    // Métodos existentes para calcular áreas de círculo, rectángulo y cilindro
    // (Código existente)

    // Método para calcular el área de una pirámide de base cuadrada
    private static double calcularAreaPiramide(double ladoBase, double altura) {
        // El área de la base de la pirámide es ladoBase * ladoBase (área de un cuadrado)
        double areaBase = Math.pow(ladoBase, 2);

        // El área lateral de la pirámide es (perímetro de la base * altura) / 2
        double areaLateral = (4 * ladoBase * altura) / 2;

        // El área total es la suma del área de la base y el área lateral
        return areaBase + areaLateral;
    }
    
    private static double calcularAreaRombo(double diagonalMayor, double diagonalMenor) {
        // El área de un rombo es (diagonalMayor * diagonalMenor) / 2
        return (diagonalMayor * diagonalMenor) / 2;
    }
    
    // Método para calcular el área de un pentágono
    private static double calcularAreaPentagono(double lado) {
    	// El área de un pentágono regular es (1/4) * sqrt(5 * (5 + 2 * sqrt(5))) * lado^2
    	return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(lado, 2);
}

   // Método para calcular el área de un hexágono regular
    private static double calcularAreaHexagono(double lado) {
        // El área de un hexágono regular es (3 * sqrt(3) * lado^2) / 2
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
    
    // Método para calcular el área de un triángulo
    private static double calcularAreaTriangulo(double base, double altura) {
    	// El área de un triángulo es (base * altura) / 2
    	return (base * altura) / 2;
}
    
}
