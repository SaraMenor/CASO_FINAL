public class Animales {
    String nombre;
    String especie;
    String alimentacion;
    int edad;
    int id;
    float peso;

    boolean salud;
    boolean comportamiento;

    public Animales(String nombre, string especie, string alimentacion,boolean comportamiento,boolean salud, int edad, int id, float peso ){
        this.nombre=nombre;
        this.especie=especie;
        this.alimentacion=alimentacion;
        this.comportamiento=comportamiento;
        this.salud=salud;
        this.edad=edad;
        this.peso=peso;
        this.id=id;
    }
    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie=especie;

    }

    public String getAlimentacion(){
        return alimentacion;
    }
    public void setAlimentacion(String alimentacion){
        this.alimentacion=alimentacion;

    }
    public String getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;

    }
    public String getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getPeso(){
        return peso;
    }
    public void SetPeso(float peso){
        this.peso=peso;
    }

    public boolean isSalud(){
        return salud;
    }
    public void setSalud(boolean salud){
        this.salud=salud;

    }

    public boolean isComportamiento(){
        return comportamiento;
    }
    public void setComportamiento(boolean comportamiento){
        this.comportamiento=comportamiento;

    }

    public void ResgistrarNombre(String nombre){
        System.out.println(+nombre);
    }

    public void BooleanSalud(boolean salud){
        if (salud==true) {
            System.out.println("El animal : " + animal + " está sano");
        }else
            System.out.println("El animal:" +animal+ "está enfermo");

        }
        public void BooleanComportamiento(boolean comportamiento) {
            if (comportamiento == true) {
                System.out.println("El animal:" + animal + "tiene buen comportamiento");
            } else {
                System.out.println("El animal:" + animal + "no tiene un buen comportamiento");

            }
        }

        public void ResgistrarSalud(boolean salud){
            System.out.println(BooleanSalud(salud);
        }

        public void ResgistrarComportamiento(boolean comportamiento){
            System.out.println(BooleanComportamiento(comportamiento););
        }

        public void ResgistrarEdad(int edad){
            System.out.println("El animal tiene:"+edad+ "años");
        }
        public void ResgistrarPeso(float peso){
            System.out.println("El animal pesa:"+peso+"kg");
        }

        public void RegistrarEspecie(String especie){
            System.out.println(+especie);
        }

        public void ResgistrarId(int id){
            System.out.println("El id del animal es:"+id);
        }

        public void RegistrarAlimentacion(String alimentacion){
            System.out.println("El animal se ha alimenatdo con:"+alimentacion);
        }

}



