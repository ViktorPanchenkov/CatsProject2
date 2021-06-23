import java.util.Comparator;

public class CatsComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getBirthDate().compareTo(cat2.getBirthDate());
    }
}
