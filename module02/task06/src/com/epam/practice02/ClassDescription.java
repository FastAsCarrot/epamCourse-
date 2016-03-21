package com.epam.practice02;

import java.lang.annotation.Documented;

/**
 * Created by vrama on 21.03.2016.
 */
@Documented
public @interface ClassDescription {
    String information();
    String[] methodsName();
    String  innerClass();
}
