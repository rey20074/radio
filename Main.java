import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        RadioArchRey radio=new RadioArchRey();
        Scanner scan=new Scanner(System.in);

        int opcion=0,opcion1=0;
		
		System.out.println("------------RADIO--------------");
		
		while (radio.isOn()==false) {

			System.out.println("¿Desea encender la radio?" + "\n1. SI " + "\n2. NO");
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
		
		while(radio.isOn()==true) {
			
			System.out.println("¿Que acción desea realizar? "+ "\n1. Apagar " + "\n2. Cambiar AM a FM y FM a AM "+"\n3. Guardar una Emisora" +"\n4. Elegir Emisora"+"\n5. Siguiente emisora " + "\n6. Anterior emisora ");
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
					System.out.println("Elija el botón donde desea guardar su emisora, del 1 al 12");
					int a=scan.nextInt();
					radio.asignar(a);
					break;
				case 4:
					System.out.println("Elija el botón a reproducir, del 1 al 12");
					int b=scan.nextInt();
					radio.emisoras(b);
					break;
				case 5:
					radio.incrementar();
					break;
				case 6:
					radio.disminuir();
					break;
				default:
					System.out.println("Fuera de rango...");
				
				}
				
				
				
			}catch(Exception e) {
				
				System.out.println("Solo deben ser datos numericos");
				
			}
			
			
		}
		scan.close();
	}
}
