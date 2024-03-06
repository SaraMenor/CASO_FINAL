public class TourNiños extends Tour{

    public TourNiños(){
        super(tipoTour);
    }
    public void iniciarTour(){
        System.out.println("Bienvenidos al tour infantil");
    }

    public void finalizarTour(){
        System.out.println("Esperamos que hayais disfrutado del tour!");
    }
}
