package java.com.example.test.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.com.example.test.model.Customer;
import java.util.List;


@RestController
@RequestMapping(value = "/customers")
public interface CustomerRewardsController {

    @GetMapping("")
    List<Customer> listCustomers();

    @GetMapping("/{id}")
    ResponseEntity<Customer> getCustomer(@PathVariable Integer id);
}
