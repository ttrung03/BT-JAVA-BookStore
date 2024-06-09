package com.bookstore.validator;

import com.bookstore.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,Long> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(Long userid, ConstraintValidatorContext constraintValidatorContext) {
        if(userRepository==null)
            return true;
        return userRepository.findByUserId(userid)==null;
    }
}
