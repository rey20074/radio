import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        RadioArchRey radio=new RadioArchRey();
        Scanner scan=new Scanner(System.in);

        int opcion=0,opcion1=0;

        System.out.println("------------RADIO--------------");

        while (!radio.isOn()) {

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

        while(radio.isOn()==true) {

            System.out.println("�Que acci�n desea realizar? "+ "\n1. Apagar " + "\n2. Escoger frecuencia (AM O FM) "+"\n3. Guardar una Emisora" + "\n4. Siguiente emisora " + "\n5. Escoger una emisora.");
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
                        System.out.println("A que boton desea asignar la emisora?");
                        boolean s = true;
                        int botoncito = 0;
                        while(s){
                            try{
                                botoncito = scan.nextInt();
                                if(botoncito<13 && botoncito>0){
                                    s = false;
                                }else{
                                    System.out.println("El boton que escogio no existe");
                                }
                            }catch(Exception e){
                                System.out.println("Ingrese uno de los botones validos.");

                            }
                        }
                        radio.asignar(botoncito);
                        break;
                    case 4:
                        radio.incrementar();
                        break;
                    case 5:
                        System.out.println("Que boton desea presionar.");
                        s = true;
                        int botoneta = 0;
                        try{
                            while(s){
                                botoneta = scan.nextInt();
                                if(botoneta<13 && botoneta>0){
                                    s =false;
                                }else{
                                    System.out.println("Escoja uno de los 12 botones.");
                                }
                            }
                        }catch(Exception e){
                            System.out.println("Esa opcion no es valida.");
                        }
                        radio.emisoras(botoneta);
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
