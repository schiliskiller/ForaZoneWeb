package sch.uv.mx.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import sch.uv.mx.modelo.Duenio;
import sch.uv.mx.modelo.Estudiante;
=======
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 3b7ed41 (Primer commit: sitio web simple, implementacion de Spring Boot, Thymeleaf y Bootstrap y creacion de modelos y DAO general)

@Controller
public class SignupController
{
<<<<<<< HEAD
    @GetMapping("/signupEstudiantes")
    public String signupEstudiantes(Model modelo)
    {
        Estudiante est = new Estudiante();
        modelo.addAttribute("usuarioEst", est);
        return "signup/signup_estudiantes";
    }

    @GetMapping("/signupDuenios")
    public String signupDuenios(Model modelo)
    {
        Duenio duenio = new Duenio();
        modelo.addAttribute("usuarioDuenio", duenio);
        return "signup/signup";
    }

    @PostMapping("/signupPost")
    public String crearCuenta(Model modelo)
    {
        modelo.getAttribute("");
        return "nose";
    }
=======
    @GetMapping("/signup")
    public String signup()
    {
        return "signup";
    }


>>>>>>> 3b7ed41 (Primer commit: sitio web simple, implementacion de Spring Boot, Thymeleaf y Bootstrap y creacion de modelos y DAO general)
}
