import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Radio radio=new Radio();
        Scanner scan=new Scanner(System.in);

        int opcion=0,opcion1=0;
		
		System.out.println("------------RADIO--------------");
		
		while (!radio.isON()) {

			System.out.println("�Desea encender la radio?" + "\n1. SI " + "\n2. NO");
			opcion=scan.nextInt();
				
			try {
				
				switch(opcion) {
				
				case 1:
					
					System.out.println("Radio Encendida");
					radio.encender();
					break;
					
					
				case 2:
					
					System.out.println("Ingrese una opcion...");
					break;
					
					
				default:
					
					System.out.println("Fuera de rango...");
					
					break;

			}
			
			}catch(Exception e) {
				
				System.out.println("Solo deben ser datos numericos");

				
			}
			
			
			
		}
		
		while(radio.isON()==true) {
			
			System.out.println("�Que acci�n desea realizar? "+ "\n1. Apagar " + "\n2. Escoger frecuencia (AM O FM) "+"\n3. Guardar una Emisora" + "\n4. Siguiente emisora " + "\n5. Anterior emisora ");
			opcion1=scan.nextInt();
			
			try {
				
				switch(opcion1) {
				
				case 1:
					
					System.out.println("Radio Apagada");
					radio.apagar();
					break;
				case 2:
					
					radio.frecuencia();
					break;
				case 3:
					radio.asignar();
					break;
				case 4:
					radio.incrementar();
					break;
				case 5:
					radio.disminuir();
					break;
				default:
					System.out.println("Fuera de rango...");
					
				
				
				}
				
				
				
			}catch(Exception e) {
				
				System.out.println("Solo deben ser datos numericos");
				
			}
			
			
		}
    }
}
