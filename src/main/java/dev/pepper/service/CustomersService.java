package dev.pepper.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.pepper.integration.CustomerDTO;

@ApplicationScoped
public class CustomersService {

    public List<CustomerDTO> list () {
        return List.of(new CustomerDTO("Jotaro Kujo","oraora@starplatinium.jojo"));
    }
}
