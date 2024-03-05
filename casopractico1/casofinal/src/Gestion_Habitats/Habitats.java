public class Habitats {
    float temperatura;
    boolean limpieza;
    boolean humedad;

    public Habitats(float temperatura,boolean limpieza,boolean humedad){
        this.temperatura=temperatura;
        this.humedad=humedad;
        this.limpieza=limpieza;
    }
//getters y setters
    public boolean isHumedad() {
        return humedad;
    }

    public void setHumedad(boolean humedad) {
        this.humedad = humedad;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }

    public boolean isLimpieza() {
        return limpieza;
    }


}
