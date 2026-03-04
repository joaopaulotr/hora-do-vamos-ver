package com.example.demo.repositories;

import com.example.demo.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilagreRepository extends JpaRepository<MilagreModel, Long> {
}
