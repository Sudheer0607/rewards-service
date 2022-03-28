package java.com.example.test.bo;


import org.springframework.stereotype.Service;

import java.com.example.test.model.Customer;
import java.util.List;

@Service
public interface CustomerRewardsBo {
    List<Customer> findAll();

    Customer findCustomerById(Integer id);
}
