package org.example.Car;

public class Car<T extends Moteur> implements Vehicle<T> {

        T element;

    public Car(T element) {
        this.element = element;
    }


    public Car() {
     }
    @Override
   public void method(){
        System.out.println("method de Car");
      }


}
