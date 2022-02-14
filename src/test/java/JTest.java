import org.approvaltests.Approvals;
import org.approvaltests.integrations.junit5.JUnit5Approvals;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JTest {
    @TestFactory
    List<DynamicTest> test_foo() {
        return IntStream.of(1, 2, 3).mapToObj(i ->
                JUnit5Approvals.dynamicTest(
                        "test " + i,
                        () -> Approvals.verify(i)
                )
        ).collect(Collectors.toList());
    }
}
