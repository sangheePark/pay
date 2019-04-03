package com.novles.test.mapper;

import com.novles.test.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<Member> findAllByFilter();
}
