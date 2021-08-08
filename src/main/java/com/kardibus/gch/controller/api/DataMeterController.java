package com.kardibus.gch.controller.api;

import com.kardibus.gch.domain.DataMeter;
import com.kardibus.gch.repository.DataMeterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/datameter/")
public class DataMeterController {

    @Autowired
    private DataMeterRepository dataMeterRepository;

    @GetMapping()
    public List<DataMeter> getAllDataMeter() {
        return dataMeterRepository.findAll();
    }

    @PostMapping()
    public void addDataMeter(@RequestBody DataMeter dataMeter) {
        dataMeterRepository.save(dataMeter);
    }

    @DeleteMapping()
    public void deleteDataMeter(@RequestBody DataMeter dataMeter) {
        dataMeterRepository.deleteById(dataMeter.getId());
    }

    @PutMapping
    public void updateDataMeter(@RequestBody DataMeter dataMeter) {
        DataMeter dm = dataMeterRepository.getById(dataMeter.getId());
        dm.setMeter(dataMeter.getMeter());
        dm.setCheckDate(dataMeter.getCheckDate());
        dm.setReadings(dataMeter.getReadings());
        dataMeterRepository.save(dm);
    }
}
