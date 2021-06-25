import lombok.Data;

import java.sql.Timestamp;
import java.util.Comparator;
import java.util.Date;

@Data
public class Cat2WithDate implements Comparable<Cat2WithDate> {
    private String name;
    private int weight;
    private Timestamp birthDate;

    public Cat2WithDate(String name, int weight, Timestamp birthDate) {
        this.name = name;
        this.weight = weight;
        this.birthDate =  birthDate;
    }

    @Override
    public int compareTo(Cat2WithDate cat) {
        if (this == cat){
            return 0;
        } else if (this.name.compareTo(cat.name) == 0 && this.birthDate.compareTo(cat.birthDate) == 0 && this.weight - cat.weight == 0){
            return 0;
        } else {
            return 1;
        }

    }

    @Override
    public String toString() {
        return "Cat2WithDate{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", date=" + birthDate +
                '}';
    }



}
