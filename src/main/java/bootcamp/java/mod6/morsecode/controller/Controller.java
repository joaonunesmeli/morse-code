package bootcamp.java.mod6.morsecode.controller;

import bootcamp.java.mod6.morsecode.translator.MorseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/morsecode")
public class Controller {
    @GetMapping("/interpret/{message}")
    public String translate(@PathVariable String message) {
        return MorseCode.interpret(message);
    }
}
