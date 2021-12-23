fun Sequence<Long>.slidingWindowSums(windowSize: Int = 3): Sequence<Long> {
    val slidingWindow = SlidingWindow(windowSize)
    return onEach { slidingWindow.add(it) }
        .drop(windowSize - 1)
        .map { slidingWindow.sumElements() }
}

private class SlidingWindow(private val maxSize: Int) {
    private val dequeue = ArrayDeque<Long>(maxSize)

    fun add(element: Long): SlidingWindow {
        if (dequeue.size == maxSize) {
            dequeue.removeFirst()
        }
        dequeue.add(element)
        return this
    }

    fun sumElements(): Long = dequeue.sumOf { it }
}

