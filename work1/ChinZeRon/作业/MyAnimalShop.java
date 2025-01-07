package Homework;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop {
    //属性命名：余额、店铺开关、动物列表、顾客列表，全部为private属性
    protected double balance ;
    protected boolean isClosed ;
    protected double profit = 0 ;
    protected ArrayList<Animal> animalList = new ArrayList<>();
    protected ArrayList<Customer> customerList = new ArrayList<>();

    //有参构造
    public MyAnimalShop(int balance , boolean isClosed) {
        this.balance = balance;
        this.isClosed = isClosed;
    }

    //无参构造
    public MyAnimalShop() {}

    //重写buyAnimal方法
    @Override
    public void buyAnimal(Animal animal) throws InsufficientBalanceException{
        if(this.balance < animal.getPrice()) {
            throw new InsufficientBalanceException(this.balance) ;
        }
        animalList.add(animal);
        this.balance -= 20;
    }

    //重写Closed方法
    @Override
    public void closed(LocalDate date) {
        this.isClosed = true;
        int count = 0 ;
        System.out.println("今日:" + date + "到访顾客：");
        for(Customer temp : this.customerList)
        {
            if(date == temp.getLatestArrivalTime())
            {
                System.out.println(temp.toString());
                count++ ;

            }
        }
        System.out.println("今日的营业利润为:" + (this.profit - count * 20) + "!");
        System.out.println();
    }

    //重写toString方法
    @Override
    public String toString() {
        return "店内余额为" + this.balance +
                '!';
    }

    //重写招待顾客方法
    @Override
    public void recieveaCostomer(Customer customer,LocalDate date)throws AnimalNotFountException{

        if(isClosed)
        {
            System.out.println("不好意思," + customer.getName() + "。我们已经歇业了！");
            System.out.println();
            return ;
        }

        customer.setLatestArrivalTime(date);
        customerList.add(customer);


        System.out.println("欢迎你！亲爱的" + customer.getName() + "! " );
        if(animalList.isEmpty())
        {
            throw new AnimalNotFountException(animalList.isEmpty());
        }
        else
        {
            //余额++
            Animal temp = animalList.get(animalList.size()-1);
            this.balance += temp.getPrice();
            this.profit += temp.getPrice();
            //列表中移除该动物
            animalList.remove(animalList.size()-1);
            //输出卖出的宠物、店内余额
            System.out.println("恭喜老板成功下单一只" + temp.getName() + "! 具体的信息如下：");
            System.out.println(temp.toString());
            new MyAnimalShop().toString();
            System.out.println();
        }
    }
}
