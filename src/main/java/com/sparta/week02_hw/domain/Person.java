package com.sparta.week02_hw.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sex;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private String address;

    public Person(Long id,String name, String sex, int age, String job, String address){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.job = job;
        this.address = address;
    }

    public Person(PersonRequestDto requestDto){
        this.id = requestDto.getId();
        this.name = requestDto.getName();
        this.sex = requestDto.getSex();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
        this.address = requestDto.getAddress();
    }

    public void update(PersonRequestDto requestDto){
        this.id = requestDto.getId();
        this.name = requestDto.getName();
        this.sex = requestDto.getSex();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
        this.address = requestDto.getAddress();
    }
}
