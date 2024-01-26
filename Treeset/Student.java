package Treeset;

import java.util.TreeSet;

public class Student implements  Comparable<Student> {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	  public Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	private String name;
	private int marks;
	  public int compareTo(Student otherStudent) {
	        // Compare based on marks
	        return Integer.compare(this.marks, otherStudent.marks);
	    }

	 
	    public String toString() {
	        return "Student{name='" + name + "', marks=" + marks + '}';
	    }
}
	

	    

