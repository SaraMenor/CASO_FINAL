public class HabitatAcuatico extends Habitat{
    boolean puedeNadar;

    public HabitatAcuatico(boolean puedeNadar){
        super(temperatura,limpieza,humedad);
        this.puedeNadar=puedeNadar;
    }

    public boolean isPuedeNadar() {
        return puedeNadar;
    }

    public void setPuedeNadar(boolean puedeNadar) {
        this.puedeNadar = puedeNadar;
    }

    public BooleanPuedeNadar(boolean puedeNadar){
        if(puedeNadar==true) {
            System.out.println("El animal:" + animal + "pertence al habitat acuarios");
        }else {
            System.out.println("El animal:"+animal+"no pertence al habitat acuarios");
        }
    }
}
