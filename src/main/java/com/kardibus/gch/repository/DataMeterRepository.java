package com.kardibus.gch.repository;

import com.kardibus.gch.domain.DataMeter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMeterRepository extends JpaRepository<DataMeter,Long> {
}
