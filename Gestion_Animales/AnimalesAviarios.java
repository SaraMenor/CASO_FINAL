public class AnimalesAviarios extends Animales{
    boolean plumaje;
    boolean pico;

    public AnimalesAviarios(boolean plumaje,boolean pico){
        super(nombre,especie,alimenatcion,comportamiento,salud,edad,id,peso);
        this.plumaje=plumaje;
        this.pico=pico;

    }

    public boolean isPlumaje(){
        return plumaje;
    }
    public void setPlumaje(boolean plumaje){
        this.plumaje=plumaje;
    }

    public boolean isPico(){
        return pico;
    }
    public void  setPico(boolean pico){
        this.pico=pico;
    }

    public void BooleanPlumaje(boolean plumaje){
        if (plumaje==true){
            System.out.println("Tiene plumas");
        }else{
            System.out.println("No tiene plumas");
        }
    }
    public void BooleanPico(boolean pico){
        if (pico==true){
            System.out.println("Tiene pico");
        }else{
            System.out.println("No tiene pico");
        }
    }

}
