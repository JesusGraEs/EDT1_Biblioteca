package es.jesus.Libreria.java;

public class TestLibreria
{

	public static void main(String[] args)
	{
		Autor a1 = new Autor ("J.K. ", "Rowling ", "Britanica " );
		Autor a2 = new Autor ("Julio", "Muñoz Gijón ", "Español " );
	    Autor a3 = new Autor ("J.J.", "Benítez ", "Español ");
	    
		Libro lib1 = new Libro ("Harry Potter, y el Cáliz de Fuego ", a1, 2000, "Salamandra ", 636);
        Libro lib2 = new Libro ("El Asesino de la Regañá ", a2, 2012, "Almuzara ", 176 );
        Libro lib3 = new Libro ("Caballo de Troya 9, Caná ", a3, 2011, "Planeta ", 1160 );
        
        System.out.println("El Libro " + lib1.gettitLibro() + "tiene " + lib1.getnumPaginas() + " páginas");
        System.out.println("El Libro " + lib2.gettitLibro() + "tiene " + lib2.getnumPaginas() + " páginas");
        System.out.println("El Libro " + lib3.gettitLibro() + "tiene " + lib3.getnumPaginas() + " páginas");
	}

}
