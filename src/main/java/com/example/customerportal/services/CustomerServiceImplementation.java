package com.example.customerportal.services;

import com.example.customerportal.repositories.CustomerRepository;
import com.example.customerportal.viewmodels.CustomerCreateViewModel;
import com.example.customerportal.viewmodels.CustomerUpdateViewModel;
import com.example.customerportal.viewmodels.CustomerViewModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepository repository;

    public CustomerServiceImplementation(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CustomerViewModel> get() {
        return null;
    }

    @Override
    public CustomerViewModel get(int id) {
        return null;
    }

    @Override
    public CustomerViewModel get(String email) {
        return null;
    }

    @Override
    public CustomerViewModel create(CustomerCreateViewModel viewModel) {
        return null;
    }

    @Override
    public void update(int id, CustomerUpdateViewModel viewModel) {

    }

    @Override
    public void delete(int id) {

    }
}
