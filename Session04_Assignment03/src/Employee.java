
public class Employee {

	private String name = "Paul";
	private int age = 32;
	private int id = 43;
	private double income = 322.4;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	public void employeeInfo(){
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
		System.out.println(income);
	}
	
	
}
