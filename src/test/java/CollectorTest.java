import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.testng.annotations.Test;

public class CollectorTest {


    int array [] = {1,2,3,4,5};
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void CollectorTest(){

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


        Result result = JUnitCore.runClasses(ErrorCollector.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }


    }
}
