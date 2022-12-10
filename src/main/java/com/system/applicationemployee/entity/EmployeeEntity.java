package com.system.applicationemployee.entity;

import lombok.Data;

import javax.persistence.*;
import java.lang.reflect.GenericArrayType;

@Entity
@Data
@Table(name="employee")
public class EmployeeEntity {

        @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String firstName;
        private  String lastName;
        private String emailId;
}
