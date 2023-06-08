package com.example.customertermination.service;

import com.example.customertermination.beans.CustomerTerminationBean;
import org.springframework.stereotype.Service;

@Service
public class CustomerTerminationService {

    public boolean validateRequest(CustomerTerminationBean bean){
        return true;
    }

    public CustomerTerminationBean createTermination(CustomerTerminationBean bean){
        CustomerTerminationBean response = new CustomerTerminationBean();
        return response;
    }

    public CustomerTerminationBean getDetailsByReferenceId(String referenceId) {
        CustomerTerminationBean response = new CustomerTerminationBean();
        return response;
    }
}
