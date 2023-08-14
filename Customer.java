package com.example.CarRentalManagement.Entity;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "rentalcustomers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "customerAge")
    private int customerAge;
    
    @Column(name = "customerName")
    private String customerName;
    
    @Column(name = "customerEmail")
    private String customerEmail;
    
    @Column(name = "licenceNumber")
    private String licenceNumber;
  
    @Column(name = "NationIDNumber")
    private String NationIDNumber;
 
    @Column(name = "customerBooking")
    private String customerBooking;
    
    // Other attributes, getters, setters, and constructors.

    // Example of relationships (assuming one-to-many between Customer and RentalBooking)
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "customer")
    private List<RentalBooking> rentalBookings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getLicenceNumber() {
		return licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getNationIDNumber() {
		return NationIDNumber;
	}

	public void setNationIDNumber(String nationIDNumber) {
		NationIDNumber = nationIDNumber;
	}

	public String getCustomerBooking() {
		return customerBooking;
	}

	public void setCustomerBooking(String customerBooking) {
		this.customerBooking = customerBooking;
	}

	public List<RentalBooking> getRentalBookings() {
		return rentalBookings;
	}

	public void setRentalBookings(List<RentalBooking> rentalBookings) {
		this.rentalBookings = rentalBookings;
	}   
}
