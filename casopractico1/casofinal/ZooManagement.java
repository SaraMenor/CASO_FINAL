public class ZooManagement {
    public static void main(String[] args){
        //agregar habitats
        //agregar animales a los habitats
        //clase abstracta de habitats (clase que no se puede instanciar, no se puede crear un obejto a parti de ella, es una clase comun para los tipos de habitats
    }
class zoo{
        public void addHabitat(Habitat habitat){
            habitat.add(habitat);
        }

        public void monitorHabitat(){}
}

    abstract class Habitat{
        private string name;

        public Habitat (String name){
            this.name=name;
        }
        public void addAnimal(){

        }

    }
    class HabitatAcuatico extends Habitat{
    }
    class HabitatTerrestre extends Habitat{
    }

    class HabitatAviarios extends Habitat{
    }
}
