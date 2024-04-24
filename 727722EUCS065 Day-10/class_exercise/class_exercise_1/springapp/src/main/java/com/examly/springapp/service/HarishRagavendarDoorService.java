package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.HarishRagavendarDoor;
import com.examly.springapp.repository.HarishRagavendarDoorRepo;

@Service
public class HarishRagavendarDoorService {
    @Autowired
    private HarishRagavendarDoorRepo doorRepo;

    public HarishRagavendarDoor postData(HarishRagavendarDoor door) {
        return doorRepo.save(door);
    }

    public List<HarishRagavendarDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public HarishRagavendarDoor updateDetail(int doorid, HarishRagavendarDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<HarishRagavendarDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<HarishRagavendarDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public HarishRagavendarDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}