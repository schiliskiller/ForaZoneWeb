package sch.uv.mx.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController
{
    @GetMapping("/")
    public String mensaje(Model modelo)
    {
        modelo.addAttribute("mensaje", "Hola ForaZone!!!");
        return "index";
    }

<<<<<<< HEAD
    @GetMapping("/beforeSignup")
    public String beforeSignup()
    {
        return "signup/before_signup";
=======
    @GetMapping("/gotoLogin")
    public String gotoLogin()
    {
        return "redirect:/login";
    }

    @GetMapping("/gotoSignup")
    public String gotoSignup()
    {
        return "redirect:/signup";
>>>>>>> 3b7ed41 (Primer commit: sitio web simple, implementacion de Spring Boot, Thymeleaf y Bootstrap y creacion de modelos y DAO general)
    }
}
