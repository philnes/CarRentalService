package fh.technikum.wien;

public class Car {
	
	private int id;
	private String brand;
	private String licenseplate;
	private double km;
	private int hoursepower;
	private double costs;

	public Car(String brand, String licenseplate, double km, int hoursepower, double costs) {
		super();
		this.brand = brand;
		this.licenseplate = licenseplate;
		this.km = km;
		this.hoursepower = hoursepower;
		this.costs = costs;
	}

	public Car(int id, String brand, String licenseplate, double km,
			int hoursepower, double costs) {
		super();
		this.id = id;
		this.brand = brand;
		this.licenseplate = licenseplate;
		this.km = km;
		this.hoursepower = hoursepower;
		this.costs = costs;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", licenseplate="
				+ licenseplate + ", km=" + km + ", hoursepower=" + hoursepower
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLicenseplate() {
		return licenseplate;
	}

	public void setLicenseplate(String licenseplate) {
		this.licenseplate = licenseplate;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getHoursepower() {
		return hoursepower;
	}

	public void setHoursepower(int hoursepower) {
		this.hoursepower = hoursepower;
	}
	
	public double getCosts() {
		return costs;
	}

	public void setCosts(double costs) {
		this.costs = costs;
	}
}
