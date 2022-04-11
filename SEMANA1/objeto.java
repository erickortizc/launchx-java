package SEMANA1;

public class objeto {
    public String vestimenta, tipodemusicabaila, nombre, nacionalidad ;
    public int edad;


    public String getNombre() { return nombre;}
    public String getNacionalidad () { return nacionalidad;}
    public int getEdad() { return edad;}
    public String getVestimenta () { return vestimenta;}
    public String getTipodemusicabaila () { return tipodemusicabaila;}

    public boolean setNombre(String nombre)
    {
        if(!nombre.isEmpty())
        {
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setNacionalidad(String nacionalidad)
    {
        if(!nacionalidad.isEmpty())
        {
            this.nacionalidad = nacionalidad;
            return true;
        }else
            return false;
    }
    public boolean setEdad(int edad)
    {
        if(edad>3)
        {
            this.edad = edad;
            return true;
        }else
            return false;
    }
    public boolean setvestimenta(String vestimenta)
    {
        if(vestimenta.isEmpty())
        {
            return false;
        }else
            this.vestimenta = vestimenta;
        return true;
    }
    public boolean setipodemusicabaila(String tipodemusicabaila)
    {
        if(!tipodemusicabaila.isEmpty())
        {
            this.tipodemusicabaila = tipodemusicabaila;
            return true;
        }else
            return false;
    }
}
