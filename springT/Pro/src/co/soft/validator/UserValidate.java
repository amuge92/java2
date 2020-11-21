package co.soft.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import co.soft.beans.Userinfo;

public class UserValidate implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Userinfo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Userinfo user = (Userinfo) target;
		String pw = user.getUser_pw();
		String pw2 = user.getUser_pw2();
		if(!(pw.equals(pw2))) {
			errors.rejectValue("user_pw", "not_equal");
			errors.rejectValue("user_pw2", "not_equal");
		}

	}

}
