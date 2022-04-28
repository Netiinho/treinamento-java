package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, double price, Date manufacture) {
		super(name, price);
		this.manufactureDate = manufacture;
	}

	public Date getManufacture() {
		return manufactureDate;
	}

	public void setManufacture(Date manufacture) {
		this.manufactureDate = manufacture;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}
}