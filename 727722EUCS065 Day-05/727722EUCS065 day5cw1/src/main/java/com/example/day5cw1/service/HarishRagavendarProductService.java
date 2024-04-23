package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.Product;
import com.example.day5cw1.repository.ProductRepo;

@Service
public class HarishRagavendarProductService {
    public HarishRagavendarProductRepo productRepo;
    public HarishRagavendarProductService(HarishRagavendarProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(HarishRagavendarProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,HarishRagavendarProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public HarishRagavendarProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
