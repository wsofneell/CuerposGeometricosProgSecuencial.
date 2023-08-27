import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double altura, radio, generatriz;
        Double areaL, areaT, Abase, volumen;


        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();

        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();

        generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
        areaL = Math.PI * radio * generatriz;
        Abase = Math.PI * (radio * radio);
        areaT = areaL + Abase;
        volumen = (Abase + areaL) /3;

        System.out.println("Area lateral: " + areaL );
        System.out.println("Area total: " + areaT );
        System.out.println("Volumen: " + volumen );
        lector.close();    

    }
}
