package com.example.CarRentalManagement;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.example.CarRentalManagement.Entity.Car;
import com.example.CarRentalManagement.Entity.Customer;
import com.example.CarRentalManagement.Entity.RentalBooking;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class)
                                                .addAnnotatedClass(Car.class)
                                                .addAnnotatedClass(RentalBooking.class);

        SessionFactory sf = con.buildSessionFactory();

        // Open a session using the session factory
        Session ss = sf.openSession();

        // Begin a transaction
        Transaction t = ss.beginTransaction();
           // Create and save a new Car         
            Car car1 = new Car();
            car1.setCarName("Maruti Wagon R+");
            car1.setCarBrand("Maruti Car");
            car1.setModelYear(2021);
            car1.setNumberPlate("MH0264");
            car1.setColor("Blue");
            car1.setPricePerDay(2400);
            ss.save(car1);
            
            Car car2 = new Car();
            car2.setCarName("Maruti Swift LXI");
            car2.setCarBrand("Maruti Car");
            car2.setModelYear(2022);
            car2.setNumberPlate("MH0264");
            car2.setColor("Black");
            car2.setPricePerDay(2200);
            ss.save(car2);
           
            Car car3 = new Car();
            car3.setCarName("Maruti Swift VXI");
            car3.setCarBrand("Maruti Car");
            car3.setModelYear(2021);
            car3.setNumberPlate("MH0487");
            car3.setColor("White");
            car3.setPricePerDay(3000);
            ss.save(car3);

           Car car4 = new Car();
           car4.setCarName("Hyundai Venue");
           car4.setCarBrand("Hyundai Car");
           car4.setModelYear(2023);
           car4.setNumberPlate("MH03084");
           car4.setColor("Brown");
           car4.setPricePerDay(1800);
           ss.save(car4);

            Car car5 = new Car();
            car5.setCarName("Toyota Fortuner TRD AT");
            car5.setCarBrand("Toyota Car");
            car5.setModelYear(2022);
            car5.setNumberPlate("MH0573");
            car5.setColor("Black");
            car5.setPricePerDay(2000);
            ss.save(car5);

            Car car6 = new Car();
            car6.setCarName("Toyota Fortuner 2.7 2WD");
            car6.setCarBrand("Toyota Car");
            car6.setModelYear(2023);
            car6.setNumberPlate("MH0264");
            car6.setColor("Blue");
            car6.setPricePerDay(2500);
            ss.save(car6);

            // Create and save a new Customer
            Customer customer1 = new Customer();
            customer1.setCustomerAge(32);
            customer1.setCustomerName("John Doe");
            customer1.setCustomerEmail("john@example.com");
            customer1.setLicenceNumber("64737467");
            customer1.setNationIDNumber("736476");
            customer1.setCustomerBooking("\"Your booking is Confirmed\"");
            ss.save(customer1);
            
            Customer customer2 = new Customer();
            customer2.setCustomerAge(25);
            customer2.setCustomerName("Ophir Denial");
            customer2.setCustomerEmail("ophir@example.com");
            customer2.setLicenceNumber("6537467");
            customer2.setNationIDNumber("54476");
            customer2.setCustomerBooking("\"Your booking is pending\"");
            ss.save(customer2);
            
            Customer customer3 = new Customer();
            customer3.setCustomerAge(28);
            customer3.setCustomerName("Yogesh Yadav");
            customer3.setCustomerEmail("yogesh@gmail.com");
            customer3.setLicenceNumber("UP55488");
            customer3.setNationIDNumber("8674675");
            customer3.setCustomerBooking("\"Your booking is Confirmed\"");
            ss.save(customer3);
            
            Customer customer4 = new Customer();
            customer4.setCustomerAge(35);
            customer4.setCustomerName("Pooja Yadav");
            customer4.setCustomerEmail("pooja@gmail.com");
            customer4.setLicenceNumber("PU123456");
            customer4.setNationIDNumber("12345");
            customer4.setCustomerBooking("\"Booking for Pooja\"");
            ss.save(customer4);
         /*   
            Customer customer5 = new Customer();
            customer5.setCustomerAge(28);
            customer5.setCustomerName("Yogesh Yadav");
            customer5.setCustomerEmail("yogesh@gmail.com");
            customer5.setLicenceNumber("MH085488");
            customer5.setNationIDNumber("875489");
            customer5.setCustomerBooking("\"Your booking is Confirmed\"");
            ss.save(customer5);
            
            Customer customer6 = new Customer();
            customer6.setCustomerAge(32);
            customer6.setCustomerName("Krishna Yadav");
            customer6.setCustomerEmail("krishna@gmail.com");
            customer6.setLicenceNumber("MH0#3488");
            customer6.setNationIDNumber("538683");
            customer6.setCustomerBooking("\"Your booking is Confirmed\"");
            ss.save(customer6);
           */    
            // Create and save a new RentalBooking
            RentalBooking rentalBooking1 = new RentalBooking();
            rentalBooking1.setCar(car1);
            rentalBooking1.setCustomer(customer1);
            LocalDate customDateOfRent1 = LocalDate.of(2023, 1, 1);
            LocalDate customDateOfReturn1 = LocalDate.of(2023, 1, 25);
            rentalBooking1.setDateOfRent(customDateOfRent1);
            rentalBooking1.setDateOfReturn(customDateOfReturn1);
            rentalBooking1.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking1.calculateTotalPrice(); // Calculate the total price
            ss.save(rentalBooking1);
            
            RentalBooking rentalBooking2 = new RentalBooking();
            rentalBooking2.setCar(car2);
            rentalBooking2.setCustomer(customer2);
            LocalDate customDateOfRent2 = LocalDate.of(2023, 1, 1);
            LocalDate customDateOfReturn2 = LocalDate.of(2023, 1, 10);
            rentalBooking2.setDateOfRent(customDateOfRent2);
            rentalBooking2.setDateOfReturn(customDateOfReturn2);
            rentalBooking2.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking2.calculateTotalPrice(); // Calculate the total pricess.save(rentalBooking2);
            ss.save(rentalBooking2);
         
            RentalBooking rentalBooking3 = new RentalBooking();
            rentalBooking3.setCar(car4);
            rentalBooking3.setCustomer(customer3);
            LocalDate customDateOfRent3 = LocalDate.of(2023, 1, 1);
            LocalDate customDateOfReturn3 = LocalDate.of(2023, 1, 2);
            rentalBooking3.setDateOfRent(customDateOfRent3);
            rentalBooking3.setDateOfReturn(customDateOfReturn3);
            rentalBooking3.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking3.calculateTotalPrice(); // Calculate the total price
            ss.save(rentalBooking3); // Save the entity with calculated numberOfDays

            RentalBooking rentalBooking4 = new RentalBooking();
            rentalBooking4.setCar(car5);
            rentalBooking4.setCustomer(customer3);
            LocalDate customDateOfRent4 = LocalDate.of(2023, 1, 1);
            LocalDate customDateOfReturn4 = LocalDate.of(2023, 1, 8);
            rentalBooking4.setDateOfRent(customDateOfRent4);
            rentalBooking4.setDateOfReturn(customDateOfReturn4);
            rentalBooking4.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking4.calculateTotalPrice(); // Calculate the total price            ss.save(rentalBooking4);
            
            RentalBooking rentalBooking5 = new RentalBooking();
            rentalBooking5.setCar(car1);
            rentalBooking5.setCustomer(customer2);
            LocalDate customDateOfRent5 = LocalDate.of(2023, 1, 1);
            LocalDate customDateOfReturn5 = LocalDate.of(2023, 1, 16);
            rentalBooking5.setDateOfRent(customDateOfRent5);
            rentalBooking5.setDateOfReturn(customDateOfReturn5);
            rentalBooking5.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking5.calculateTotalPrice(); // Calculate the total price   
            ss.save(rentalBooking5);
            
            RentalBooking rentalBooking6 = new RentalBooking();
            rentalBooking6.setCar(car5);
            rentalBooking6.setCustomer(customer1);
            LocalDate customDateOfRent6 = LocalDate.of(2023, 1, 4);
            LocalDate customDateOfReturn6 = LocalDate.of(2023, 1, 15);
            rentalBooking6.setDateOfRent(customDateOfRent6);
            rentalBooking6.setDateOfReturn(customDateOfReturn6);
            rentalBooking6.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking6.calculateTotalPrice(); // Calculate the total price
            ss.save(rentalBooking6);
            
            RentalBooking rentalBooking7 = new RentalBooking();
            rentalBooking7.setCar(car6);
            rentalBooking7.setCustomer(customer4);
            LocalDate customDateOfRent7 = LocalDate.of(2023, 1, 3);
            LocalDate customDateOfReturn7 = LocalDate.of(2023, 1, 22);
            rentalBooking7.setDateOfRent(customDateOfRent7);
            rentalBooking7.setDateOfReturn(customDateOfReturn7);
            rentalBooking7.updateNumberOfDays(); // Calculate and set the numberOfDays
            rentalBooking7.calculateTotalPrice(); // Calculate the total price
            ss.save(rentalBooking7);
          
          // Fetch the saved RentalBooking from the database and print its details
            RentalBooking fetchedBooking = ss.get(RentalBooking.class, rentalBooking1.getId());
           if (fetchedBooking != null) {
              
                System.out.println("Fetched RentalBooking Details:");
                System.out.println("ID: " + fetchedBooking.getId());
                System.out.println("Number of Days: " + fetchedBooking.getNumberOfDays());
                System.out.println("Car Brand: " + fetchedBooking.getCar().getCarBrand());
                System.out.println("Car Color: " + fetchedBooking.getCar().getColor());
                System.out.println("Car Model: " + fetchedBooking.getCar().getModelYear());
                System.out.println("Customer Name: " + fetchedBooking.getCustomer().getCustomerName());
                System.out.println("Total Price: " + fetchedBooking.getTotalPrice()); // Print total price
            }
            
            // Commit the transaction
            t.commit();
            // Close the session
            ss.close();
            // Close the session factory when done
            sf.close();
        }
    }

