package Gestion_Habitats;
public class HabitatAviario extends Habitat{
    boolean puedeVolar;

    public HabitatAviario(boolean puedeVolar){
        super(temperatura,limpieza,humedad);
        this.puedeVolar=puedeVolar;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    public void BooleanPuedeVolar(boolean puedeVolar){
        if(puedeVolar==true){
            System.out.println("El animal:"+animal+"pertenece al habitat aviarios");
        }else{
            System.out.println("El animal:"+animal+"no pertenece al habitat aviario");
        }
    }
}
