package org.camoiloc.sample.client;

import javax.validation.Validator;

import com.google.gwt.core.shared.GWT;
import de.knightsoftnet.validators.client.AbstractGwtValidatorFactory;
import de.knightsoftnet.validators.client.GwtValidation;
import de.knightsoftnet.validators.client.impl.AbstractGwtValidator;
import org.camoiloc.sample.shared.DTO;

public class ValidatorFactory extends AbstractGwtValidatorFactory {

    @GwtValidation(DTO.class)
    public interface GwtValidator extends Validator {

    }

    @Override
    public AbstractGwtValidator createValidator() {
        return GWT.create(GwtValidator.class);
    }

}
