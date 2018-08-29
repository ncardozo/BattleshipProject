class Battleship {

    val player1 = Player()
    val player2 = Player()

    fun placeShips(player : Player, positions : String) {
        player.placeShips(positions.split(";"))
    }

    fun won(player : Int) : Boolean {
        if(player == 1) 
            return player2.lost()
        return player1.lost()
    }

    fun main(args: Array<String>) {
        var turn = 1

        val battleship = Battleship()
        println("Enter the coordinates for player 1 in the form x1, y1, x2, y2, num pos; (4 ships are allowed)")
        val coordinates1 = readLine()!!
        battleship.placeShips(player1, coordinates1)
        println("Enter the coordinates for player 2 in the form  x1, y1, x2, y2, num pos; (4 ships are allowed)")
        val coordinates2 = readLine()!!
        battleship.placeShips(player2, coordinates2)
        while(!battleship.won(turn)) {

        }
    }
}