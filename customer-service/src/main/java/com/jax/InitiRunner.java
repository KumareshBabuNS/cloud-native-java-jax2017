package com.jax;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class InitiRunner implements CommandLineRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) throws Exception {


        List<String> strings1 = Arrays.asList("Michael", "Eberhard", "Sabine", "Joy");
        for (String name : strings1) {
            customerRepository.save(new Customer(name));
        }
    }
}
