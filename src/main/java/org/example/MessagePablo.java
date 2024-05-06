package org.example;

abstract  public class MessagePablo<T extends TypeFlux> implements TypeFlux {

    T element;
    String id;
         <E extends TypeFlux> MessagePablo(E element){
       this. element = (T) element;
    }

    public String toString() {
        return  element.toString();
     }

  @Override
  public void affiche() {
          element.affiche();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getid() {
             return  this.id;
    }
}
