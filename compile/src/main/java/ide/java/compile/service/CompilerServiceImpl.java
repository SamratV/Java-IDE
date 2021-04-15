package ide.java.compile.service;

import ide.java.compile.entity.TestCaseInput;
import ide.java.compile.entity.TestCaseOutput;
import org.apache.commons.lang3.SystemUtils;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CompilerServiceImpl implements CompilerService {

    // private final Logger logger = Logger.getLogger(CompilerServiceImpl.class.getName());

    @Override
    public TestCaseOutput execute(TestCaseInput testCaseInput) {
        // logger.info("OS is Linux: " + SystemUtils.IS_OS_LINUX);
        // logger.info("OS is Windows: " + SystemUtils.IS_OS_WINDOWS);
        // logger.info(testCaseInput.toString());

        CompilerServiceUtil util = new CompilerServiceUtil(testCaseInput);

        return util.execute();
    }
}
