public class TourAviarios extends Tour{

    public TourAviarios(){
        super(tipotour);
    }
    public void iniciarTour(){
        System.out.println("Bienvenidos al tour de las aves");
    }

    public void finalizarTour(){
        System.out.println("Esperamos que hayais disfrutado del tour!");
    }
}
