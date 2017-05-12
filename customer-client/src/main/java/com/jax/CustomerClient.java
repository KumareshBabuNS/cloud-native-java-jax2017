package com.jax;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("customer-service")
public interface CustomerClient {

    @GetMapping(path = "customers", consumes = "application/hal+json")
    public Resources<Customer> getAllCustomers();
}
