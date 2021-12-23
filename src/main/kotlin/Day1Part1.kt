fun Sequence<Long>.countIncreases(): Long {
    var prev: Long? = null
    return fold(0L) { acc, i ->
        if (prev?.let { i > it } == true) {
            prev = i; acc + 1
        } else {
            prev = i; acc
        }
    }
}
