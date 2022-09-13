package com.eccom.store.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue (strategy = AUTO)
    private Long id;
    private String roleName;
}
