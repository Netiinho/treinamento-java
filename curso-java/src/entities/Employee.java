package entities;

public class Employee {
	
	private String nameString;
	private Integer hours;
	private double valuePerHour;
	
	public Employee() {
		
	}

	public Employee(String nameString, Integer hours, double valuePerHour) {
		this.nameString = nameString;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return hours * valuePerHour;
	}

}
