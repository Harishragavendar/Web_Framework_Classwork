package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.HarishRagavendarHarishRagavendarPerson;
import com.example.springapp.service.HarishRagavendarPersonService;

@RestController
public class HarishRagavendarPersonController {
    @AutowireHarishRagavendard
    private HarishRagavendarPersonService ser;
    
    @PostMapping("/api/person")
    public ResponseEntity<HarishRagavendarHarishRagavendarPerson> post(@RequestBody HarishRagavendarHarishRagavendarPerson person)
    {
        if(ser.post(person))
        {
            return new ResponseEntity<>(person,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/person")
    public ResponseEntity<List<HarishRagavendarHarishRagavendarPerson>> getAll()
    {
        List<HarishRagavendarHarishRagavendarPerson> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<HarishRagavendarHarishRagavendarPerson>> getbyAge(@RequestParam int age)
    {
        List<HarishRagavendarHarishRagavendarPerson> li = ser.getbyAge(age);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
