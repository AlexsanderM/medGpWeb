package malov.medGP.controller;


import malov.medGP.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    private static User user;

    static {
        user = new User();
        user.setId(4);
        user.setName("test");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allLogin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("user", user.getName());
        return modelAndView;
    }
}
