package ra.springvalidation_jsp.validate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.springvalidation_jsp.model.FormRegister;
import ra.springvalidation_jsp.service.AccountService;

@Component
public class RegisterValidate implements Validator {
    @Autowired
    private AccountService accountService;
    @Override
    public boolean supports(Class<?> clazz) {
        return FormRegister.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        // LOGIC
        FormRegister form =(FormRegister) target;
        // tất cả ko để trống
        // username >= 10 kí tự , unique ,
        // repass phải giông pass
        // số điện thoại phải có 10,11 số, bắt đầu bằng số 0

        if (form.getUserName().isEmpty()){
            errors.rejectValue("userName","mess.err.empty","Không được để trống trường này!");
        } else if (form.getUserName().trim().length()<10) {
            errors.rejectValue("userName","mess.err.invalid","Tên đăng nhập có ít nhất 10 kí tự!");
        } else if (accountService.checkExistByUserName(form.getUserName())) {
            errors.rejectValue("userName","mess.err.exists","Tên đăng nhập đã tồn tại!");
        }

        if (form.getPassword().isEmpty()){
            errors.rejectValue("password","mess.err.empty","Không được để trống trường này!");
        }

        if (!form.getRePassword().equals(form.getPassword())){
            errors.rejectValue("rePassword","mess.err.not-match","Mật khẩu xác nhận không khớp!");
        }

        if (form.getPhone().isEmpty()){
            errors.rejectValue("phone","mess.err.empty","Không được để trống trường này!");
        } else if (!form.getPhone().matches("^0[0-9]{9,10}$")) {
            errors.rejectValue("phone","mess.err.regex","Không đúng định dạng!");
        }
        if (form.getFullName().isEmpty()){
            errors.rejectValue("fullName","mess.err.empty","Không được để trống trường này!");
        }

    }
}
