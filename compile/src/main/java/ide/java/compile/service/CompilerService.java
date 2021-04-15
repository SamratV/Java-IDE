package ide.java.compile.service;

import ide.java.compile.entity.TestCaseInput;
import ide.java.compile.entity.TestCaseOutput;

public interface CompilerService {

    TestCaseOutput execute(TestCaseInput testCaseInput);
}
