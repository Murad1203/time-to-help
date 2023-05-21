package com.time_to_help.time_to_help.repository;

import com.time_to_help.time_to_help.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepo extends JpaRepository<Announcement, Integer> {
}
