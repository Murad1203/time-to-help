package com.time_to_help.time_to_help.service;

import com.time_to_help.time_to_help.model.Announcement;
import com.time_to_help.time_to_help.repository.AnnouncementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnouncementService {

    @Autowired
    private AnnouncementRepo announcementRepo;

    public List<Announcement> getAllAnnouncement() {
        return announcementRepo.findAll();
    }

    public Announcement getAnnouncementById(int id) {
        Announcement announcement = null;

        Optional<Announcement> announcement1 = announcementRepo.findById(id);

        if (announcement1.isPresent()) {
            announcement = announcement1.get();
        }
        return announcement;
    }

    public void saveAnnouncement(Announcement data) {
        announcementRepo.save(data);
    }

    public void saveAnnouncementList(List<Announcement> dataList) {
        announcementRepo.saveAll(dataList);
    }

}
