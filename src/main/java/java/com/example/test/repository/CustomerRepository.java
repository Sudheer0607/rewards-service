package java.com.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.com.example.test.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
