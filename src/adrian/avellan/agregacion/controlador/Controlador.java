package adrian.avellan.agregacion.controlador;

import adrian.avellan.agregacion.bl.entidades.Motor;
import adrian.avellan.agregacion.bl.entidades.Vehiculo;
import adrian.avellan.agregacion.bl.logica.Gestor;
import adrian.avellan.agregacion.ui.UI;

import java.util.ArrayList;

public class Controlador {

    private UI interfaz = new UI();
    private Gestor gestor = new Gestor();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Motor> motores = new ArrayList<>();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            interfaz.mostrarMenu();
            opcion = interfaz.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 4);

    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarVehiculo();
                break;
            case 2:
                registrarMotor();
                break;
            case 3:
                listarVehiculos();
                break;
            case 4:
                interfaz.imprimirMensaje("Gracias por usar la aplicacion");
                break;
            default:
                interfaz.imprimirMensaje("Opcion desconocida");
        }
    }

    public void registrarVehiculo(){

        interfaz.imprimirMensaje("Ingrese la marca del Vehiculo");
        String marca = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese la modelo del Vehiculo");
        String modelo = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese el numero de serie del Vehiculo");
        String seriVehiculo = interfaz.leerTexto();

        Vehiculo nuevo = new Vehiculo(marca, modelo, seriVehiculo);
        vehiculos.add(nuevo);

        interfaz.imprimirMensaje("Vehiculo registrado con exito");

        //gestor.registrarVehiculo(marca, modelo, seriVehiculo);
    }

    public void registrarMotor(){

        interfaz.imprimirMensaje("Ingrese el tipo de motor");
        String tipo = interfaz.leerTexto();
        interfaz.imprimirMensaje("Ingrese la serie del motor");
        String serie = interfaz.leerTexto();
        interfaz.imprimirMensaje("Serie del vehiculo: ");
        String vehiculoSerie = interfaz.leerTexto();

        Motor nuevoMotor = new Motor(tipo, serie);
        motores.add(nuevoMotor);

        for(int i=0; i< vehiculos.size(); i++) {
            Vehiculo vehiculoActual = vehiculos.get(i);
            if(vehiculoActual.getSeriVehiculo().equals(vehiculoSerie)){
                vehiculoActual.getMotores().add(nuevoMotor);
            }
        }

        // gestor.registrarMotor(vehiculoSerie, nuevoMotor);

    }

    public void listarVehiculos(){
        ArrayList<Vehiculo> lista = vehiculos;
        interfaz.imprimirMensaje("Lista de Vehiculos Registrados");
        for(int i = 0; i < lista.size(); i++) {
            interfaz.imprimirMensaje(lista.get(i).toString());
        }

    }




}
