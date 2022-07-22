package com.example.customerportal.services;

import com.example.customerportal.exceptions.RecordNotFoundException;
import com.example.customerportal.models.Customer;
import com.example.customerportal.repositories.CustomerRepository;
import com.example.customerportal.viewmodels.CustomerCreateViewModel;
import com.example.customerportal.viewmodels.CustomerUpdateViewModel;
import com.example.customerportal.viewmodels.CustomerViewModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImplementation implements CustomerService {
    private final CustomerRepository repository;

    public CustomerServiceImplementation(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CustomerViewModel> get() {
        return repository
                .findAll()
                .stream()
                .map(c -> {
                    CustomerViewModel viewModel = new CustomerViewModel();
                    BeanUtils.copyProperties(c, viewModel);
                    return viewModel;
                })
                .collect(Collectors.toList());
    }

    @Override
    public CustomerViewModel get(int id) {
        Optional<Customer> customerOptional = repository.findById(id);
        Customer customer = customerOptional.orElseThrow(
                () -> new RecordNotFoundException(String.format("Could not find the customer with id: %d", id))
        );

        CustomerViewModel viewModel = new CustomerViewModel();
        BeanUtils.copyProperties(customer, viewModel);
        return viewModel;
    }

    @Override
    public CustomerViewModel get(String email) {
        Optional<Customer> customerOptional = repository.findCustomerByEmail(email);
        Customer customer = customerOptional.orElseThrow(
                () -> new RecordNotFoundException(String.format("Could not find the customer with email: %s", email))
        );

        CustomerViewModel viewModel = new CustomerViewModel();
        BeanUtils.copyProperties(customer, viewModel);
        return viewModel;
    }

    @Override
    public CustomerViewModel create(CustomerCreateViewModel viewModel) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(viewModel, customer);
        repository.saveAndFlush(customer);
        return get(customer.getId());
    }

    @Override
    public void update(int id, CustomerUpdateViewModel viewModel) {

    }

    @Override
    public void delete(int id) {

    }
}
