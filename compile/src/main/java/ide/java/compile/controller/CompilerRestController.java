package ide.java.compile.controller;

import ide.java.compile.entity.TestCaseInput;
import ide.java.compile.entity.TestCaseOutput;
import ide.java.compile.service.CompilerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5600")
public class CompilerRestController {

    private final CompilerService compilerService;

    @Autowired
    public CompilerRestController(CompilerService compilerService) {
        this.compilerService = compilerService;
    }

    @PostMapping("/run")
    public TestCaseOutput compileAndRun(@Valid @RequestBody TestCaseInput input) {
        return compilerService.execute(input);
    }
}
