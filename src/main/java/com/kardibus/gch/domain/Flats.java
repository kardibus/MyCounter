package com.kardibus.gch.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Flats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String alias;
    private String street;
    private String number;
    private String country;
    private String builder;


    @ManyToOne
    @JoinColumn(name = "meter",referencedColumnName = "id")
    private Meter meter;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id",fetch = FetchType.LAZY)
//    private Set<DashBoard> dashBoards;
}
