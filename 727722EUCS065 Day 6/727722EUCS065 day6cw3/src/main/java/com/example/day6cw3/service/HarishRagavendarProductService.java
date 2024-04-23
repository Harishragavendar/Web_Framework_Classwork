package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.Product;
import com.example.day6cw3.repository.ProductRepo;

@Service
public class HarishRagavendarProductService {
    public HarishRagavendarProductRepo productRepo;
    public HarishRagavendarProductService(HarishRagavendarProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(HarishRagavendarProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<HarishRagavendarProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<HarishRagavendarProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public HarishRagavendarProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
