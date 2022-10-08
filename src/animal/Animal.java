package animal;

import human.Sex;

public class Animal {

    private String speices;
    private int age;
    private AnimalSex sex;
    private int survivalSkillCount;

    public Animal(String speices, int age, AnimalSex sex, int survivalSkillCount) {
        this.speices = speices;
        this.age = age;
        this.sex = sex;
        this.survivalSkillCount = survivalSkillCount;
    }

    public String getSpeices() {
        return speices;
    }

    public void setSpeices(String speices) {
        this.speices = speices;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalSex getSex() {
        return sex;
    }

    public void setSex(AnimalSex sex) {
        this.sex = sex;
    }

    public int getSurvivalSkillCount() {
        return survivalSkillCount;
    }

    public void setSurvivalSkillCount(int survivalSkillCount) {
        this.survivalSkillCount = survivalSkillCount;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speices='" + speices + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", survivalSkillCount=" + survivalSkillCount +
                '}';
    }
}
