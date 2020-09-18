package io.github.mokaim.arduino;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public ModelAndView index(ModelAndView modelAndView){

        modelAndView.setViewName("index");
        modelAndView.addObject("home","LED를 켜주세요!!");
        return modelAndView;
    }

}
