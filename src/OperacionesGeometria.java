
import java.util.Scanner;

public class OperacionesGeometria {

	public static void main (String[] args) {
	
	  System.out.print("\nBuenos Dias ");

	  String opcion;

	  Scanner sc = new Scanner(System.in);
          System.out.print("\nElige una opcion: Circulo o Rectangulo");
          opcion = sc.next();

	  if (opcion.equalsIgnoreCase("Circulo") == 1)
	  {
		double radio, result;
		Circulo circulo = new Circulo();
		System.out.print("\nDime el Radio");
		radio = sc.nextDouble();

		circulo.setRadio(radio);
		 
		 result =  circulo.circunferencia();
	 	 System.out.println("\nel valor de la circunferencia es: " + result);
			
		 result =  circulo.area();
	  	 System.out.println("\nEl area es: " + result); 
		
		
	  }

	 else { 
	
		double base, altura;
		Rectangulo operaciones = new Rectangulo();
		System.out.print("\ningresa la base del rectangulo a analizar: "); 
		base = sc.nextDouble();
		System.out.print("\ningresa la altura del rectangulo a analizar: ");
 		altura = sc.nextDouble();
	
		
		operaciones.setBase(base);
		operaciones.setAltura(altura);

	
		
	System.out.println("\nEl perimetro del rectangulo es: " + operaciones.perimetro());

	System.out.println("\nLa superficie del rectangulo es: " + operaciones.area());




	}


/*double altura;
	  double base;
     
	  Opcua opcua = new Opcua();

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa la altura: ");
          altura = sc.nextDouble();

          	  
          System.out.print("\ningresa la base: ");
          base = sc.nextDouble();
	  
 	  opcua.setAltura(altura);
	  opcua.setBase(base);

	
	  System.out.println("el perimetro es: " + opcua.perimetro()); 
			
	  
	  System.out.println("El area es: " + opcua.area()); */
        }

}
