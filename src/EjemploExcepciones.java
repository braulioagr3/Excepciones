import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class EjemploExcepciones
{
    public static void main(String[] arg) //throws FileNotFoundException
    {
        try
        {
            File archivo = new File("entrada.txt");
            Scanner entrada = new Scanner(archivo);
            System.out.print("Dame el primer número: ");
            int num1 = entrada.nextInt();
            System.out.print("Dame el segundo número: ");
            int num2 = entrada.nextInt();
            System.out.println("La division es:" + num1/num2);
        }
        catch (ArithmeticException eA)
        {
            System.out.println("Division por cero");
        }
        catch (InputMismatchException eE)
        {
            System.out.println("Entrada Invalida");
        }
        catch (FileNotFoundException eF)
        {
            System.out.println("No existe el Archivo");
        }
    }
}
