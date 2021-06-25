import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

public class CollectionCollectorWithManualCats {

    Date date = new Date();
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    private static final Cat2WithDate duplicated1 = new Cat2WithDate("Barsic",10, new Timestamp(System.currentTimeMillis()));
    private static final Cat2WithDate duplicated2 = new Cat2WithDate("Barsic",10, new Timestamp(System.currentTimeMillis()));
    private static final String[] names = {"Vasia","Petya","Kolia","Pola","Laki","Myrka","Bidon","Kurzik","Iris","Kafka"};

    List<Cat2WithDate> cats = new ArrayList<>();
    @Test
    public void TestCollectionOnDuplicatedCats(){
     cats.add(duplicated1);
        Random random = new Random();
     for (int i = 0; i<13; i++){
         Cat2WithDate cat = new Cat2WithDate(names[random.nextInt(8)],
                 random.nextInt(27),
                 new Timestamp(System.currentTimeMillis()));

         cats.add(cat);
     }
     cats.add(duplicated2);
     Collections.sort(cats);

     System.err.println(Arrays.toString(cats.toArray()));
       Collections.sort(cats, new Comparator<Cat2WithDate>() {
           @Override
           public int compare(Cat2WithDate cat1, Cat2WithDate cat2) {
               return cat1.getName().compareTo(cat2.getName());
           }
       });
        System.out.println(Arrays.toString(cats.toArray()));
        try {

            for (int i =0; i<cats.size() -1; i++){
                Assert.assertTrue(cats.get(i).compareTo(cats.get(i + 1)) == 1);

            }
        } catch (AssertionError assertionError){
            collector.addError(assertionError);
        }
    }

    @Test
    public void CompareWithIf(){
        Random random = new Random();
        for (int i = 0; i<13; i++){
            Cat2WithDate cat = new Cat2WithDate(names[random.nextInt(8)],
                    random.nextInt(27),
                    new Timestamp(System.currentTimeMillis()));

            cats.add(cat);
        }
        cats.add(duplicated2);
        System.err.println(Arrays.toString(cats.toArray()));
        Collections.sort(cats, new Comparator<Cat2WithDate>() {
            @Override
            public int compare(Cat2WithDate o1, Cat2WithDate o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(int i = 0; i < cats.size() -1; i++){
            try {
                if(cats.get(i).getName().compareTo(cats.get(i + 1).getName()) == 0){
                    Assert.fail("Duplicated cat");
                }
            } catch (AssertionError assertionError){
                collector.addError(assertionError);
            }

        }

        System.out.println(Arrays.toString(cats.toArray()));

    }
}
