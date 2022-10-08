package human;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private String name;
    private int age;
    private Sex sex;
    private List<String> programSkillList = new ArrayList<>();
    private int weight;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Human(String name, Sex sex, int weight) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("...eating");
        weight++;
        this.printWeight();
    }

    public void walk() {
        System.out.println("...walking");
        weight--;
        this.printWeight();
    }

    public void jog() {
        System.out.println("...jogging");
        weight -= 2;
        this.printWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public List<String> getProgramSkillList() {
        return programSkillList;
    }

    public void setProgramSkillList(List<String> programSkillList) {
        this.programSkillList = programSkillList;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", programSkillList=" + programSkillList +
                '}';
    }

    public void printWeight() {
        System.out.println("Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", weight=" + weight +
                '}');
    }
}
