package fh.technikum.wien;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/car")
public class CarServlet {
	
	public static List<Car> carlist = new ArrayList<Car>(){{
		add(new Car(1, "Ford", "W12830 KT", 22300.5, 150, 22.7, true));
		add(new Car(2, "Porsche", "W38488 LO", 10000.7, 220, 30.33, false));
		add(new Car(3, "VW Golf", "GS167 BS", 45345.12, 90, 18.5, true));
		add(new Car(4, "Peugeot", "K 1114AT", 10055.2, 95, 18.7, true));
		add(new Car(5, "Jeep", "MI 11234A", 30748.0, 100, 18.8, true));
	}};
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getAvailableCars() {
		
		List<Car> availcars = new ArrayList<Car>();
		
		for (Car i : carlist) {
			if (i.getRent()) {
				availcars.add(i);
			}
		}
		
		return availcars.toString();
		
		/*for (Car i : carlist) {
			return "<html>" + "<title>" + "Available Cars" + "</title>"
					+ "<body><h3>Available cars for rent:</h3>" + "<table><tr><th>"+ "Brand" + "</th><th>" + "License plate" +
					"</th><th>" + "Kilometers" + "</th><th>" + "Hoursepower" + "</th><th>" + "Cost per hour" + "</th></tr><tr><td>"
					+ i.getBrand() + "</td><td>" + i.getLicenseplate() +
					"</td><td>" + i.getKm() + "</td><td>" + i.getHoursepower() + "</td><td>" + i.getCosts() + "</td></tr></table></body>" + "</html>"; 
		}*/
	}
	
	@Path("{id}")
	public String rentCar(@PathParam("id") int id) {
		for (Car i : carlist) {
			if (i.getId() == id) {
				i.setRent(false);
			}
		}
		return carlist.toString();
	}
}