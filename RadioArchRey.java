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
  int emiso = 530;

    
  public boolean isOn(){
    if(this.encendido == true){
      return true;
    }else{
      return false;
    }

  }

  public void encender(){

  }

  public void apagar(){

  }

  public void incrementar(){
    if((this.frec).equals("AM")){
      this.emiso = this.emiso +10;
      if(this.emiso > 1610){
        this.emiso = 530;
      }
    }else{
      this.emiso = this.emiso + 0.2;
      if(this.emiso > 107.9){
        this.emiso = 87.9;
      }
    }

  }

  public boolean asignar(){

  }

  public boolean emisora(){

  }

  public void frecuencia(){
    if ((this.frec).equals("AM")){
      this.frec = "FM";
      this.emiso = 87.9;
    }else {
      this.frec = "AM";
      this.emiso = 530;
    }
  }

}
