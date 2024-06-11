package in.Report.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class LoginController {



    @GetMapping("/login")
    public String viewLoginPage (){

        return "login"; // This will resolve to report.jsp
    }
}
