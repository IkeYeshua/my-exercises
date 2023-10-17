package abstractclass;

public abstract class Parent {

     int age;

     String name;

     final int value = 2345;

     public  Parent(int age, String name){
         this.age = age;
         this.name = name;

     }
    public abstract void parentsFirstSon();


    public  abstract  void parentsFirstDaughter();

}