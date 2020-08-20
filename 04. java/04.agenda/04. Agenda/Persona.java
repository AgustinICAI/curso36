public class Persona
{
    public final static int EDAD_MAXIMA = 120;
    public final static int EDAD_MINIMA = 0;

    private String nif;
    private int edad;

    public Persona(String nif, int edad)
    {
        this.nif = nif;
        this.setEdad(edad);     
        
    }

    /* Contructor de búsqueda: equals */
    public Persona(String nif)
    {
        this.nif = nif;
    }

    public String getNif()
    {
        return nif;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setNif(String nif)
    {
        this.nif = nif;
    }

    public void setEdad(int edad)
    {
        if(edad > EDAD_MINIMA && edad < EDAD_MAXIMA)
            this.edad = edad;       
    }

    @Override
    public String toString()
    {
        return " NIF: " + nif + " Edad: " + edad;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Persona)
        {
            Persona p = (Persona) obj;
            if (nif.equals(p.getNif()))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}