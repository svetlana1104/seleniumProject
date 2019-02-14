import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import tests.ParallelTest1;
import tests.ParallelTest2;

public class GridParallelTest {
    @Test
    public void runAllTests() {
        Class<?>[] classes = {ParallelTest1.class, ParallelTest2.class};
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
    }
}

