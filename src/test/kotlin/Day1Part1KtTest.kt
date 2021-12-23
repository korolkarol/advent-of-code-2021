import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day1Part1KtTest {

    @Test
    internal fun `test count increases`() {
        val asSequence: Sequence<Long> = listOf(199L, 200L, 208L, 210L, 200L, 207L, 240L, 269L, 260L, 263L).asSequence()
        val countIncreases = asSequence.countIncreases()
        assertEquals(7, countIncreases)
    }
}