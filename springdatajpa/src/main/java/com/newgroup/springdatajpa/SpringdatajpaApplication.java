package com.newgroup.springdatajpa;

 

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

 

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{

 

    @Autowired
    CustomerRepository customerRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(SpringdatajpaApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {
        
        //Insert and Edit record
        //Customer customer1=new Customer(101,"Robert","robert@somemail.com",LocalDate.of(1990, 1, 2));
        //customerRepository.save(customer1);
        //Customer customer2=new Customer(102,"Ruby","ruby@somemail.com",LocalDate.of(1992, 3, 2));
        //customerRepository.save(customer2);
        //System.out.println("Object saved");
        
        //Fetch record(s)
        //Customer customer=null;
        /*Optional<Customer>optional=customerRepository.findById(101);
        if(optional.isPresent())
            customer=optional.get();
        else
            throw new CustomerException("Customer with given id not found");
        System.out.println(customer);*/
        
        /*List<Customer>list=(List)customerRepository.findAll();
        Iterator<Customer>it=list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        */
        
        //Delete record
        Customer customer=null;
        customerRepository.findById(101);
        Optional<Customer>optional=customerRepository.findById(101);
        if(optional.isPresent()) {
            customer=optional.get();
            //customerRepository.delete(customer);
            customerRepository.deleteById(101);
            System.out.println("Object removed");
        }
        else {
            throw new CustomerException("Customer with given id not found");
        }
    }

 

}