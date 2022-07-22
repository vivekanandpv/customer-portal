package com.example.customerportal.apis;

import com.example.customerportal.response.interfaces.factory.IServerResponseFactory;
import com.example.customerportal.response.interfaces.infra.IServerResponseWithBody;
import com.example.customerportal.services.CustomerService;
import com.example.customerportal.viewmodels.CustomerViewModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerApi {
    private final IServerResponseFactory responseFactory;
    private final CustomerService customerService;

    public CustomerApi(IServerResponseFactory responseFactory, CustomerService customerService) {
        this.responseFactory = responseFactory;
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<IServerResponseWithBody<List<CustomerViewModel>>> getAll() {
        return ResponseEntity.ok(
          responseFactory
                  .getServerResponseWithBody(
                          200,
                          "Customer list",
                          true,
                          customerService.get()
                  )
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<IServerResponseWithBody<CustomerViewModel>> getById(@PathVariable int id) {
        return ResponseEntity.ok(
                responseFactory
                        .getServerResponseWithBody(
                                200,
                                String.format("Customer with id: %d", id),
                                true,
                                customerService.get(id)
                        )
        );
    }

    @GetMapping("by-email/{email}")
    public ResponseEntity<IServerResponseWithBody<CustomerViewModel>> getByEmail(@PathVariable String email) {
        return ResponseEntity.ok(
                responseFactory
                        .getServerResponseWithBody(
                                200,
                                String.format("Customer with email: %s", email),
                                true,
                                customerService.get(email)
                        )
        );
    }
}
