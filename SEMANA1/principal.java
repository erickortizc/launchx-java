package SEMANA1;

public class principal {
    public static void main (String[] args)
    {
    def();
    }
    public static void def() {
        objeto bailarina = new objeto();
        bailarina.setNombre("Ara");
        bailarina.setNacionalidad("Alemana");
        bailarina.setEdad(15);
        bailarina.setvestimenta("Blusa color morado con falda, medias y zapatos azules");
        bailarina.setipodemusicabaila("House dance");

        String msg="";
        msg+="Hola soy la bailarina "+bailarina.getNombre()+"."+
                "\n Soy de nacionalidad "+bailarina.getNacionalidad()+"."+
                "\n Tengo "+bailarina.getEdad()+" años." +","+
                "\n Mi vestimenta es: "+bailarina.getVestimenta()+"."+
                "\n Y el tipo de baile que practico es: "+bailarina.getTipodemusicabaila()+".";
        System.out.print(msg);
    }
}
