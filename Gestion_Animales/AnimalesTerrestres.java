public class AnimalesTerrestres extends Animales{
    boolean pleaje;
    int numeroPatas;
    public AnimalesTerrestres(boolean pleaje,int numeroPatas){
        super(nombre,especie,alimenatcion,comportamiento,salud,edad,id,peso);
        this.numeroPatas=numeroPatas;
        this.pleaje=pelaje;

    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public boolean isPleaje() {
        return pleaje;
    }

    public void setPleaje(boolean pleaje){
        this.pleaje=pelaje;
    }
}
