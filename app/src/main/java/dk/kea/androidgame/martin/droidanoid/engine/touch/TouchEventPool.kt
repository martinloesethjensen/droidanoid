package dk.kea.androidgame.martin.droidanoid.engine.touch

import dk.kea.androidgame.martin.droidanoid.engine.core.Pool

class TouchEventPool : Pool<TouchEvent>() {
    override fun newItem(): TouchEvent {
        return TouchEvent()
    }
}
