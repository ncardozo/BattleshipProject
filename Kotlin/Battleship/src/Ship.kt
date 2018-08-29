class Ship(x1 : Int, y1 : Int, x2 : Int, y2 : Int, val maxHits : Int) {
    val posX1 = x1
    val posY1 = y1
    val posX2 = x2
    val posY2 = y2
    var sunk = false
    var hits = 0

    fun checkHit(posX: Int, posY : Int) {
        if(posX >= posX1 && posX <= posX2)
        if(hits >= maxHits) sunk = true
    }
}