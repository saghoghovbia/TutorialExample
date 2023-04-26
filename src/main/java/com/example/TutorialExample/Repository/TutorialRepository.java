package com.example.TutorialExample.Repository;

import com.example.TutorialExample.Model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}
