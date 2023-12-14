package org.ModuleATT1.Domain;

import java.util.Date;
/** 
 * <p>
 *         <b>Class:</b></br>
 *         Event.
 * </p>
 * 
 * <p>
 *         <b>Description:</b></br>
 *         Class that represents an Event.
 * </p>
 * 
 * <p>
 *         <b>Control change:</b></br>
 *         <ul>
 *             <li> <b>0.1.0:</b> Create class
 *             <li> <b>0.2.0:</b> Add Date attribute.
 *         </ul>
 * </p>
 * 
 * @author A02-Group-B
 * @since 0.1.0
 * @version 0.2.0
 */
public class Event {

	private String Time;
	/**
	 * ID will be of type: "Type-EventNumber"
	 */
	private String EventID;
	/**
	 * Name of the Event
	 */
	private String Name;
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
	private Event_Types Type;
	private Date date;

	/**
	 * Event constructor
	 * @param time
	 * @param Name
	 * @param Type
	 */
	public Event(String time, String Name, Event_Types Type) {
		// TODO - implement Event.Event
		throw new UnsupportedOperationException();
	}

	/**
	 * Read an event based on the name
	 * @param event_name
	 */
	public Event read_event(String event_name) {
		// TODO - implement Event.read_event
		throw new UnsupportedOperationException();
	}

	/**
	 * Add an event
	 * @param time
	 * @param name
	 */
	public void add_event(String time, String name) {
		// TODO - implement Event.add_event
		throw new UnsupportedOperationException();
	}

	/**
	 * Delete an event
	 * @param event_name
	 */
	public void delete_event(String event_name) {
		// TODO - implement Event.delete_event
		throw new UnsupportedOperationException();
	}

	/**
	 * Update time
	 * @param new_time
	 * @param new_name
	 */
	public void update_event(String new_time, String new_name) {
		// TODO - implement Event.update_event
		throw new UnsupportedOperationException();
	}

	public Event[] read_all_events() {
		// TODO - implement Event.read_all_events
		throw new UnsupportedOperationException();
	}

}