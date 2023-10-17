package abstractclass;

public class Daughter extends Parent{
    public Daughter(int age, String name) {
        super(age, name);
    }

    @Override
    public void parentsFirstSon() {
        System.out.println("name is " + name + " and age is " + age);

    }

    @Override
    public void parentsFirstDaughter() {
        System.out.println("name is " + name + " and age is " + age);

    }
}
