import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionTest {


    @Test
    public void Collections(){
        Integer [] array = new Integer[] {64,42,73,41,32,53,16,57,42,74,55};
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return - (o1 -o2);
            }
        });
        System.out.println(Arrays.toString(array));
    }
}
