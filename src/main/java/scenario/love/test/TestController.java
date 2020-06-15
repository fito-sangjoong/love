package scenario.love.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "hello2";
    }

    @GetMapping("/health")
    public boolean health() {
        return true;
    }
}
