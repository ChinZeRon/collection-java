package Homework;

import java.time.LocalDate;

//前情提要：因为题目内没有写每只宠物购入的成本，可能是我没读懂题（？），在这里先把每只动物的成本价定为20元~
//新增了Rabbit类
//测试用例一：（1）宠物店购入5只宠物：3只狗，1只猫，1只兔子，今日共来4个顾客（A两次|B一次|C一次），然后今日歇店  (2)歇店后，有顾客D前来购买，但由于今日已暂停营业，购买失败
//测试用例二：（1）宠物店想购入3只宠物，但余额不足只能购入2只，抛出异常，程序暂停
//测试用例三：（1）宠物店成功购入购入5只宠物：3只狗，1只猫，1只兔子，歇店前来了6个顾客（A三次|B一次|C一次），招待第6个顾客时已经没有动物了，抛出异常，程序暂停
public class Test {
    public static void main(String[] args) {
        //实例化三个店铺
        MyAnimalShop shop1 = new MyAnimalShop(10000,false);
        MyAnimalShop shop2 = new MyAnimalShop(40,false);
        MyAnimalShop shop3 = new MyAnimalShop(1000,false);
        //实例化四个顾客A\B\C\D
        Customer a = new Customer("顾客A") ;
        Customer b = new Customer("顾客B") ;
        Customer c = new Customer("顾客C");
        Customer d = new Customer("顾客D");
        //实例化几只猫猫狗狗
        Cat cat1 = new Cat("A",2,"雄性");
        ChineseRuralDog dog1 = new ChineseRuralDog("大黄", 3, "雄性", true);
        ChineseRuralDog dog2 = new ChineseRuralDog("大红", 2, "雌性", true);
        ChineseRuralDog dog3 = new ChineseRuralDog("小白", 1, "雌性", true);
        Rabbit rabbit1 = new Rabbit("小兔", 1, "雌性");

        //测试用例一：shop1
        LocalDate tempDate = LocalDate.parse("2025-01-01");
        System.out.println("测试用例一！");

        shop1.buyAnimal(cat1);
        shop1.buyAnimal(dog1);
        shop1.buyAnimal(dog2);
        shop1.buyAnimal(dog3);
        shop1.buyAnimal(rabbit1);

        shop1.recieveaCostomer(a,tempDate);
        shop1.recieveaCostomer(b,tempDate);
        shop1.recieveaCostomer(c,tempDate);
        shop1.recieveaCostomer(a,tempDate);
        shop1.closed(tempDate);

        shop1.recieveaCostomer(d,tempDate);
        System.out.println("===========================================================");

        //测试用例二：shop2
        shop2.buyAnimal(cat1);
        shop2.buyAnimal(dog1);
        shop2.buyAnimal(dog2);
        System.out.println("===========================================================");

        //测试用例三：shop3
        shop3.buyAnimal(cat1);
        shop3.buyAnimal(dog1);
        shop3.buyAnimal(dog2);
        shop3.buyAnimal(dog3);
        shop3.buyAnimal(rabbit1);

        shop3.recieveaCostomer(a,tempDate);
        shop3.recieveaCostomer(b,tempDate);
        shop3.recieveaCostomer(a,tempDate);
        shop3.recieveaCostomer(c,tempDate);
        shop3.recieveaCostomer(b,tempDate);
        shop3.recieveaCostomer(a,tempDate);
        shop1.closed(tempDate);
    }
}
