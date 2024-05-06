package org.example;

public interface TypeFlux {
 abstract    public void affiche();
 default void defaultVoid(){
  System.out.println("TypeFlux.defaultVoid");
  }


}
