import java.sql.Timestamp;

public class Cat implements Comparable<Cat>, Cloneable {

    private String name;
    private int weight;
    private Timestamp borningdate;

    public Cat(String name, int weight, Timestamp borningdate) {
        this.name = name;
        this.weight = weight;
        this.borningdate = borningdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Timestamp getBorningdate() {
        return borningdate;
    }

    public void setBorningdate(Timestamp borningdate) {
        this.borningdate = borningdate;
    }

    @Override
    public int compareTo(Cat cat) {
        if (this == cat) {
            throw new RuntimeException("Cats are equal");
        }

        int nameResult = this.name.compareTo(cat.name);
       int birthDate = this.borningdate.compareTo(cat.borningdate);
       int weightResult = this.weight - cat.weight;
       if(nameResult == 0 && birthDate == 0 && weightResult ==0){
           throw new RuntimeException("Cats are equal");
       }
       return (nameResult + birthDate + weightResult);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", borningdate=" + borningdate +
                '}';
    }
}
