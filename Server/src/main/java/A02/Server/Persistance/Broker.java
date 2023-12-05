package A02.Server.Persistance;

import java.util.Vector;

/** 
 * <p>
 *         <b>Class:</b></br>
 *         Broker
 * </p>
 * 
 * <p>
 *         <b>Description:</b></br>
 *         Class to manages the access to the database
 * </p>
 * 
 * <p>
 *         <b>Control change:</b></br>
 *         <ul>
 *             <li> <b>0.1.0:</b> Create class.
 *	       <li> <b>0.2.0:</b> Change methods.
 *	       <li> <b>0.2.1:</b> Correct wrong encoding.
 *         </ul>
 * </p>
 * 
 * @author A02-Group-B
 * @since 0.1.0
 * @version 0.2.1
 */

public class Broker {

	private static Broker mInstance;

	private Broker() {
		// TODO - implement Broker.Broker
		throw new UnsupportedOperationException();
	}

	public static void getBroker() {
		// TODO - implement Broker.getBroker
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public int add(String sql) {
		// TODO - implement Broker.add
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public Vector<Vector<Object>> read(String sql) {
		// TODO - implement Broker.read
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public int update(String sql) {
		// TODO - implement Broker.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sql
	 */
	public int delete(String sql) {
		// TODO - implement Broker.delete
		throw new UnsupportedOperationException();
	}

	public Broker get_broker() {
		// TODO - implement Broker.get_broker
		throw new UnsupportedOperationException();
	}

	public void connect() {
		// TODO - implement Broker.connect
		throw new UnsupportedOperationException();
	}

	public void disconnect() {
		// TODO - implement Broker.disconnect
		throw new UnsupportedOperationException();
	}

}
