package ch.zhaw.gpi.csbtemplate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 *  Generate Studiengang Number
 *
 * **/
@Component("numbergenerator")
public class NumberGenerator implements JavaDelegate {

    @Override
    public void execute(DelegateExecution de) throws Exception {

        de.setVariable("Student_NR","19-" + (double) Math.round(Math.random() * 1000) * 1000);
    }
}
