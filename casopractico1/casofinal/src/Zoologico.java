public static void main (String[]args){

    Scanner scanner=new Scanner(System.in);

    private Tour tour;
    private Habitats habitats;
    private Animales animales;

    public zoologico(){
        this.animales=new Animales();
        this.habitats=new Habitats();
        this.tour=new Tour ();
    }

        System.out.println("Bienvenido al zoológico. ¿Qué desea hacer?");
        System.out.println("1. Iniciar tour");
        System.out.println("2. Programar mantenimiento");
        System.out.println("3. Ver las camaras de seguridad");
        System.out.println("4. Añadir un animal");

        int opcion = scanner.nextInt();


        switch (opcion) {
        case 1:
        System.out.println("Seleccione el tipo de tour: ");
        String tipoTour = scanner.next();
        Tour.iniciarTour(tipoTour);
        Tour.finalizarTour();
        break;

        case 2:
            break;

         case 3:
             break;


         case 4:
             break;

            scanner.close();
}