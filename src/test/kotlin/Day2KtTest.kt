import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day2KtTest {

    @Test
    internal fun `test sliding window sums`() {
        val expected = listOf(607L, 618L, 618L, 617L, 647L, 716L, 769L, 792L)
        val slidingWindowSums: Sequence<Long> =
            listOf(199L, 200L, 208L, 210L, 200L, 207L, 240L, 269L, 260L, 263L).asSequence().slidingWindowSums()
        assertEquals(expected, slidingWindowSums.toList())
    }
}