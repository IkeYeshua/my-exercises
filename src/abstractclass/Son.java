package abstractclass;

public class Son extends Parent{

    public Son(int age ,String name) {
        super(age, name);
    }

    @Override
    public void parentsFirstSon() {
        System.out.println("name is " + name + " and  age is " + age);

    }

    @Override
    public void parentsFirstDaughter() {
        System.out.println("name is " + name + " and  age is " + age);

    }
}
