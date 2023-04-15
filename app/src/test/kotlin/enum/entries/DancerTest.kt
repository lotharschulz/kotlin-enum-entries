package enum.entries

import kotlin.test.Test
import kotlin.test.assertNotNull

class DancerTest {
    @OptIn(ExperimentalStdlibApi::class)
    @Test
    fun hasEntries() {
        assertNotNull(Dancer.entries, "app should have a greeting")
    }

    @OptIn(ExperimentalStdlibApi::class)
    @Test
    fun hasDancersLastNames() {
        assertNotNull(dancersLastNames, "app should have a greeting")
    }

    @OptIn(ExperimentalStdlibApi::class)
    @Test
    fun hasDancersFirstNames() {
        assertNotNull(dancersFirstNames, "app should have a greeting")
    }
}
