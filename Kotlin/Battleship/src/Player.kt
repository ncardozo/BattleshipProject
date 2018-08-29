class Player {
    private var ships : Array<Ship> = emptyArray()
    val enemyBoard = Board()

    fun placeShips(shipPositions : List<String>) {
        var it = ships.iterator()
        shipPositions.forEach { elem ->
            val coordinates = elem.split(",")
            Ship(coordinates[0].toInt(), coordinates[1].toInt(), coordinates[2].toInt(),
                    coordinates[3].toInt(), coordinates[4].toInt())

        }
    }

    fun lost() : Boolean {
        if(ships.fold(false, {acc, s -> acc and s.sunk }))
            return true
        return false
    }
}