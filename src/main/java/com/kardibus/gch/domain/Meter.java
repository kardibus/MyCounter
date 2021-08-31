package com.kardibus.gch.domain;

import com.kardibus.gch.domain.enumDomain.ConditionType;
import com.kardibus.gch.domain.enumDomain.TypeMeter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Meter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeMeter typeMeter;
    @Enumerated(EnumType.STRING)
    private ConditionType conditionType;
    private Long numderCounter;
    private Date verificationStartDate;
    private Date verificationEndDate;

    @ManyToOne
    @JoinColumn(name = "price",referencedColumnName = "id")
    private Price price;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id",fetch = FetchType.LAZY)
//    private Set<Flats> flats;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id",fetch = FetchType.LAZY)
//    private Set<DataMeter> dataMeters;
}
