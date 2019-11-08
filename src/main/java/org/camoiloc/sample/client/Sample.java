package org.camoiloc.sample.client;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import java.util.Set;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.rpc.AsyncCallback;
import org.camoiloc.sample.shared.DTO;

public class Sample implements EntryPoint {

    private final Validator validator = Validation.byDefaultProvider().configure().buildValidatorFactory().getValidator();

    public void onModuleLoad() {
        DTO data = new DTO("Hello, World!");
        Set<ConstraintViolation<DTO>> constraintViolations = validator.validate(data);
        if (constraintViolations.isEmpty()) {
            SampleService.App.getInstance().setData(data, new AsyncCallback<Void>() {

                @Override
                public void onFailure(Throwable caught) {
                    caught.printStackTrace();
                }

                @Override
                public void onSuccess(Void result) {
                    //Do nothing
                }
            });
        }
    }

}
