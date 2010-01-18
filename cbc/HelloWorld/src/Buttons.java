

import cbccore.events.Event;
import cbccore.events.EventDispatcher;
import cbccore.events.EventEmitter;
import cbccore.events.EventListenerAdapter;
import cbccore.motors.listeners.StopMotors;
import cbccore.sensors.buttons.ButtonEmitter;

public class Buttons {
	public void run() {
		ButtonEmitter.getThread().run();
		EventDispatcher dispatch = EventDispatcher.getInstance();
		dispatch.addEventListener(ButtonEmitter.getInstance(), new ButtonEmitter.AButtonPressed(), new EventListenerAdapter() {
			@Override
			public void eventDispatched(EventEmitter emitter, Event type) {
				System.out.println("A Button Pressed!");
			}
		});
		dispatch.addEventListener(ButtonEmitter.getInstance(), new ButtonEmitter.AButtonReleased(), new EventListenerAdapter() {
			@Override
			public void eventDispatched(EventEmitter emitter, Event type) {
				System.out.println("A Button Released!");
			}
		});
		dispatch.addEventListener(ButtonEmitter.getInstance(), new ButtonEmitter.BlackButtonPressed(), new StopMotors());
		dispatch.emit(ButtonEmitter.getInstance(), new ButtonEmitter.AButtonPressed());
	}
}