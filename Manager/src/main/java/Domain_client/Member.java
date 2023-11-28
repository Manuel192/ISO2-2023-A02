package Domain_Client;

import java.util.Vector;
import Domain_Client.Course;

public class Member {
	private String _iD;
	private String _name;
	private Member_Types _type;
	public Assignment _unnamed_Assignment_;
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