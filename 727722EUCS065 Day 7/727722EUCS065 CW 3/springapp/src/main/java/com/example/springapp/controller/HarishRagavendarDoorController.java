package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.springapp.model.HarishRagavendarDoor;
import com.example.springapp.service.HarishRagavendarDoorService;

@RestController
public class HarishRagavendarDoorController {
    @Autowired
    private HarishRagavendarDoorService ser;
    
    @PostMapping("/api/door")
    public ResponseEntity<HarishRagavendarDoor> post(@RequestBody HarishRagavendarDoor door)
    {
        if(ser.post(door))
        {
            return new ResponseEntity<>(door,HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/door")
    public ResponseEntity<List<HarishRagavendarDoor>> getAll()
    {
        List<HarishRagavendarDoor> li = ser.getAll();
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<List<HarishRagavendarDoor>> getbyId(@PathVariable int doorId)
    {
        List<HarishRagavendarDoor> li = ser.getbyDoorId(doorId);
        if(li.size()>0)
        {
            return new ResponseEntity<>(li,HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/api/door/accessType/{accessType}")
    public ResponseEntity<List<HarishRagavendarDoor>> getbyType(@PathVariable String accessType)
    {
        List<HarishRagavendarDoor> li = ser.getbyType(accessType);
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
