package A02.Attendee.Domain;

import java.util.Vector;

/** 
 * <p>
 *         <b>Class:</b></br>
 *         User.
 * </p>
 * 
 * <p>
 *         <b>Description:</b></br>
 *         Class that represents a logged user. It can be a teacher, a student or an administrative.
 * </p>
 * 
 * <p>
 *         <b>Control change:</b></br>
 *         <ul>
 *             <li> <b>0.1.0:</b> Creation of the class.
 *         </ul>
 * </p>
 * 
 * @author A02-Group-A
 * @since 0.1.0
 * @version 0.1.0
 */
public class User {

	private String name;
	private String surname;
	private String email;
	private String password;

	public Vector<Event> getEvents() {
		// TODO - implement User.getEvents
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param eventID
	 */
	public Event getEvent(String eventID) {
		// TODO - implement User.getEvent
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param eventID
	 * @param hour
	 */
	public void setAlarm(String eventID, int hour) {
		// TODO - implement User.setAlarm
		throw new UnsupportedOperationException();
	}

}