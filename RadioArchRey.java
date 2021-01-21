/*
Clase donde se crea la radio que implementa la interfaz radio General

autores: Manuel Archila y Mariano Reyes

ultima modificacion: 21/01/2021
*/
public class RadioArchRey implements RadioGeneral{

  //atributos iniciales de la clase
  double boton1 = 0;
  double boton2 = 0;
  double boton3 = 0;
  double boton4 = 0;
  double boton5 = 0;
  double boton6 = 0;
  double boton7 = 0;
  double boton8 = 0;
  double boton9 = 0;
  double boton10 = 0;
  double boton11 = 0;
  double boton12 = 0;
  boolean encendido = false;
  private String frec = "AM";
  private double emiso = 530;

    
  //metodo sobrescrito para comprobar el estado de la radio
  public boolean isOn(){
    if(this.encendido == true){
      return true;
    }else{
      return false;
    }
  }
  
  //metodo sobrescrito para encender la radio
  public void encender(){
    encendido=true;
  }

  //metodo sobrescrito para apagar la radio
  public void apagar(){
    encendido=false;
  }

  //metodo sobrescrito para incrementar entre emisoras
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

  //metodo sobrescrito para disminuir entre emisoras
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

  //test para ver si le dan un 13 o no
  //metodo sobrescrito para asignar emisoras a un boton
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

  //metodo sobrescrito para poner la emisora almacenada en un boton
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

  //metodo sobrescrito para el cambio de frecuencias AM y FM
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

  //getters de atributos privados
  public String getFrec(){
    return frec;
  }

  public double getEmiso(){
    return emiso;
  }


}
