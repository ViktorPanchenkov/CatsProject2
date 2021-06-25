import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.testng.Assert;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NewTestCats {

    @Rule
    public ErrorCollector collector = new ErrorCollector();
    private static final Cat duplicated1 = new Cat("Barsic",10, LocalDateTime.now());
    private static final Cat duplicated2 = new Cat("Barsic",10, LocalDateTime.now());

    private static final String[] names = {"Vasia","Petya","Kolia","Pola","Laki","Myrka","Bidon","Kurzik","Iris",""};

    Main main;

    @Test
    public void FindDuplicatedCat(){
        collector.addError(new Throwable("Some error"));
        main = new Main();
        try {
            Assert.assertTrue(1 == 2);
        } catch (AssertionError assertionError){
            collector.addError(assertionError);
        }

    }

    @Test
    public void TestForDuplicate(){
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated1);
       // collector.addError(new Throwable("Some error"));
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                    LocalDateTime.now());

            cats.add(cat);
        }
        cats.add(duplicated1);
        Collections.sort(cats);
        try {
            for(int i =0; i <cats.size() -1; i++){

                Assert.assertTrue(cats.get(i).compareTo(cats.get(i + 1)) == 1);

            }
        } catch (AssertionError assertionError){
            collector.addError(assertionError);
        }
        System.out.println("End");

    }
}
