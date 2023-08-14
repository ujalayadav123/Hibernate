package com.example.CarRentalManagement.Entity;
import javax.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "rental_bookings")
public class RentalBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;   
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private LocalDate dateOfRent;
    private LocalDate dateOfReturn;
    @Column(name = "number_of_days")
    private int numberOfDays; 
    private double pricePerDay;
    @Column(name = "total_price")
    private String totalPrice;
    
   public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public LocalDate getDateOfRent() {
		return dateOfRent;
	}
    public void setDateOfRent(LocalDate dateOfRent) {
        this.dateOfRent = dateOfRent;
            updateNumberOfDays();
    }

	public LocalDate getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;    
          updateNumberOfDays();
    }
     public void updateNumberOfDays() {
       if (dateOfRent != null && dateOfReturn != null) {
        Period period = Period.between(dateOfRent, dateOfReturn);
        numberOfDays = period.getDays();
        pricePerDay = car.getPricePerDay(); // Get the price per day from associated car
        calculateTotalPrice();
    }
}	
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void calculateTotalPrice() {
	    if (dateOfRent != null && dateOfReturn != null) {
	        Period period = Period.between(dateOfRent, dateOfReturn);
	        int days = period.getDays();
	        
	        if (days >= 0) {
	            double calculatedTotalPrice = numberOfDays * pricePerDay; // Perform multiplication with numeric values
	            this.totalPrice = String.valueOf(calculatedTotalPrice);
	        } else {
	            this.totalPrice = "Invalid Date Range";
	        }
	    } else {
	        this.totalPrice = "Dates not set";
	    }
	}
}  
   
	