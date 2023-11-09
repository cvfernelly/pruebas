import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            System.out.println("Introduzca un numero y le daremos la raiz cuadrada, para salir, digite 0");
            numero = scanner.nextDouble();
            if (numero ==0){
                System.out.println("Adios!!!");
            }else{
                System.out.println("La raiz de " + numero + " es " + Math.sqrt(numero));
            }
        } while (numero !=0);

    }
}
