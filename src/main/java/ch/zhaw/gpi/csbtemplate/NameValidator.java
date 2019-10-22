package ch.zhaw.gpi.csbtemplate;

import org.camunda.bpm.engine.impl.form.validator.FormFieldValidator;
import org.camunda.bpm.engine.impl.form.validator.FormFieldValidatorContext;
import org.springframework.stereotype.Component;

@Component("stupidValidator")
public class NameValidator implements FormFieldValidator {

    @Override
    public boolean validate(Object submittedValue, FormFieldValidatorContext validatorContext) {
        String name = (String) submittedValue;

//        return name.contains("h");
        return true; //For test purpose of "hello world form"

    }
}
