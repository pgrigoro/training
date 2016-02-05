package victor.training.java8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Subject {
	@FunctionalInterface
	public interface EventHandler {
		void notify(String event);
	}
	
	private List<EventHandler> observers = new ArrayList<>();
	
	public void addEventHandler(EventHandler handler) {
		observers.add(handler);
	}
	
	public void removeEventHandler(EventHandler handler) {
		observers.remove(handler);
	}
	
	public void fire() {
		for (EventHandler observer : observers) {
			observer.notify("Event now: " + new SimpleDateFormat("hh:mm:ss").format(new Date()));
		}
	}
}
