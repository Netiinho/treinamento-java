package entities;

public class OutsourcedEmployee extends Employee {
	
	private double additionalCharge;

	public OutsourcedEmployee(String nameString, Integer hours, double valuePerHour, double additionalCharge) {
		super(nameString, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public OutsourcedEmployee() {
		super();
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}