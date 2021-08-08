package com.kardibus.gch.domain;

import com.kardibus.gch.domain.enumDomain.ConditionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DataMeter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long readings;
    private Date checkDate;


    @ManyToOne
    @JoinColumn(name = "meter", referencedColumnName = "id")
    private Meter meter;
}
