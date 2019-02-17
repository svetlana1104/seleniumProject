import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ParallelTest1;
import tests.ParallelTest2;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ParallelTest1.class, ParallelTest2.class })
public class Parallel {
}
