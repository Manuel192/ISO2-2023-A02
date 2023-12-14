package org.ModuleMAN1.Domain;

import java.util.Vector;

/** 
 * <p>
 *         <b>Class:</b></br>
 *         Member.
 * </p>
 * 
 * <p>
 *         <b>Description:</b></br>
 *         Class that represents a member.
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
public class Member {
	private String _iD;
	private String _name;
	private Member_Types _type;
	public Vector<Course> _courses = new Vector<Course>();

	public Member(String aId, String aName, Member_Types aType) {
		throw new UnsupportedOperationException();
	}

	public Member getMember(String aId) {
		throw new UnsupportedOperationException();
	}

	public boolean AssignToCourse(int aCourseID) {
		throw new UnsupportedOperationException();
	}
}