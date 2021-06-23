import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

public class Main {


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
    static void testDuplicate(){
        List<Cat> cats = new ArrayList<>();
        cats.add(duplicated2);
        Random random = new Random();
        for (int i =0; i<10; i++){
            Cat cat = new Cat(
                    names[random.nextInt(4)],
                    random.nextInt(30),
                   LocalDateTime.now());

            cats.add(cat);

        }
        cats.add(duplicated2);

        System.out.println(Arrays.toString(cats.toArray()));
        Collections.sort(cats);
        for(int i =0; i<cats.size() -1; i++){
            if(cats.get(i).compareTo(cats.get(i + 1)) == 0){
                System.out.println(String.format("Item %d and %d are equal", i,i+1));
                System.out.println("item 1 = " + cats.get(i));
                System.out.println("item 2 = " + cats.get(i +1));
            }
        }
    }
}
