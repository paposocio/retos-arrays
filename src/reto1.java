import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int numNotas = lectura.nextInt();
    
        double[] notas = new double[numNotas];
        double suma = 0;

        for (int i = 0; i < numNotas; i++) 
        {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = lectura.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / numNotas;
        System.out.println("El promedio de notas es: " + promedio);

        if (promedio < 3) 
        {
            System.out.println("Reprobaste");
        } 
        else if (promedio >= 3 && promedio < 4) 
        {
            System.out.println("Pasaste raspando");
        } 
        else 
        {
            System.out.println("Aprobaste con buenos resultados");
        }

        lectura.close();
    }
}