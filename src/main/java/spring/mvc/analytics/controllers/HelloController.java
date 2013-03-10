package spring.mvc.analytics.controllers;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class HelloController {
    protected final Logger logger = Logger.getLogger(getClass());

    @RequestMapping("/login.html")
    public String handleLoginRequest(Model model) {

        logger.debug("Returning index view");
        model.addAttribute("message", "HELLO!!!");
        return "loginpage";
    }
    @RequestMapping("/welcome.html")
    public String handleDefaultRequest(Model model) {

        logger.debug("Returning index view");
//        model.addAttribute("message", "HELLO!!!");
        return "welcome";
    }
    @RequestMapping("/office.html")
    public String handleOfficeRequest(Model model) {

        logger.debug("Returning index view");
//        model.addAttribute("message", "HELLO!!!");
        return "office";
    }
    @RequestMapping("/friends.html")
    public String handlefriendsRequest(Model model) {

        logger.debug("Returning index view");
//        model.addAttribute("message", "HELLO!!!");
        return "friends";
    }
}