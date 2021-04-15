package ide.java.compile.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TestCaseInput {

    @NotNull(message = "Code field is required.")
    @Size(min = 10, max = 51200, message = "Invalid code received.")
    private String code;

    @NotNull(message = "Input field is required.")
    @Size(max = 51200, message = "Invalid input received.")
    private String input;

    public TestCaseInput() {
    }

    public TestCaseInput(String code, String input) {
        this.code = code;
        this.input = input;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "\n\n[\ncode=\n`" + code + "`" + ",\ninput=\n`" + input + "`" + "\n]\n";
    }
}
