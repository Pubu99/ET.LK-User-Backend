package com.userbecards.usercards.repository;

import com.userbecards.usercards.model.Eventcards;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Eventcards, Integer> {
    List<Eventcards> findByEventCategory(String eventCategory);
}
