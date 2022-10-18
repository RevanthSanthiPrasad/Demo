package collection_Streams;

public class Student {
	private String name;
	private int id;
	private String department;
	private int mark;
	private boolean isMale;
	
	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	public void setId(int b) {
		id = b;
	}
	public int getId() {
		return id;
	}
	public void setDepartment(String c) {
		department = c;
	}
	public String getDepartment() {
		return department;
	}
	public void setMark (int d) {
		mark = d;
	}
	public int getMark() {
		return mark;
	}
	public void setIsMale(boolean e) {
		isMale = e;
	}
	public boolean getIsMale() {
		return isMale;
	}
	public Student(String name, int id, String department, int mark, boolean isMale) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.mark = mark;
		this.isMale = isMale;
	}
	public String toString() {
		return "Name = " +name+", Id = "+id+", Department = "+department+", Mark = "+mark+", IsMale = "+isMale;
	}
}