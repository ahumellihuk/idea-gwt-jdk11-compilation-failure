package org.camoiloc.sample.shared;

import java.io.Serializable;

public class DTO implements Serializable, HasCode {

    private String code;

    public DTO() {
    }

    public DTO(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
