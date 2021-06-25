import org.junit.Rule;
import org.junit.rules.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class RuleTest {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void RuleTest(){
    collector.addError(new Throwable("First thing went wrong"));
    collector.addError(new Throwable("second thing went wrong"));

    }

    @Rule
    public final TestName name = new TestName();

    @Test
    public void TestMethod(){
        
    }
}
