package Homework;

import java.time.LocalDate;

public class Customer {
    private String name ;
    private int times ;
    private LocalDate latestArrivalTime ;

    //构造函数
    public Customer(String name) {
        this.name = name;
        times = 0 ;
    }

    //get set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getLatestArrivalTime() {
        return latestArrivalTime;
    }

    public void setLatestArrivalTime(LocalDate latestArrivalTime) {
        this.latestArrivalTime = latestArrivalTime;
    }

    //重写toString()
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", times=" + times +
                ", latestArrivalTime=" + latestArrivalTime +
                '}';
    }
}
