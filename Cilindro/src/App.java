import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        Double radio, altura, Abase, Pbase;
        Double areaL, areaT, volumen;

        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();

        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();

        Pbase = (2* Math.PI) * radio;
        areaL = Pbase * altura;
        Abase = Math.PI * Math.pow(radio, 2);
        areaT = areaL + (2 * Abase);
        volumen = Abase * altura;

        System.out.println("Area lateral: " + areaL );
        System.out.println("Area total: " + areaT );
        System.out.println("Volumen: " + volumen );
        lector.close();

    }
}
