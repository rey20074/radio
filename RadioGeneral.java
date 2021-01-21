/*
Interfaz de Radio
Autores: 
Alejandro Archila
Mariano Reyes
Ultima Modificación: 21/01/21

Interfaz que implementa los metodos principales de la radio
*/
public interface RadioGeneral {
  //comprueba el estado de la radio
  boolean isOn();

  //enciende la radio
  void encender();

  //apaga la radio
  void apagar();

  //incrementa la emisora
  void incrementar();

  //asgina alguna emisora al boton
  boolean asignar(int a);

  //reproduce la emisora de algun boton
  boolean emisoras(int a);

  //cambia la frecuencia de la radio
  void frecuencia();

}
