package es.jesus.Libreria.java;

public class TestLibreria
{

	public static void main(String[] args)
	{
		Autor a1 = new Autor ("J.K. ", "Rowling ", "Britanica " );
		Autor a2 = new Autor ("Julio", "Mu�oz Gij�n ", "Espa�ol " );
	    Autor a3 = new Autor ("J.J.", "Ben�tez ", "Espa�ol ");
	    
		Libro lib1 = new Libro ("Harry Potter, y el C�liz de Fuego ", a1, 2000, "Salamandra ", 636);
        Libro lib2 = new Libro ("El Asesino de la Rega�� ", a2, 2012, "Almuzara ", 176 );
        Libro lib3 = new Libro ("Caballo de Troya 9, Can� ", a3, 2011, "Planeta ", 1160 );
        
        System.out.println("El Libro " + lib1.gettitLibro() + "tiene " + lib1.getnumPaginas() + " p�ginas");
        System.out.println("El Libro " + lib2.gettitLibro() + "tiene " + lib2.getnumPaginas() + " p�ginas");
        System.out.println("El Libro " + lib3.gettitLibro() + "tiene " + lib3.getnumPaginas() + " p�ginas");
	}

}
