package rz.thesis.server.serialization.action.sensors;

import ga.ustre.smartwatchsensor.R;
import ga.ustre.smartwatchsensor.interfaces.WebSocketServerBinder;
import rz.thesis.server.serialization.action.Action;
import utility.ActionExecutor;

/**
 * Created by achelius on 03/01/2017.
 */

public class StartWatchingSensorAction extends Action {

    @Override
    public void execute(ActionExecutor actionExecutor, WebSocketServerBinder client) {
        actionExecutor.publishMessage("Movete!");
        actionExecutor.showIcon(R.drawable.ic_hand);
        actionExecutor.triggerVibration();
    }
}
