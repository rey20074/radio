/*
Pagina del Radio
Autores: 
Alejandro Archila
Mariano Reyes
Ultima Modificación: 21/01/21

Clase de Radio, donde se llevara a cabo las acciones de la radio.
*/
public class RadioArchRey implements RadioGeneral {
  //atributos iniciales de la clase radio
  double boton1 = 550;
  double boton2 = 560;
  double boton3 = 720;
  double boton4 = 840;
  double boton5 = 89.5;
  double boton6 = 105.1;
  double boton7 = 102.9;
  double boton8 = 630;
  double boton9 = 870;
  double boton10 = 95.9;
  double boton11 = 94.3;
  double boton12 = 91.1;
  boolean encendido = false;
  private String frec = "AM";
  private double emiso = 530;


  //metodo sobrescrito para verificar el estado de la radio
  public boolean isOn(){
      if(this.encendido == true){
          return true;
      }else{
          return false;
      }
  }

  //metodo sobrescrito para encender el radio
  public void encender(){
      encendido=true;
  }

  //metodo sobrescrito para apagar el radio
  public void apagar(){
      encendido=false;
  }

  //metodo sobrescrito para incrementar la emisora del radio
  public void incrementar(){
      if((frec).equals("AM")){
          emiso = emiso +10;
          if(emiso > 1610){
              emiso = 530;
          }
      }else{
          emiso = emiso + 0.2;
          if(emiso > 107.9){
              emiso = 87.9;
          }
      }
      System.out.println("Esta es la emisora actual: "+emiso);
  }

  //metodo sobrescrito para disminuir la emisora del radio
  public void disminuir(){
      if((frec).equals("AM")){
          emiso = emiso -10;
          if(emiso > 530){
              emiso = 1610;
          }
      }else{
          emiso = emiso - 0.2;
          if(emiso < 87.9){
              emiso = 107.9;
          }
      }
      System.out.println("Esta es la emisora actual: "+emiso);
  }

  //metodo sobrescrito para asignar alguna emisora a algun boton
  public boolean asignar(int a){
      boolean prueba=true;

      switch(a){
          case 1:
              boton1=emiso;
              break;
          case 2:
              boton2=emiso;
              break;
          case 3:
              boton3=emiso;
              break;
          case 4:
              boton4=emiso;
              break;
          case 5:
              boton5=emiso;
              break;
          case 6:
              boton6=emiso;
              break;
          case 7:
              boton7=emiso;
              break;
          case 8:
              boton8=emiso;
              break;
          case 9:
              boton9=emiso;
              break;
          case 10:
              boton10=emiso;
              break;
          case 11:
              boton11=emiso;
              break;
          case 12:
              boton12=emiso;
              break;
          default:
              prueba=false;
              break;
      }
      System.out.println("Se guardó la emisora "+emiso+" en el botón "+a);
      return prueba;
  }

  //metodo sobrescrito para reproducir alguna emisora almacenada en algun boton
  public boolean emisoras(int a){
      boolean prueba=true;

      switch(a){
          case 1:
              emiso=boton1;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 2:
              emiso=boton2;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 3:
              emiso=boton3;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 4:
              emiso=boton4;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 5:
              emiso=boton5;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 6:
              emiso=boton6;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 7:
              emiso=boton7;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 8:
              emiso=boton8;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 9:
              emiso=boton9;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 10:
              emiso=boton10;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 11:
              emiso=boton11;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          case 12:
              emiso=boton12;
              if(emiso<530){
                  frec="FM";
              }
              else{
                  frec="AM";
              }
              break;
          default:
              prueba=false;
              break;
      }
      System.out.println("Se esta tocando la emisora "+emiso);
      return prueba;
  }

  //metodo sobrescrito para cambiar la frecuencia de la radio
  public void frecuencia(){
      if ((frec).equals("AM")){
          frec = "FM";
          emiso = 87.9;
      }else {
          frec = "AM";
          emiso = 530;
      }
      System.out.println("Esta es la frecuencia actual: "+frec);
  }

  //getters de los atributos principales
  public String getFrec(){
      return frec;
  }

  public double getEmiso(){
      return emiso;
  }
}
