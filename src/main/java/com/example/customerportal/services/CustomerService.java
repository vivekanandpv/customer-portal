package com.example.customerportal.services;


import com.example.customerportal.viewmodels.CustomerCreateViewModel;
import com.example.customerportal.viewmodels.CustomerUpdateViewModel;
import com.example.customerportal.viewmodels.CustomerViewModel;

import java.util.List;

public interface CustomerService {

	List<CustomerViewModel> get();

	CustomerViewModel get(int id);

	CustomerViewModel get(String email);

	CustomerViewModel create(CustomerCreateViewModel viewModel);

	void update(int id, CustomerUpdateViewModel viewModel);

	void delete(int id);
}