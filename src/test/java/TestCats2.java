import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestCats2 {

    private static final String[] names = {"Vasia", "Petya", "Kolia", "Pola", "Laki", "Myrka", "Bidon", "Kurzik", "Iris", ""};
    Main main;
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void Test() {
        main = new Main();
        try {
           Assert.assertFalse(main.FindDublicatedCat());

        } catch (AssertionError assertionError){
            collector.addError(assertionError);

        }

    }

    @Test
    public void TestCollectionError() {
        List<Cat> cats = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                    LocalDateTime.now());

            cats.add(cat);
        }
        for(int i =0; i <cats.size() -1; i++) {
            if (cats.get(i).compareTo(cats.get(i + 1)) == 0) {
                collector.addError(new Throwable("We have duplicate!"));
            }
        }

    }
}
