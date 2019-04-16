package dk.kea.androidgame.martin.droidanoid.breakoutGame

import dk.kea.androidgame.martin.droidanoid.breakoutGame.screen.MainMenuScreen
import dk.kea.androidgame.martin.droidanoid.gameengine.engine.core.GameEngine
import dk.kea.androidgame.martin.droidanoid.gameengine.engine.core.Screen

class BreakoutGame : GameEngine() {
    override fun createStartScreen(): Screen {
        music = this.loadMusic("engine/music.ogg")
        return MainMenuScreen(this)
    }

    override fun onPause() {
        super.onPause()
        music.pause()
    }

    override fun onResume() {
        super.onResume()
        music.isLooping = true
        music.play()
    }
}