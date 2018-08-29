class Board {
    val DIM_X = 10
    val DIM_Y = 10

    var board : Array<Array<String>> = Array(DIM_X, {i -> Array(DIM_Y, {j -> "O"})})

}