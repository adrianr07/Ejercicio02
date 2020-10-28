/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */


package adrian.avellan.agregacion.bl.entidades;

import java.util.ArrayList;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String seriVehiculo;
    private ArrayList<Motor> motores = new ArrayList<>();


    /**
     *
     * @return marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca registro de la marca del vehiculo
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return modelo del vehiculo
     */

    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo registro del modelo del vehiculo
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return numero de serie del vehiculo
     */

    public String getSeriVehiculo() {
        return seriVehiculo;
    }

    /**
     *
     * @param seriVehiculo registro del numero de serie
     */

    public void setSeriVehiculo(String seriVehiculo) {
        this.seriVehiculo = seriVehiculo;
    }

    /**
     *
     * @return motor relacionado al vehiculo
     */

    public ArrayList<Motor> getMotores() {
        return motores;
    }

    /**
     *
     * @param motores registro del motor relacionado al vehiculo
     */

    public void setMotores(ArrayList<Motor> motores) {
        this.motores = motores;
    }

    /**
     * Constructor Vacio del Vehiculo
     * @param marca
     * @param modelo
     * @param seriVehiculo
     * @param nuevoMotor
     */

    public Vehiculo(String marca, String modelo, String seriVehiculo, Motor nuevoMotor) {
    }

    /**
     * Constructor con parametros necesarios para registrar un vehiculo
     * @param marca
     * @param modelo
     * @param seriVehiculo
     */

    public Vehiculo(String marca, String modelo, String seriVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.seriVehiculo = seriVehiculo;
        this.motores = motores;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", seriVehiculo='" + seriVehiculo + '\'' +
                ", motores=" + motores +
                '}';
    }
}
