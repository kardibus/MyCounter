package com.kardibus.gch.controller.api;

import com.kardibus.gch.domain.Meter;
import com.kardibus.gch.repository.MeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/meter/")
public class MeterController {

    @Autowired
    private MeterRepository meterRepository;

    @GetMapping()
    public List<Meter> getAllMeter() {
        return meterRepository.findAll();
    }

    @PostMapping()
    public void addMeter(@RequestBody Meter meter) {
        meterRepository.save(meter);
    }

    @DeleteMapping()
    public void deleteDataMeter(@RequestBody Meter meter) {
        meterRepository.deleteById(meter.getId());
    }

    @PutMapping
    public void updateDataMeter(@RequestBody Meter meter) {
        Meter m = meterRepository.getById(meter.getId());
        m.setTypeMeter(meter.getTypeMeter());
        m.setConditionType(meter.getConditionType());
        m.setNumderCounter(meter.getNumderCounter());
        m.setVerificationEndDate(meter.getVerificationEndDate());
        m.setVerificationStartDate(meter.getVerificationStartDate());
        meterRepository.save(m);
    }
}
