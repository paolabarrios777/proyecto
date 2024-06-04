import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nEdad, sumaP=0, contador5=0, sumaN=0, promedioP=0, promedioN=0, contadorN=0, contadorP=0;
        System.out.println("señor usuario por favor ingrese la cantidad de edades que va a ingresar");
        nEdad = entrada.nextInt();

        int edad[] = new int[nEdad];

        for (int i = 0; i < nEdad; i++) {
            System.out.println("señor usuario por favor digite las edades");
            edad[i] = entrada.nextInt();
            if (edad[i]==5){
                contador5 ++;
            }
            else if (edad[i]>5){
                contadorP++;
                sumaP += edad[i];
            }
            else  {
                contadorN++;
                sumaN += edad[i];
            }
        }
        if (contadorP==0){
            System.out.println("lo siento no se puede hacer el promdeio de edades mayores a 5 años");
        }
        else  {
            promedioP = sumaP/contadorP;
            System.out.println("\nEl promedio de las edades mayor a 5 es: "+promedioP);
        }
        if (contadorN==0){
            System.out.println("lo siento no se puede hacer el promdeio de edades menores a 5 años");
        }
        else {
            promedioN = sumaN/contadorN;
            System.out.println("\nEl promdeio de las edades menores a 5 años es: "+promedioN);
        }
        System.out.println("\n Las edades son: ");
        for (int i=0;i<nEdad;i++){
            System.out.println(edad[i] + " ");

        }
        System.out.println("\nLa cantidad de estudiantes que tienen 5 años es:"+contador5);


    }
}