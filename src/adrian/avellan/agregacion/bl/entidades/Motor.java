/**
 * @author: Adrian Avellan
 * @version: 1.0
 *
 *
 */

package adrian.avellan.agregacion.bl.entidades;

public class Motor {

    private String tipo;
    private String serie;

    /**
     *
     * @return tipo de motor(diesel/gas)
     */

    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo registro del tipo de motor
     */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /***
     *
     * @return numero de serie del motor
     */

    public String getSerie() {
        return serie;
    }

    /**
     *
     * @param serie registro del numero de serie
     */

    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * Constructor Vacio del Motor
     */

    public Motor() {
    }

    /**
     * Constructor con parametros necesarios para los detalles del motor
     * @param tipo
     * @param serie
     */

    public Motor(String tipo, String serie) {
        this.tipo = tipo;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }
}
