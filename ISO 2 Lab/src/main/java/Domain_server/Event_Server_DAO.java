package Domain_server;

import Domain_client.Event;

/**
 * MÉTODOS:
 * 
 * ADD --> BOOLEAN
 * UPDATE --> BOOLEAN
 * DELETE --> BOOLEAN
 * READ --> Event
 * RETRIEVE_EVENTS -->list<Event>
 */
public class Event_Server_DAO {
	private Event[] _events;

	public void add(String aTime, String aName) {
		throw new UnsupportedOperationException();
	}

	public Event read(String aEvent_name) {
		throw new UnsupportedOperationException();
	}

	public void update(String aNew_time, String aNew_name) {
		throw new UnsupportedOperationException();
	}

	public void delete(String aEvent_name) {
		throw new UnsupportedOperationException();
	}

	public Event[] read_all() {
		throw new UnsupportedOperationException();
	}
}