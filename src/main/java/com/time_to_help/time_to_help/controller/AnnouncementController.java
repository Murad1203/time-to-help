package com.time_to_help.time_to_help.controller;

import com.time_to_help.time_to_help.model.Announcement;
import com.time_to_help.time_to_help.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnnouncementController {

    @Autowired
    private AnnouncementService  service;

    // Конструктор с инъекцией зависимости сервиса через автосвязывание

    @CrossOrigin
    @GetMapping("/data/{id}")
    public Announcement getDataById(@PathVariable int id) {
        return service.getAnnouncementById(id);
    }

    @CrossOrigin
    @GetMapping("/data-all")
    public List<Announcement> getAllData() {
        return service.getAllAnnouncement();
    }
    @CrossOrigin
    @PostMapping("/data")
    public void saveData(@RequestBody Announcement data) {
        service.saveAnnouncement(data);
    }
    @CrossOrigin
    @PostMapping("/data/list")
    public void saveDataList(@RequestBody List<Announcement> dataList) {
        service.saveAnnouncementList(dataList);
    }

}
