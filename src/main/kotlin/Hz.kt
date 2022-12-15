sealed class SomeHzFunction {
    inline operator fun invoke(count: Int) {
        asDynamic()(count)
    }
}

sealed class ValidateFunction {
    inline operator fun invoke(text: String) : Boolean {
        return asDynamic()(text)
    }
}