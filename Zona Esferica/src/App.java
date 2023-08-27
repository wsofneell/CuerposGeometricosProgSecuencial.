import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);
        double radio, altura, radioM, area, volumen;
     
        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();

        System.out.println("Ingrese la altura ");
        altura = lector.nextDouble();

        System.out.println("Ingrese el radio mayor: ");
        radioM = lector.nextDouble();

        area = 2 * Math.PI *  radioM * altura;
        volumen = (Math.PI * altura * (Math.pow(altura, 2) + 3*Math.pow(radio, 2) + 3*Math.pow(radioM, 2)))/6;


        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);
        lector.close(); 
    }
}