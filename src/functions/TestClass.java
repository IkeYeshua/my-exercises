package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));

        Circle circle = new Circle();
        ArrayList<String> list = new ArrayList<>();
        circle.arrayList(list);
        String[] myArray = {"Man", "Woman", "Girl", "Boy"};
        circle.getArray(myArray);
       // System.out.println();
          ArrayList<Integer> mylist = new ArrayList<>();
          circle.myArrayList(mylist);
          ArrayList<Double> lst = new ArrayList<>();
                 lst.add(0,1.0);
                 lst.add(1,3.0);
                 lst.add(2,4.0);
                 lst.set(0, 9.0);
               circle.aList(lst);
        System.out.println(lst.get(2));
        String[] myArrays = {"Dallas", "Dallas", "Houston", "Dallas"};
        ArrayList<String> myLst = new ArrayList<>(Arrays.asList(myArrays));
        for (int i = 0; i <= myLst.size(); i++)
              myLst.remove("Dallas");

         circle.arrays(myLst);
          circle.invertArrayInToArrayList();
          circle.shuffle();
          circle.minValue();
          circle.maxValue();
          circle.sort();
          circle.myMaxValue();
          circle.myMinValue();
         // circle.randomShuffling();
        circle.deckArray();
    }

}
