package com.kardibus.gch.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DashBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flat",referencedColumnName = "id")
    private Flats flats;


    @ManyToOne
    @JoinColumn(name = "users",referencedColumnName = "id")
    private Users users;
}
