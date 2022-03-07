import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1 {

	public static void contenido(File recorrido) {
		File[] lista = recorrido.listFiles();
		for (int i = 0; i < lista.length; i++){
			File cont= lista[i];
		
			if(cont.isDirectory()) {
				System.out.println(" [*] " + cont.getName());
			}		
		}		
		
		for (int i = 0; i < lista.length; i++){
			File cont= lista[i];
			if(cont.isFile()) {
				System.out.println( " [A] " + cont.getName());
			}	
		}
	}
	
	public static void muestraInfoRuta(File recorrido) throws FileNotFoundException{
		 if (!recorrido.exists()) {
	            throw new FileNotFoundException("La ruta introducida no existe");
	        }
		if(recorrido.isFile()) {
			System.out.println("-----------");
			System.out.println(recorrido.getName()); 
			
		}else { 
				contenido(recorrido);
			}
		 }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String Rta = "";
		 
			 do {
				 try {
					 System.out.println("-----------");
				 System.out.println("Escribe una ruta");
				 Rta = sc.nextLine();
				 File recorrido = new File(Rta);
				 muestraInfoRuta(recorrido);
				 
								 
		 }catch(FileNotFoundException a) {
			 System.out.println(a);
		 }
		
			 }while(!Rta.equals(""));
			 
			 System.out.println("Fin del programa");
	}

}
