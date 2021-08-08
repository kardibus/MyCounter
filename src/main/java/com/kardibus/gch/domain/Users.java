package com.kardibus.gch.domain;

import com.kardibus.gch.domain.enumDomain.Subscribe;
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
public class Users {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String email;
    @Enumerated(EnumType.STRING)
    private Subscribe subscribe;
    private Boolean active;
    private Date lastActive;
    private Date registrationDate;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id",fetch = FetchType.LAZY)
//    private Set<DashBoard> dashBoards;
}

