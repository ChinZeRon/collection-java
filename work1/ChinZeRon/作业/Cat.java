package Homework;

public class Cat extends Animal{

    //无参构造
    public Cat(String name, int age, String gender) {
        super(name, age, gender,200.0);
    }

    @Override
    public String toString() {
        return "name : " + this.getName() + "; age : " + this.getAge() + "; gender : " + this.getGender() + "; price : " + this.getPrice();
    }
}
