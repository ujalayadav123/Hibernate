package com.example.CarRentalManagement.Entity;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "rentalcars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="carName")
    private String carName;
    
    @Column(name="carBrand")
    private String carBrand;
    
    @Column(name="modelYear")
    private int modelYear;
    
    @Column(name="numberPlate")
     private String numberPlate;
    

    @Column(name="color")
    private String color;

    @Column(name = "price_per_day")
    private double pricePerDay;

    // Other attributes, getters, setters, and constructors.

    // Example of relationships (assuming one-to-many between Car and RentalBooking)
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "car")
    private List<RentalBooking> rentalBookings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

 
	public List<RentalBooking> getRentalBookings() {
		return rentalBookings;
	}

	public void setRentalBookings(List<RentalBooking> rentalBookings) {
		this.rentalBookings = rentalBookings;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
   
	
    
}
