package ra.springvalidate_thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.springvalidate_thymeleaf.model.FormRegister;
import ra.springvalidate_thymeleaf.service.AccountService;
import ra.springvalidate_thymeleaf.validate.RegisterValidate;


import javax.validation.Valid;

@Controller
@RequestMapping({"/auth",""})
public class AuthController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private RegisterValidate registerValidate;
    @RequestMapping
    public String demo(){
        return "demo";
    }
    @RequestMapping({"/sign-up",})
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
