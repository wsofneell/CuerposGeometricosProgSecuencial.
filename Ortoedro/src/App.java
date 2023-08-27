import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double altura, arista, base, diagonal, volumen, area;

        System.out.println("Ingrese la altura");
        altura =  lector.nextDouble();

        System.out.println("Ingrese la base: ");
        base = lector.nextDouble();

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        area = 2 * (arista * base + arista * altura + base * altura);
        diagonal = Math.sqrt(Math.pow(arista, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
        volumen = arista * base * altura;

        System.out.println("Area: " + area);
        System.out.println("Diagonal: " + diagonal);
        System.out.println("Volumen: " + volumen);
        lector.close();


    }
}
