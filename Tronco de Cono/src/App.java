import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        double altura, radioMenor, radioMayor, generatriz;
        Double areaL, areaT, AbaseMenor, ABaseMayor, volumen;


        System.out.println("Ingrese la altura: ");
        altura = lector.nextDouble();

        System.out.println("Ingrese el radio menor: ");
        radioMenor = lector.nextDouble();

        System.out.println(" Ingrese el Radio mayor: ");
        radioMayor = lector.nextDouble();

        generatriz = Math.sqrt(Math.pow(altura, 2) + (Math.pow(radioMayor - radioMenor, 2)));
        ABaseMayor = Math.PI * Math.pow(radioMayor, 2);
        AbaseMenor = Math.PI * Math.pow(radioMenor, 2);
        areaL = Math.PI * generatriz * (radioMayor + radioMenor);
        areaT = areaL + ABaseMayor + AbaseMenor;
        volumen = (1/3) * Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + (radioMayor * radioMenor));


        System.out.println("Area lateral: " + areaL );
        System.out.println("Area total: " + areaT );
        System.out.println("Volumen: " + volumen );
        lector.close();    

    }
}
