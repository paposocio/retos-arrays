import java.util.Scanner;

public class reto2 
{

    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de competidores: ");
        int nadadores = lectura.nextInt();

        String[] nombres = new String[nadadores];
        double[] tiempos = new double[nadadores];

        for (int i = 0; i < nadadores; i++) 
        {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = lectura.next();
            System.out.print("Ingrese el tiempo del competidor " + (i+1) + ": ");
            tiempos[i] = lectura.nextDouble();
        }

        System.out.println("Tiempo por competidor:");

        for (int i = 0; i < nadadores; i++) {
            System.out.println(nombres[i] + ": " + tiempos[i]);
        }

        int ganador = 0;
        
        for (int i = 1; i < nadadores; i++) 
        {
            if (tiempos[i] < tiempos[ganador]) 
            {
                ganador = i;
            }
        }

        System.out.println("El ganador es " + nombres[ganador] + " con un tiempo de " + tiempos[ganador]);
        lectura.close();
    }
}