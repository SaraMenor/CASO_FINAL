public class AnimalesAcuaticos extends Animales{
    boolean aletas;
    String tipoAgua;

    public AnimalesAcuaticos(boolean aletas, String tipoAgua){
        super(nombre,especie,alimenatcion,comportamiento,salud,edad,id,peso);
        this.aletas=aletas;
        this.tipoAgua=tipoAgua;

    }

    public String getTipoAgua(){
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean Aletas){
        this.aletas=aletas;
    }
}
