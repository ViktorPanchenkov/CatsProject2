import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TestCatJunit {



    @Rule
    public ErrorCollector collector = new ErrorCollector();
    private static final Cat2WithDate duplicated1 = new Cat2WithDate("Barsic",10, new Timestamp(System.currentTimeMillis()));
    private static final Cat2WithDate duplicated2 = new Cat2WithDate("Barsic",10, new Timestamp(System.currentTimeMillis()));
    private static final String[] names = {"Vasia","Petya","Kolia","Pola","Laki","Myrka","Bidon","Kurzik","Iris","Kafka"};


    List<Cat2WithDate> cat2WithDateList = new ArrayList<>();


}
