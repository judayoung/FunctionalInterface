import animal.Animal;
import animal.AnimalSex;
import human.Human;
import human.Sex;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceApplication {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's use some functional interfaces in Java!");
        System.out.println();

        System.out.println("-------- Predicate --------");
        int adultAge = 20;
        Predicate<Human> adultPredicate = human -> human.getAge() >= adultAge;
        Human john = new Human("John", 20, Sex.MAN);
        System.out.println(john);
        System.out.println("Is John adult? " + adultPredicate.test(john));

        System.out.println("-------- Consumer --------");
        Consumer<Human> printSkillsConsumer = human -> {
            for (int skillIndex = 0; skillIndex < human.getProgramSkillList().size(); skillIndex++) {
                System.out.println(skillIndex + " : " + human.getProgramSkillList().get(skillIndex));
            }
        };
        john.getProgramSkillList().add("java");
        System.out.println("John's programming skills : ");
        printSkillsConsumer.accept(john);
        john.getProgramSkillList().add("typescript");
        System.out.println("...add typescript");
        System.out.println("John's programming skills : ");
        printSkillsConsumer.accept(john);

        System.out.println("-------- Supplier --------");
        Supplier<Human> childSupplier = () -> new Human(null, 8);
        System.out.println("A child example : " + childSupplier.get());
        Human mimi = childSupplier.get();
        System.out.println("...make Mimi by child supply");
        mimi.setName("Mimi");
        mimi.setSex(Sex.WOMAN);
        mimi.getProgramSkillList().add("python");
        System.out.println("Mimi (a child) is : " + mimi);

        System.out.println("-------- Function<T, R> --------");
        Function<Sex, AnimalSex> convertToAnimalSex = sex -> (sex == Sex.MAN) ? AnimalSex.MALE : AnimalSex.FEMALE;
        Function<Human, Animal> convertToAnimal = human -> new Animal("human", human.getAge(), convertToAnimalSex.apply(human.getSex()), human.getProgramSkillList().size());
        System.out.println("...If John is converted into Animal");
        System.out.println(john);
        System.out.println(convertToAnimal.apply(john));

        System.out.println("-------- Comparator --------");
        Comparator<Human> programSkillCountComperator = (source, destination) -> {
            int sourceProgramSkillCount = source.getProgramSkillList().size();
            int destinationProgramSkillCount = destination.getProgramSkillList().size();
            return (sourceProgramSkillCount > destinationProgramSkillCount) ? 1 : (sourceProgramSkillCount == destinationProgramSkillCount) ? 0 : -1;
        };
        System.out.println("...compare John's skill count with Mimi's skill count.");
        System.out.println("...(result, winner) : (1, John) (0, SAME), (-1, Mimi)");
        System.out.println("result is : " + programSkillCountComperator.compare(john, mimi));

        System.out.println("-------- Runnable --------");
        System.out.println("Let's see if Tom's weight increases or decreases!");
        Runnable runHuman = () -> {
            Human tom = new Human("Tom", Sex.MAN, 83);
            tom.printWeight();
            tom.eat();
            tom.walk();
            tom.eat();
            tom.eat();
            tom.jog();
            tom.jog();
        };
        runHuman.run();

    }

}
