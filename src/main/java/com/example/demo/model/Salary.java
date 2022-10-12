package com.example.demo.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "value")
    private Double value;
    @OneToOne(mappedBy = "salary", cascade = CascadeType.ALL)
    private User user;
}
