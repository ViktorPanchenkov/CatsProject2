import java.util.Comparator;

public class CatWeightComporator implements Comparator<Cat> {
    @Override
    public int compare(Cat cat1, Cat cat2) {
        if(cat1.getWeight()> cat2.getWeight()){
            return 1;
        } else if(cat1.getWeight() < cat2.getWeight()){
            return -1;
        } else {
            return 0;
        }
    }
}
