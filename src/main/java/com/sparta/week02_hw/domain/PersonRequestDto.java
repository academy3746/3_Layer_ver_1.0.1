package com.sparta.week02_hw.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor

public class PersonRequestDto {

    private final Long id;
    private final String name;
    private final String sex;
    private final int age;
    private final String job;
    private final String address;

}
