package com.kardibus.gch.controller.api;

import com.kardibus.gch.domain.Price;
import com.kardibus.gch.repository.PriceRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/price/")
@AllArgsConstructor
@Data
public class PriceController {

    @Autowired
    private PriceRepository priceRepository;

    @GetMapping
    public Map<String,List<Price>> getAllPrice(){
        Map<String,List<Price>> list = new HashMap<>();
        list.put("price",priceRepository.findAll());
        return list;
    }
    @GetMapping("last")
    private Map<String, Optional<Price>> getLastPrice(){
        Map<String,Optional<Price>> list = new HashMap<>();
        list.put("price",priceRepository.findPriceBy());
        return list;
    }
}
