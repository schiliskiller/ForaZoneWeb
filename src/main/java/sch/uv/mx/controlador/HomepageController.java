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

    @GetMapping("/gotoLogin")
    public String gotoLogin()
    {
        return "redirect:/login";
    }

    @GetMapping("/gotoSignup")
    public String gotoSignup()
    {
        return "redirect:/signup";
    }
}
