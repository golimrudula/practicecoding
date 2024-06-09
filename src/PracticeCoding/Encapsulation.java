package PracticeCoding;

public class Encapsulation {
	
  private int age;
  private String fname;
  private String lname;
  private String fullName;

	public static void main(String[] args) {
		
		Encapsulation en = new Encapsulation();		
		en.setAge(10);
		en.setFname("Sandeep");
		en.setLname("Jala");		
		
		System.out.println(en.getFullName());
	}
	
	public void setAge(int age) {
		this.age =age;	
	}
	
	public int getAge() {
		System.out.println(age);
	 return age;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFullName() {
		return fname + " " + lname;
	}
}
