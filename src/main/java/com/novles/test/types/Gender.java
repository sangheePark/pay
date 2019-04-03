package com.novles.test.types;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.type.MappedTypes;

@Getter
@RequiredArgsConstructor
public enum Gender  implements CodeEnum{
    BOY("01", "소년"),
    GIRL("02", "소녀");

    @MappedTypes(Gender.class)
    public static class TypeHandler extends CodeEnumTypeHandler<Gender>{
        public TypeHandler(){
            super(Gender.class);
        }
    }

    @NonNull
    @JsonValue
    public String code;
    @NonNull
    public String label;
}
