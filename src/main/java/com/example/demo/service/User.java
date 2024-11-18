package com.example.demo.service;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@ToString
public class User {

    @Id // primary Key 는 이 녀석이다
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 키를 어떻게 생성할 것인지,
    // id 넣을 떄 우리가 idGenerater 로 채번했었는데
    // strategy = GenerationType.AUTO) 생성방식을 JPA 자바에게 이관
    // IDENTITY : DB에게 채번방식에 대한 책임을 준다, DB가 채번
    @Setter
    private Integer id;
    private String name;
    private Integer age;
    private String job;
    private String specialty;
    private LocalDateTime createdAt;
}
