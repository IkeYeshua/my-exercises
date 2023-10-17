package Inherintance;

import java.util.concurrent.Callable;

public class Main {
    int num;

    Main(int num){
        this.num = num;

    }
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
       Shapes circle = new Circle();
        Shapes triangle = new Triangle();

     circle.area(circle);

        Main main = new Main(54);
        System.out.println(main.toString());
    }
     @Override
    public String toString(){
        return "ObjectPrint{num = " + num + "}";
    }

    
}
