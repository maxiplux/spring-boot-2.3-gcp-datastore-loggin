package com.livemarket.business.gcp.gcpexample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    @Id
    private Long id;
    private String name;
    private int age;

    public Dog(String name, Long id) {
        this.name=name;
        this.id=id;
    }
}
