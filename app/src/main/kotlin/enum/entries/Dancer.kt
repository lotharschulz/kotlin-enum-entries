package enum.entries

enum class Dancer(val firstName: String, val lastName: String) {
    SAMBA("Beatriz", "Santos"),
    WALTZ("Emma", "Steiner"),
    TANGO("Santino", "Gomez"),
}

@OptIn(ExperimentalStdlibApi::class)
val dancersLastNames = Dancer.entries.associateBy { it.lastName }.keys

@OptIn(ExperimentalStdlibApi::class)
val dancersFirstNames = Dancer.entries.associateBy { it.firstName }.keys

fun main() {
    println(dancersFirstNames)
    println(dancersLastNames)
}
