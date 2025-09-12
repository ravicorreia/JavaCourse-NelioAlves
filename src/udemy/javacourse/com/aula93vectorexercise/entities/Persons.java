package udemy.javacourse.com.aula93vectorexercise.entities;

public class Persons {

    private String name;
    private double height;
    private int age;

    
    public Persons(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    public double getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Product: " + getName() + "\nPrice: " + getAge();
    }

    

}
