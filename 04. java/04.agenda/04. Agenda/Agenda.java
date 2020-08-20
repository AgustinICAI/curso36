public class Agenda
{
    public final static int NUMERO_MAX_PERSONAS = 10;
    private Persona personas[];
    private int ultimaPersona;

    public Agenda()
    {
    	ultimaPersona = 0;
    	personas = new Persona[NUMERO_MAX_PERSONAS];
    }

    public int size()
    {
    	return ultimaPersona;
    }    

    public boolean isFull()
    {
    	return ultimaPersona==NUMERO_MAX_PERSONAS;
    }    

    public boolean add(Persona persona)
    {
    	if(ultimaPersona < NUMERO_MAX_PERSONAS)
    	{
    		personas[ultimaPersona++] = persona;
    		return true;
    	}
    	else
    		return false;
	}

	public Persona get(int posicion)
    {
    	if(posicion<ultimaPersona)
	    	return personas[posicion];
	    else
	    	return null;
	}


	public boolean contains(Persona persona)
    {
    	return this.buscar(persona)!=-1;
	}

	public int indexOf(Persona persona)
    {
    	return this.buscar(persona);
	}

	private int buscar(Persona persona)
    {
        int pos = -1;
	    for(int i=0;i<ultimaPersona;i++)
	    {
	        if(personas[i]!=null)
	        {
	            if(personas[i].equals(persona))
	            {
	                pos = i;
	                i = ultimaPersona;
	            }
	        }
	    }
	    return pos;
    }    

    public boolean remove(int posicion)
    {
    	if(posicion<ultimaPersona)
    	{
			while(posicion < ultimaPersona)
			{
				personas[posicion] = personas[posicion+1];
				posicion = posicion + 1;
			}
			personas[posicion] = null;
			ultimaPersona = ultimaPersona - 1;
            return true;
	    }
	    else
	    	return false;
    }

    public boolean remove(Persona persona)
    {
    	int posicion = this.indexOf(persona);	
    	return this.remove(posicion);
    }    

	public String toString()
    {
    	StringBuilder sb = new StringBuilder();
        for(int i=0;i<ultimaPersona;i++)
            sb.append(String.valueOf(i) + ".- " + personas[i] + "\n");
        return sb.toString();
    }    
    
}
