import org.approvaltests.Approvals
import org.approvaltests.integrations.junit5.JUnit5Approvals
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory

class KTest {
    @TestFactory
    fun test_foo(): List<DynamicTest> {
        return listOf(1, 2, 3).map {
            JUnit5Approvals.dynamicTest("test $it") {
                Approvals.verify(it)
            }
        }
    }
}