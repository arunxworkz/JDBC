package com.xworkz.xworkz_admin_details.service;

import com.xworkz.xworkz_admin_details.dto.XworkzDTO;
import com.xworkz.xworkz_admin_details.entity.XworkzEntity;
import com.xworkz.xworkz_admin_details.repository.XworkzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class XwrokzServiceImpl implements XworkzService {

    public XwrokzServiceImpl(){
        System.out.println("this is service implement");
    }

    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#&()\\-\\[\\]{}:;',?/*~$^+=<>]).{8,20}$";

    private final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    @Autowired
    XworkzRepository xworkzRepository;

    XworkzEntity entity = new XworkzEntity();

    @Override
    public boolean save(XworkzDTO dto) {
        boolean saved = false;

        if (dto != null) {
            // Validate name
            String name = dto.getName();
            if (name != null && name.length() >= 10) {
                System.out.println("Name is valid: " + name);
                saved = true;
            } else {
                System.out.println("Name is not valid.");
                return false;
            }

            // Validate age
            int age = dto.getAge();
            if (age > 18) {
                System.out.println("The age is valid: " + age);
                saved = true;
            } else {
                System.out.println("The age is not valid.");
                return false;
            }

            // Validate email
            String email = dto.getEmail();
            if (email != null && email.contains("@") && email.endsWith("gmail.com")) {
                System.out.println("The email is correct.");
                saved = true;
            } else {
                System.out.println("The email is not correct.");
                return false;
            }

            // Validate password
            String password = dto.getPassword();
            if (password != null && !password.isEmpty()) {
                if (pattern.matcher(password).matches()) {
                    System.out.println("Password is valid: " + password);
                    saved = true;
                } else {
                    System.out.println("Password does not meet the requirements.");
                    return false;
                }
            } else {
                System.out.println("Password cannot be null or empty.");
                return false;
            }

            // Validate confirm password
            String confirmPassword = dto.getConfirmPassword();
            System.out.println("confirm paddwors: "+confirmPassword);
            if (confirmPassword != null && confirmPassword.equals(password)) {
                System.out.println("Password and confirm password match.");
                saved = true;
            } else {
                System.out.println("Password and confirm password do not match.");
                return false;
            }

            long phNo = dto.getPhno();
            String phNoStr = String.valueOf(phNo);
            if(phNoStr.length() == 10 && phNoStr.startsWith("9")){
                System.out.println("The number is correct: "+phNoStr);
                saved = true;
            }else{
                System.out.println("The number is not valid");
                saved = false;
            }
        } else {
            System.out.println("DTO cannot be null.");
            return false;
        }

        if(saved){
            entity.setName(dto.getName());
            entity.setAge((dto.getAge()));
            entity.setEmail((dto.getEmail()));
            entity.setPassword(dto.getPassword());
            entity.setConfirmPassword((dto.getConfirmPassword()));
            entity.setPhno((dto.getPhno()));
            xworkzRepository.saveRepo(entity);
            System.out.println("the entity data is: "+entity.toString());
        }
        return saved;
    }
}

