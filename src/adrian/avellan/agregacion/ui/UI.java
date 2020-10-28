package adrian.avellan.agregacion.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void mostrarMenu(){
        output.println("Tare de Agregacion");
        output.println("1. Registrar Vehiculo");
        output.println("2. Registrar Motor");
        output.println("3. Listar");
        output.println("4. Salir");
    }

    public int leerOpcion(){
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje){
        output.println(mensaje);
    }

    public String leerTexto(){
        return input.next();
    }

}
