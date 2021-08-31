package com.kardibus.gch.controller.api;

import com.kardibus.gch.domain.Flats;
import com.kardibus.gch.repository.FlatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/flats/")
public class FlatsController {

    @Autowired
    private FlatsRepository flatsRepository;

    @GetMapping()
    public List<Flats> getAllFlats() {
        return flatsRepository.findAll();
    }

    @PostMapping()
    public void addFlats(@RequestBody Flats flats) {
        flatsRepository.save(flats);
    }

    @DeleteMapping()
    public void deleteFlats(@RequestBody Flats flats) {
        flatsRepository.deleteById(flats.getId());
    }

    @PutMapping
    public void updateFlats(@RequestBody Flats flats) {
        Flats fl = flatsRepository.getById(flats.getId());
        fl.setMeter(flats.getMeter());
        fl.setAlias(flats.getAlias());
        fl.setBuilder(flats.getBuilder());
        fl.setCountry(flats.getCountry());
        fl.setNumber(flats.getNumber());
        fl.setStreet(flats.getStreet());
        flatsRepository.save(fl);
    }
}
