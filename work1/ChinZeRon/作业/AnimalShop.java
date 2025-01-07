package Homework;

import java.time.LocalDate;

public interface AnimalShop {
    void buyAnimal(Animal animal);
    void recieveaCostomer(Customer customer ,LocalDate date) throws Exception;
    void closed(LocalDate date);
}
