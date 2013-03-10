package spring.mvc.analytics.controllers;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class DefaultController {
    protected final Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/login")
    public String handleLoginRequest(Model model) {
        logger.debug("Returning index view");
        return "login";
    }
    
    @RequestMapping("/welcome")
    public String handleDefaultRequest(Model model) {

        logger.debug("Returning index view");
        model.addAttribute("message", "HELLO!!!");
        return "welcome";
    }

   
}