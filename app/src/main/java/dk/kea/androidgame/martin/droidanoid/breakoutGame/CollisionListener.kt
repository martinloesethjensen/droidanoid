package dk.kea.androidgame.martin.droidanoid.breakoutGame

interface CollisionListener {
    fun collisionWall()
    fun collisionPaddle()
    fun collisionBlocks()
}