package com.novles.test.domain;

import com.novles.test.types.Gender;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

public class MemberDTO {

    @Setter
    @Getter
    public static class Filter {
        private String userName;
        private String userType;
    }

    @Getter
    @RequiredArgsConstructor
    public static class Response {
        private String userName;
        private String userType;

        @Builder
        public Response(String userName, String userType){
            this.userName = userName;
            this.userType = userType;
        }

        public static Response of(Member member){
            return Response.builder().userName(member.getName()).userType(
                    member.getGender().getLabel()
            ).build();
        }
    }

    @Getter
    public static class SimpleResponse {
        private String userName;

        @Builder
        public SimpleResponse(String userName){
            this.userName = userName;
        }

        public static SimpleResponse of(Response response){
            return SimpleResponse.builder().userName(response.getUserName()).build();
        }
    }

    @Getter
    public static class ResponseList {
        private List<Response> members;
        public ResponseList(List<Response>  members){
            this.members = members;
        }
    }
}
