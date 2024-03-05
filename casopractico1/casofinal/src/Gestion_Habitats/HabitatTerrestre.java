public class HabitatTerrestre extends Habitat{
    boolean puedeCaminar;

    public HabitatTerrestre(boolean puedeCaminar){
        super(temperatura,limpieza,humedad);
        this.puedeCaminar=puedeCaminar;

    }

    public boolean isPuedeCaminar() {
        return puedeCaminar;
    }

    public void setPuedeCaminar(boolean puedeCaminar) {
        this.puedeCaminar = puedeCaminar;
    }

    public void BoeleanPuedeCaminar(boolean puedeCaminar){
        if(puedeCaminar==true){
            System.out.println("El animal:"+animal+"pertence al habitat terrestre");
        } else{
            System.out.println("El animal:"+animal+"no pertenece al habitat terrestre"));
        }
    }
}
