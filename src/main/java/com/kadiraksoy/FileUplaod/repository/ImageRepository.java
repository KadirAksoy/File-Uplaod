package com.kadiraksoy.FileUplaod.repository;

import com.kadiraksoy.FileUplaod.model.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageData, Long> {
}
