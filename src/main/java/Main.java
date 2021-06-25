import org.junit.Rule;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.util.*;
import org.junit.rules.ErrorCollector;


public class Main {


    @Rule
    public ErrorCollector collector = new ErrorCollector();
    private static final Cat duplicated1 = new Cat("Barsic",10, LocalDateTime.now());
    private static final Cat duplicated2 = new Cat("Barsic",10, LocalDateTime.now());

    private static final String[] names = {"Vasia","Petya","Kolia","Pola","Laki","Myrka","Bidon","Kurzik","Iris",""};
    public static void main(String[] args) {


//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        System.out.println(timestamp);
//        Cat barsic = new Cat("Barsic",5, timestamp);
//        System.out.println(barsic);

                testDuplicate();

    }
    public static void testDuplicate(){
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated1);
        Random random = new Random();
        for (int i =0; i<10; i++){
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                   LocalDateTime.now());

            cats.add(cat);

        }
        cats.add(duplicated1);

        System.out.println(Arrays.toString(cats.toArray()));
        Collections.sort(cats);
        for(int i =0; i <cats.size() -1; i++){
            Assert.assertFalse(cats.get(i).compareTo(cats.get(i + 1)) ==1);

        }
    }

    public boolean FindDuplicate(){
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated1);
        Random random = new Random();
        for (int i =0; i<10; i++){
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                    LocalDateTime.now());

            cats.add(cat);

        }
        cats.add(duplicated1);
        System.out.println(Arrays.toString(cats.toArray()));
        for(int i =0; i <cats.size() -1; i++){
            if(cats.get(i).compareTo(cats.get(i + 1)) == 0){
             return false;
            } else {
                return true;
            }

        }
        return false;

    }

    public boolean FindDublicatedCat() {
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated2);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                    LocalDateTime.now());

            cats.add(cat);
        }
        cats.add(duplicated2);
        Collections.sort(cats);
        for (int i = 0; i < cats.size() - 1; i++) {
            Assert.assertTrue(cats.get(i).compareTo(cats.get(i + 1)) == 1);

        }
        return false;
    }

}
