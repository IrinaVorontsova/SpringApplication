package net.proselyte.customerdemo.perository;

import net.proselyte.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
