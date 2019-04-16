package dk.kea.androidgame.martin.droidanoid.gameengine.engine.touch

import dk.kea.androidgame.martin.droidanoid.gameengine.engine.core.Pool

class TouchEventPool : Pool<TouchEvent>() {
    override fun newItem(): TouchEvent {
        return TouchEvent()
    }
}
