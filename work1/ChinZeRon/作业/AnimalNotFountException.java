package Homework;

public class AnimalNotFountException extends RuntimeException{
    private boolean isEmpty ;

    public AnimalNotFountException(boolean isEmpty){
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "AnimalNotFountException ： " +
                "宠物店宠物为空，无法招待顾客！";
    }
}
