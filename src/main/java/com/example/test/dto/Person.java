package com.example.test.dto;

import lombok.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {


    private String name;
    private int age;

}
