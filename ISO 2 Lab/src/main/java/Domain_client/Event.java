package Domain_client;

public class Event {
	protected String _time;
	/**
	 * ID will be of type: "Type-EventNumber"
	 */
	protected String _eventID;
	/**
	 * Name of the Event
	 */
	protected String _name;
	/**
	 * We have different types of Events:
	 * 
	 * Teaching
	 * 
	 * Divulgative
	 * 
	 * Informative
	 * 
	 * Management
	 */
	protected Event_Types _type;

	public Event(String aTime, String aName, Event_Types aType) {
		throw new UnsupportedOperationException();
	}

	public Event read_event(String aEvent_name) {
		throw new UnsupportedOperationException();
	}

	public void add_event(String aTime, String aName) {
		throw new UnsupportedOperationException();
	}

	public void delete_event(String aEvent_name) {
		throw new UnsupportedOperationException();
	}

	public void update_event(String aNew_time, String aNew_name) {
		throw new UnsupportedOperationException();
	}

	public Event[] read_all_events() {
		throw new UnsupportedOperationException();
	}
}