package org.ModuleMAN1.Domain;

import java.util.Date;
import java.util.Vector;

/** 
 * <p>
 *         <b>Class:</b></br>
 *         Course.
 * </p>
 * 
 * <p>
 *         <b>Description:</b></br>
 *         Class that represents a course.
 * </p>
 * 
 * <p>
 *         <b>Control change:</b></br>
 *         <ul>
 *             <li> <b>0.1.0:</b> Add Attributes and Methods.
 *             <li> <b>0.1.1:</b> Add Javadoc.
 *         </ul>
 * </p>
 * 
 * @author A02-Group-C
 * @since 0.1.0
 * @version 0.1.1
 */
public class Course {
	private int _iD;
	private Date _year;
	public Vector<Member> _members = new Vector<Member>();

	public Course(int aId, Date aYear) {
		throw new UnsupportedOperationException();
	}

	public Course getCourse(int aId) {
		throw new UnsupportedOperationException();
	}
}