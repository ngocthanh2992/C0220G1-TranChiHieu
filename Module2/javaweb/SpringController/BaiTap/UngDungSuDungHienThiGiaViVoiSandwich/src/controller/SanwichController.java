package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SanwichController {
    @GetMapping ("/condiment")
    String abc (@RequestParam String[] giavi ,Model model){
        model.addAttribute("result",giavi);
        return "result";
    }
}
