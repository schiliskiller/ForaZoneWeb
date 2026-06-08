package sch.uv.mx.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sch.uv.mx.modelo.Duenio;
import sch.uv.mx.modelo.Estudiante;

@Controller
@RequestMapping("/signup")
public class SignupController
{
    @GetMapping("/estudiantes")
    public String signupEstudiantes(Model model)
    {
        return "signup/signup_estudiantes";
    }

    @GetMapping("/duenios")
    public String signupDuenios(Model model)
    {
        System.out.println("Hola");
        return "signup/signup_duenios";
    }
}
