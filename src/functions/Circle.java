package functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Circle {
    double radius;

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }


    public boolean equals(Object circle) {

        return this.radius == ((Circle) circle).radius;

    }

    public ArrayList<String> arrayList(ArrayList<String> cityList) {
        cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Nigeria");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        print(cityList);
        return cityList;
    }

    public void print(ArrayList<String> cityList) {
        System.out.println(cityList.size());
        System.out.println(cityList.toString());
    }

    public void getArray(String[] array) {
        String temp = array[0];
        String temp1 = array[2];

        array[0] = array[1];
        array[1] = temp;

        array[2] = array[3];
        array[3] = temp1;

        String temp3 = array[3];

        array[3] = array[0];
        array[0] = temp3;

        System.out.println(Arrays.toString(array));
    }

    public void myArrayList(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values: " + " ");
        int value = 1;
        while (value != 0) {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);

        }
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }

    public void aList(ArrayList<Double> lst) {
        System.out.println(lst);

    }

    public void arrays(ArrayList<String> myArrayslst) {

        System.out.println(myArrayslst);

    }

    public void invertArrayInToArrayList() {
        String[] myArrays = {"Dallas", "Dallas", "Houston", "Dallas"};
        ArrayList<String> lsts = new ArrayList<>();
        for (int i = 0; i < myArrays.length; i++) {
            if (lsts.isEmpty())
                lsts.add(Arrays.toString(myArrays));
        }
        System.out.println(lsts);
    }

    public ArrayList<Integer> shuffle() {
        Integer[] array = {3, 2, 1, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.shuffle(list);
        System.out.println(list);
        return list;
    }

    public void minValue() {
        Integer[] array = {3, 2, 1, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(Collections.min(list));
    }

    public void maxValue() {
        Integer[] array = {3, 2, 1, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(Collections.max(list));
    }

    public void sort() {
        Integer[] array = {3, 2, 1, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        java.util.Collections.sort(list);
        System.out.println(list);


    }

    public void myMaxValue() {
        Integer[] array = {3, 2, 1, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) > max)
                max = list.get(i);
        System.out.println(max);
    }

    public void myMinValue() {
        Integer[] array = {3, 2, 1, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        Integer min = list.get(0);
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) < min)
                min = list.get(i);
        System.out.println(min);

    }

   /* public void randomShuffling() {
        //Integer[] array = {3, 2, 1, 4, 5, 6};
       ArrayList<Integer> list = new ArrayList<>();
        for (int i = list.size()-1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Integer temp = list.get(i);
            list.get(i) = list.get(j);
            list.get(j) = temp;
        }


    }*/

    public void deckArray() {
        int[] deck = new int[52];
        int i;
        for (i = 0; i < deck.length; i++)
            deck[i] = i;
        System.out.println(i);
    }

}
