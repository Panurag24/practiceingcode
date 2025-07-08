package geterandsetter;

class Employee{
	private String nameString;
	private int salary;
	private int id;
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}

public class solu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee temp1 = new Employee();
		temp1.setNameString("Joshi");
		temp1.setId(24);
		temp1.setSalary(24000);
		System.out.println(temp1.getId());
		System.out.println(temp1.getNameString());
		System.out.println(temp1.getSalary());

	}

}
