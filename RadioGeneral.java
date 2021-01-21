/*
Interfaz donde se crean los metodos de la radio en general, es comun para toda la clase

autores: Manuel Archila y Mariano Reyes

ultima modificacion: 21/01/2021
*/
public interface RadioGeneral {
  
  //metodo para comprobar si la radio esta apagada o encendida
  boolean isOn();

  //metodo para encender la radio
  void encender();

  //metodo para apagar la radio
  void apagar();

  //metodo para incrementar la emisora entre las frecuencias
  void incrementar();

  //metodo para disminuir la emisora entre las frecuencias
  void disminuir();

  //metodo para asignar una emisora a algun boton para guardarla
  boolean asignar(int a);

  //metodo para tocar alguna emisora guardada en algun boton
  boolean emisoras(int a);

  //metodo para cambiar entre frecuencias AM y FM
  void frecuencia();

}
