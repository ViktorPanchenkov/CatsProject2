import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import javax.xml.transform.TransformerFactoryConfigurationError;

public class ErrorCollectorExample {


    int array [] = {1,2,3,4,5};
    @Rule
    public ErrorCollector collector = new ErrorCollector();


    @Test
    public void example(){

        collector.addError(new Throwable("There is an error in first Line"));
        collector.addError(new Throwable("There is an error in secound Line"));
        try {
            int a =  2 / 0;
        } catch (ArithmeticException byZero){
            collector.addError(byZero);
        }
        try {
            array[9] = 5;
        } catch (ArrayIndexOutOfBoundsException array){
            collector.addError(array);
        }

    }
}
