import lombok.Data;
import lombok.SneakyThrows;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.concurrent.ExecutionException;


@Data
public class Cat implements Comparable<Cat>, Cloneable {

    private String name;
    private int weight;
    private LocalDateTime birthDate;


    public Cat(String name, int weight, LocalDateTime birthDate) {
        this.name = name;
        this.weight = weight;
        this.birthDate = birthDate;
    }




    @Override
    public int compareTo(Cat cat) {
        if (this == cat) {
            return 0;
        }

       if(this.name.compareTo(cat.name) == 0 && this.birthDate.compareTo(cat.birthDate) == 0 && this.weight - cat.weight ==0){
           return 0;
       }
       else {
           return 1;
       }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", birthDate=" + birthDate +
                '}';
    }

}
