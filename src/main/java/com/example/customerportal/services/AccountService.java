package com.example.customerportal.services;

import com.example.customerportal.viewmodels.AccountCreateViewModel;
import com.example.customerportal.viewmodels.AccountUpdateViewModel;
import com.example.customerportal.viewmodels.AccountViewModel;

import java.util.List;

public interface AccountService {
    List<AccountViewModel> get();
    AccountViewModel get(int id);
    AccountViewModel create(AccountCreateViewModel viewModel);
    void update(int id, AccountUpdateViewModel viewModel);
    void delete(int id);
}
