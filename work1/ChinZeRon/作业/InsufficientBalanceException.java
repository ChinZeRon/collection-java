package Homework;

public class InsufficientBalanceException extends RuntimeException {
    private double money ;

    public InsufficientBalanceException(double money){
        this.money = money;
    }

    @Override
    public String toString() {
        return "InsufficientBalanceException ： " +
                "宠物店余额不足为" + this.money + "，无法购入新的宠物！";
    }
}
