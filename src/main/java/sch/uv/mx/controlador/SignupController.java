package sch.uv.mx.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController
{
    @GetMapping("/signupEstudiante")
    public String signupEstudiantes()
    {
        return "signup/signup_estudiantes";
    }

    @GetMapping("/signupDuenios")
    public String signupDuenios()
    {
        return "signup/signup";
    }
}
