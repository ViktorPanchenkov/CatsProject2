import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.*;

public class TestCats {

    private static final Cat duplicated = new Cat("Barsic",10, LocalDateTime.now());
    private static final Cat duplicated2 = new Cat("Barsic",10, LocalDateTime.now());

    private static final String[] names = {"Vasia","Petya","Kolia","Pola","Laki","Myrka","Bidon","Kurzik","Iris","Kafka"};
    LocalDateTime time = LocalDateTime.now();
    List<Cat> DuplicatedCats = new ArrayList();

    @Test
    public void DateTime(){
        System.out.println(time);
    }

    @Test
    public void ReturnTheSameCats(){
        Comparator<Cat> catComparator = new CatNameComporator().thenComparing(new CatWeightComporator());
        TreeSet<Cat> cats = new TreeSet<>(catComparator);
        cats.add(new Cat("Barsic",20,time));
        cats.add(new Cat("Laki",10,time));

        for(Cat cat : cats){
            System.out.println(cat.getName()+ " "+ cat.getWeight()+ " " + cat.getBirthDate());

        }

    }
    @Test
    public void CheckThatCatsNotEqual(){
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated2);
        Random random = new Random();
        for (int i =0; i<10; i++){
            Cat cat = new Cat(
                    names[random.nextInt(9)],
                    random.nextInt(30),
                    LocalDateTime.now());
            cats.add(cat);
        }
        cats.add(duplicated2);
        System.out.println(Arrays.toString(cats.toArray()));
        try {
            Collections.sort(cats);
        } catch (RuntimeException ex){
            Assert.fail(ex.getMessage());
        } finally {

        }

    }
}
