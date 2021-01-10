package es.jesus.Libreria.java;

public class Libro
{
	private String titLibro;
	private Autor autor;
	private int anioPub;
	private String editorial;
	private int numPaginas;

	public Libro()
	{
		titLibro  = "";
		autor = new Autor(); 
		anioPub = 0;
		editorial = "";
		numPaginas = 0;
	}

	public Libro (String tL, Autor au, int aP, String ed, int nP)
	{
		titLibro  = tL;
		autor = au;
		anioPub = aP;
		editorial = ed;
		numPaginas = nP;
	}
	public String gettitLibro()
	{
		return titLibro;
	}
	public void settitLibro(String tL)
	{   
		titLibro = tL;
	}
	public Autor autor()
	{
		return autor;
	}
	public void setautor(Autor au)
	{   
		autor = au;
	}
	public int getanioPub()
	{
		return anioPub;
	}
	public void setanioPub(int aP)
	{   
		anioPub = aP;
	}
	public String geteditorial()
	{
		return editorial;
	}
	public void seteditorial(String ed)
	{   
		editorial = ed;
	}
	public int getnumPaginas()
	{
		return numPaginas;
	}
	public void setnumPaginas(int nP)
	{   
		numPaginas = nP;
	}
	
}
