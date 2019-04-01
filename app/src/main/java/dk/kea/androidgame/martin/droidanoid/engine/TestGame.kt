package dk.kea.androidgame.martin.droidanoid.engine

import dk.kea.androidgame.martin.droidanoid.engine.core.GameEngine
import dk.kea.androidgame.martin.droidanoid.engine.core.Screen

class TestGame : GameEngine() {
    override fun createStartScreen(): Screen {
        return TestScreen(this)
    }
}
