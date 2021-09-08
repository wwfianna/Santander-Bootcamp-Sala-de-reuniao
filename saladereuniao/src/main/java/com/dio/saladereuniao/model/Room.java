package com.dio.saladereuniao.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String startHour;
    @Column(nullable = false)
    private String endHour;

}
