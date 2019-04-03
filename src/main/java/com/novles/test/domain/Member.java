package com.novles.test.domain;

import com.novles.test.types.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String name;
    private Gender gender;
}
