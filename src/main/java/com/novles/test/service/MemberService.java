package com.novles.test.service;

import com.novles.test.domain.MemberDTO;
import com.novles.test.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;
//    public List<MemberDTO.SimpleResponse> getMembers(String fie) {
//        return memberMapper.findAllByFilter().stream()
//                .map(MemberDTO.Response::of)
//                .map(MemberDTO.SimpleResponse::of)
//                .collect(Collectors.toList());
//    }

    public List<MemberDTO.Response> getMembers() {
        return memberMapper.findAllByFilter().stream()
                .map(MemberDTO.Response::of)
                .collect(Collectors.toList());
    }
}

