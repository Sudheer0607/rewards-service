package java.com.example.test.controller.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.com.example.test.bo.CustomerRewardsBo;
import java.com.example.test.controller.CustomerRewardsController;
import java.com.example.test.model.Customer;
import java.util.List;

public class CustomerRewardsControllerImpl implements CustomerRewardsController {

    @Autowired
    CustomerRewardsBo customerRewardsBo;

    @Override
    public List<Customer> listCustomers() {
        return customerRewardsBo.findAll();
    }

    @Override
    public ResponseEntity<Customer> getCustomer(Integer id) {
        Customer customer = customerRewardsBo.findCustomerById(id);
        if (customer != null){
            return new ResponseEntity<>(customer, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
