package sch.uv.mx.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomepageController
{
    @GetMapping
    public String mensaje(Model model)
    {
        return "index";
    }

    @GetMapping("/before")
    public String gotoSignup(Model model)
    {
        return "signup/before_signup";
    }

    @GetMapping("/homepage")
    public String homepage(Model model, HttpSession session)
    {
        return session.getAttribute("sesionUsuario") != null ? "homepage" : "redirect:/";
    }

    @GetMapping("/logout")
    public String cerrarSesion(HttpSession session)
    {
        session.invalidate();

        return "redirect:/";
    }
}
