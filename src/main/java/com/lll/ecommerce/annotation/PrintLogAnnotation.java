package com.lll.ecommerce.annotation;

import java.lang.annotation.*;

/**
 * @author luo
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PrintLogAnnotation {

}
