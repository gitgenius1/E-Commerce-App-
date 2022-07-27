package com.ecommerce.supekart.controller;

import com.ecommerce.supekart.dto.CustomerDTO;
import com.ecommerce.supekart.exception.SuperkartException;
import com.ecommerce.supekart.service.CustomerService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
@Validated
public class CustomerController {

    private static final Log LOGGER = LogFactory.getLog(DealsForTodayController.class);

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "login")
    public ResponseEntity<String> authenticateCustomer(@RequestBody @Valid CustomerDTO customerDTO)
            throws SuperkartException {
        Boolean flag = customerService.authenticateCustomer(customerDTO);
        if (Boolean.TRUE.equals(flag)) {
            return new ResponseEntity<>("Login Successful", HttpStatus.OK);
        }
        return new ResponseEntity<>("Invalid Credentials.", HttpStatus.FORBIDDEN);
    }

    @PostMapping(value = "customer")
    public ResponseEntity<String> addCustomer(@RequestBody @Valid CustomerDTO customerDTO) throws SuperkartException {
        LOGGER.info("Add Customer methhos started by user: " + customerDTO.getPassword());
        customerService.addCustomer(customerDTO);

        return new ResponseEntity<>("Welcome" + customerDTO.getEmailId() + ".Sign Up successful.", HttpStatus.CREATED);
    }

    @GetMapping(value = "customer")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable String emailId) throws SuperkartException {

        CustomerDTO customerDTO = customerService.getCustomerByEmailId(emailId);

        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    @PutMapping(value = "customer")
    public ResponseEntity<String> updateCustomer(@RequestBody CustomerDTO customerDTO) throws SuperkartException {

        customerService.updateCustomer(customerDTO);

        return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
    }

}
