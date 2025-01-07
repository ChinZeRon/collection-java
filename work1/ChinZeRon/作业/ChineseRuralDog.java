package Homework;

public class ChineseRuralDog extends Animal{
    //变量声明
    protected boolean isVaccineInjected ;
    //有参构造
    public ChineseRuralDog(String name, int age, String gender, boolean isVaccineInjected) {
        super(name, age, gender, 100.0);
        this.isVaccineInjected = isVaccineInjected;
    }
    //toString方法重写
    @Override
    public String toString() {
        return "name : " + this.getName() + "; age : " + this.getAge() + "; gender : " + this.getGender() + "; isVaccineInjected : " + this.isVaccineInjected;
    }
    //get、set
    public boolean getIsVaccineInjected() {
        return isVaccineInjected;
    }

    public void setIsVaccineInjected(boolean isVaccineInjected) {
        this.isVaccineInjected = isVaccineInjected;
    }
}
