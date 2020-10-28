package adrian.avellan.agregacion.bl.logica;

import adrian.avellan.agregacion.bl.entidades.Motor;
import adrian.avellan.agregacion.bl.entidades.Vehiculo;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<Vehiculo> vehiculos;

    public Gestor() {
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(String marca, String modelo, String seriVehiculo){
        Vehiculo nuevo = new Vehiculo(marca, modelo, seriVehiculo);
        vehiculos.add(nuevo);
    }

    public ArrayList<Vehiculo> listarVehiculos(){
        return this.vehiculos;
    }

    public void registrarMotor(String vehiculoSerie, Motor motores){
        for(int i=0; i< vehiculos.size(); i++) {
            Vehiculo vehiculoActual = vehiculos.get(i);
              if(vehiculoActual.getSeriVehiculo().equals(vehiculoSerie)){
                  vehiculoActual.getMotores().add(motores);
              }
        }
    }

}
