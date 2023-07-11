package com.MicroservicesADPTest;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

@Entity
//   buildtableofstudentdata
@Data
@FieldNameConstants

public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

//    @JoinColumn
//    @OneToOne
//
}
