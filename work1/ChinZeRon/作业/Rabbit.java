package Homework;

public class Rabbit extends Animal {
    //有参构造
    public Rabbit(String name, int age, String gender) {
        super(name, age, gender, 50.0);
    }
    //toString 方法重写
    @Override
    public String toString() {
        return "name : " + this.getName() + "; age :" + this.getAge() + "; gender : " + this.getGender() + "; price :" + this.getPrice();
    }
}
