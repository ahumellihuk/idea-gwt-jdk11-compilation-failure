package org.camoiloc.sample.shared;

import javax.validation.constraints.NotNull;

public interface HasCode {

    @NotNull String getCode();

    void setCode(String code);
}
