import java.sql.Timestamp;
import java.util.*;

public class Main {










    private static final Cat duplicated = new Cat("Barsic",10, new Timestamp(System.currentTimeMillis()));
    private static final Cat duplicated2 = new Cat("Barsic",10, new Timestamp(System.currentTimeMillis()));

    private static final String[] names = {"Vasia","Petya","Kolia","Pola","Laki","Myrka","Bidon","Kurzik","Iris",""};
    public static void main(String[] args) {

//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        System.out.println(timestamp);
//        Cat barsic = new Cat("Barsic",5, timestamp);
//        System.out.println(barsic);

        testDuplicate();


    }
    static void testDuplicate(){
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated);
        Random random = new Random();
        for (int i =0; i<10; i++){
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                    new Timestamp(System.currentTimeMillis()+ random.nextLong())
            );
            cats.add(cat);

        }
        cats.add(duplicated2);

        System.out.println(Arrays.toString(cats.toArray()));
        Collections.sort(cats);
    }
}
