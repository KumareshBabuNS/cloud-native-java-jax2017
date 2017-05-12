package com.jax;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    private CustomerClient customerClient;

    @Autowired
    public DemoRestController(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    @GetMapping(path = "/")
    public Resources<Customer> getEmAll() {
        return customerClient.getAllCustomers();
    }

}
