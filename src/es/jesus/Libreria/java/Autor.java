package es.jesus.Libreria.java;

public class Autor
{
	private String nombreAutor;
	private String apellidoAutor;
	private String nacionalidadAutor;

	public Autor()
	{
		nombreAutor = "";
		apellidoAutor = "";
		nacionalidadAutor = "";	  
	}

	public Autor (String nA, String aA, String ncA)
	{
		nombreAutor = nA;
		apellidoAutor = aA;
		nacionalidadAutor = ncA;
	}
	public String getnombreAutor()
	{
		return nombreAutor;
	}
	public void setnombreAutor(String nA)
	{   
		nombreAutor = nA;
	}
	public String getapellidoAutor()
	{
		return apellidoAutor;
	}
	public void setapellidoAutor(String aA)
	{   
		apellidoAutor = aA;
	}
	public String getnacionalidadAutor()
	{
		return nacionalidadAutor;
	}
	public void setnacionalidadAutor(String ncA)
	{   
		nacionalidadAutor = ncA;
	}

}
