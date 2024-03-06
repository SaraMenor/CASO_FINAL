public class Tour {
    public static void main(String[] args) {
            public Tour(String tipoTour) {
            this.tipoTour = tipoTour;
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de tours del zoológico.");
        System.out.println("Seleccione el tipo de tour que desea realizar:");
        System.out.println("1. Tour Terrestre");
        System.out.println("2. Tour Aviario");
        System.out.println("3. Tour Acuático");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                TourTerrestre tourTerrestre = new TourTerrestre();
                tourTerrestre.iniciarTour();
                tourTerrestre.finalizarTour();
                break;
            case 2:
                TourAviario tourAviario = new TourAviario();
                tourAviario.iniciarTour();
                tourAviario.finalizarTour();
                break;
            case 3:
                TourAcuatico tourAcuatico = new TourAcuatico();
                tourAcuatico.iniciarTour();
                tourAcuatico.finalizarTour();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        scanner.close();
    }
}

