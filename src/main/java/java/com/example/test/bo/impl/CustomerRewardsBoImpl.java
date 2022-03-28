package java.com.example.test.bo.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.com.example.test.bo.CustomerRewardsBo;
import java.com.example.test.model.Customer;
import java.com.example.test.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerRewardsBoImpl implements CustomerRewardsBo {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findCustomerById(Integer id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {

            return customer.get();
        }
        return null;
    }
}
