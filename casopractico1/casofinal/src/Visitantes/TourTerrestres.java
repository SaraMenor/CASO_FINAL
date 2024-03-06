public class TourTerrestres extends Tour {

    public TourTerrestres(){
        super(tipoTour);
    }

    public void iniciarTour(){
        System.out.println("Bienvenidos al tour de los terrestres");
    }

    public void finalizarTour(){
        System.out.println("Esperamos que hayais disfrutado del tour!");
    }
}
