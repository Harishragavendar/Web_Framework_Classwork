package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.HarishRagavendarAddress;
import com.example.ce1.repository.HarishRagavendarAddressRepo;
import com.example.ce1.repository.HarishRagavendarEmployeeRepo;

@Service
public class HarishRagavendarAddressService {
    @Autowired
    HarishRagavendarAddressRepo addressRepo;
    @Autowired
    HarishRagavendarEmployeeRepo employeeRepo;
    public HarishRagavendarAddress setAddressById(int id,HarishRagavendarAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
