package org.tmdrk.boot.validated;

import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @ClassName ModelValidateUtil
 * @Description TODO
 * @Author zhoujie
 * @Date 2021/1/21 23:01
 * @Version 1.0
 **/
public class ModelValidateUtil {
    private ModelValidateUtil() {
    }


    private static final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    /**
     * 模型校验
     *
     * @param object 待校验模型
     * @param <T>    模型类型
     * @return 处理结果
     */
    public static <T> boolean validate(T object) {
        Set<ConstraintViolation<T>> constraintViolationSet = validatorFactory.getValidator().validate(object);
        if (!CollectionUtils.isEmpty(constraintViolationSet)) {
//            throw new IllegalParameterException(constraintViolationSet.iterator().next().getMessage());
            throw new RuntimeException(constraintViolationSet.iterator().next().getMessage());
        }
        return true;
    }

    /**
     * 模型校验
     *
     * @param object 待校验模型
     * @param rule   校验规则
     * @param <T>    模型类型
     * @return 处理结果
     */
    public static <T> boolean validate(T object, Class rule) {
        Set<ConstraintViolation<T>> constraintViolationSet = validatorFactory.getValidator().validate(object, rule);
        if (!CollectionUtils.isEmpty(constraintViolationSet)) {
//            throw new IllegalParameterException(constraintViolationSet.iterator().next().getMessage());
            throw new RuntimeException(constraintViolationSet.iterator().next().getMessage());
        }
        return true;
    }
}
