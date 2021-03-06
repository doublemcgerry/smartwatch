package rz.thesis.server.serialization.action.lobby.experience;


import ga.ustre.smartwatchsensor.interfaces.WebSocketServerBinder;
import rz.thesis.server.serialization.action.lobby.LobbyAction;
import rz.thesis.server.serialization.experience.ExperienceDevicesStatus;
import utility.ActionExecutor;

public class SelectedExperienceEvent extends LobbyAction {
	private static final long serialVersionUID = -7363529515015050795L;
	ExperienceDevicesStatus status;

	@Override
	public void execute(ActionExecutor actionExecutor, WebSocketServerBinder client) {
		actionExecutor.publishMessage("Esperienza Selezionata");
	}
}
