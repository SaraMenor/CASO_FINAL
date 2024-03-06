public class TourAcuaticos extends Tour {

    public TourAcuaticos(){
        super(tipotour);
    }

    public void iniciarTour(){
        System.out.println("Bienvenidos al tour acuatico");
    }

    public void finalizarTour(){
        System.out.println("Esperamos que hayais disfrutado del tour!");
    }
}
