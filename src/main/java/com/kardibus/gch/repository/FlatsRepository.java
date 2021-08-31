package com.kardibus.gch.repository;

import com.kardibus.gch.domain.Flats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlatsRepository extends JpaRepository<Flats,Long> {
}
