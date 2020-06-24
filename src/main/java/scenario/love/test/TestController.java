package scenario.love.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "I Love You.";
    }

    @GetMapping("/health")
    public boolean health() {
        return true;
    }

    @GetMapping("/too")
    public String test2() {
        return "I Love You Too.";
    }
}
