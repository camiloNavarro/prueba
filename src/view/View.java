package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Crear Arreglo Dinamico de Strings");
			System.out.println("2. requerimiento 1");
			System.out.println("3. requerimiento 2");
			System.out.println("4. requerimiento 3");
			System.out.println("5. requerimiento 4");
			System.out.println("6. requerimiento 5");
			System.out.println("7. exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
		}
}
