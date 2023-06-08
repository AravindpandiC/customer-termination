package com.example.customertermination.controller;

import com.example.customertermination.beans.CustomerTerminationBean;
import com.example.customertermination.service.CustomerTerminationService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/termination")
public class CustomerTerminationController {

    @Autowired
    private CustomerTerminationService customerTerminationService;

    @PostMapping("/create-termination")
    public CustomerTerminationBean createTermination(@RequestBody CustomerTerminationBean bean){
        boolean validateIncomingRequest = customerTerminationService.validateRequest(bean);
        if(validateIncomingRequest) return bean;
        CustomerTerminationBean response = customerTerminationService.createTermination(bean);
        return response;
    }

    @GetMapping("/get-details")
    public CustomerTerminationBean getDetails(@RequestParam String referenceId){
        CustomerTerminationBean response = customerTerminationService.getDetailsByReferenceId(referenceId);
        return response;
    }

}
