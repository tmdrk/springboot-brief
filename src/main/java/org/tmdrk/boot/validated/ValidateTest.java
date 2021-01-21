package org.tmdrk.boot.validated;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName ValidateTest
 * @Description TODO
 * @Author zhoujie
 * @Date 2021/1/21 23:03
 * @Version 1.0
 **/
@Data
public class ValidateTest {
    @NotNull(message = "id不能为空")
    private Long id;

    @NotEmpty(message = "age不能为空")
    private String name;

    @NotNull(message = "age不能为空")
    private String age;
}
