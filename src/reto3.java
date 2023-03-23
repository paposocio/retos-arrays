import java.util.Scanner;

public class reto3 
{
    public static void main(String[] args) 
    {
        String[][] productos = new String[16][2];
        Scanner lectura = new Scanner(System.in);

        for (int i = 0; i < productos.length; i++) 
        {
            System.out.print("Ingrese el nombre del producto #" + (i+1) + ": ");
            productos[i][0] = lectura.nextLine();
            System.out.print("Ingrese el precio del producto #" + (i+1) + ": ");
            productos[i][1] = lectura.nextLine();
        }

        System.out.println("Catálogo de productos:");

        for (int i = 0; i < productos.length; i++) 
        {
            System.out.println("Código de producto: " + i);
            System.out.println("Nombre de producto: " + productos[i][0]);
            System.out.println("Precio de producto: " + productos[i][1]);
            System.out.println();
        }
        lectura.close();
    }
}