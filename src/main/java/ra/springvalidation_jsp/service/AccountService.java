package ra.springvalidation_jsp.service;

import org.springframework.stereotype.Service;
import ra.springvalidation_jsp.model.Account;
import ra.springvalidation_jsp.model.FormRegister;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private static List<Account> accounts = new ArrayList<>();
    static {
        accounts.add(new Account(1L,"hunghx","123456","0984873223","Hồ Xuân Hùng",true));
        accounts.add(new Account(2L,"sonTx","123456","0948983834","Trần Xuân Sơn",true));
        accounts.add(new Account(3L,"ngocDt","123456","0988484223","Đỗ Thị Ngọc",true));
    }
    public void register(FormRegister register){
        // chuyển dổi từ form thành 1 đối tượng account và lưu vào list
        Account acc = new Account(getNewId(), register.getUserName(), register.getPassword(), register.getPhone(), register.getFullName(),true );
        accounts.add(acc);
    }
    private Long getNewId (){
        return accounts.stream().map(Account::getId).max(Long::compareTo).orElse(0L)+1;
    }
    public boolean checkExistByUserName(String username){
        return accounts.stream().anyMatch(acc-> acc.getUserName().equalsIgnoreCase(username));
    }
    public boolean checkExistPhone(String phone){
        return accounts.stream().anyMatch(acc-> acc.getPhone().equalsIgnoreCase(phone));
    }
}
