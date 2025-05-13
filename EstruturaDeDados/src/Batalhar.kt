fun batalhar(
    time_1: Map<String, Map<String, List<String>>?>,
    time_2: Map<Int, Map<String, List<String>>?>
){
    //Pokemons do times 1
    var p1 = ""
    var p2 = ""
    var p3 = ""
    //Lista de vantagens do time 1
    var l1 = mutableListOf<String>()
    var l2 = mutableListOf<String>()
    var l3 = mutableListOf<String>()

    //Pokemons do times 2
    var r1 = ""
    var r2 = ""
    var r3 = ""
    //Lista de vantagens do time 2
    var t1 = mutableListOf<String>()
    var t2 = mutableListOf<String>()
    var t3 = mutableListOf<String>()

    time_1.forEach { t, u ->
        println("Pokemon: $t")
        p1 = t
        println(u?.values)
        l1 = u?.values
    }
    time_2.forEach { t, u ->
        println("Pokemon: $t")
        println(u?.values)
    }
}
