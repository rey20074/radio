public class RadioArchRey implements RadioGeneral{

  int boton1 = 0;
  int boton2 = 0;
  int boton3 = 0;
  int boton4 = 0;
  int boton5 = 0;
  int boton6 = 0;
  int boton7 = 0;
  int boton8 = 0;
  int boton9 = 0;
  int boton10 = 0;
  int boton11 = 0;
  int boton12 = 0;
  boolean encendido = false;
  String frec = "AM";

    
  public boolean isOn(){

  }

  public void encender(){

  }

  public void apagar(){

  }

  public void incrementar(){
    if((this.frec).equals("AM")){
      
    }

  }

  public boolean asignar(){

  }

  public boolean emisora(){

  }

  public void frecuencia(){
    if ((this.frec).equals("AM")){
      this.frec = "FM";
    }else {
      this.frec = "AM";
    }
  }

}
