package com.kardibus.gch.repository;

import com.kardibus.gch.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PriceRepository extends JpaRepository<Price,Long> {
    Optional<Price> findPriceBy();
}
