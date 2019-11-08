package org.camoiloc.sample.server;

import javax.validation.Validation;
import javax.validation.Validator;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.camoiloc.sample.client.SampleService;
import org.camoiloc.sample.shared.DTO;

public class SampleServiceImpl extends RemoteServiceServlet implements SampleService {

    private final Validator validator = Validation.byDefaultProvider().configure().buildValidatorFactory().getValidator();

    public void setData(DTO data) {
        validator.validate(data);
    }
}
