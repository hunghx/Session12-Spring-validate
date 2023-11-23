package ra.springvalidation_jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.springvalidation_jsp.model.FormRegister;
import ra.springvalidation_jsp.service.AccountService;
import ra.springvalidation_jsp.validate.RegisterValidate;

import javax.validation.Valid;
import java.util.Arrays;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private RegisterValidate registerValidate;
    @RequestMapping("/sign-up")
    public String  formRegister(Model model){
        model.addAttribute("register",new FormRegister());
        return "form-register";
    }
    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public String  handleRegister(@ModelAttribute("register") @Valid FormRegister formRegister, BindingResult bindingResult){
       // xác thực dữ liệu
//        registerValidate.validate(formRegister,bindingResult);
        if (bindingResult.hasErrors()){
            return "form-register";
        }
        accountService.register(formRegister);
        return "home";
    }
}
