
package com.lambda.usebean;

/**
 * 实体类Person
 * @author MingChenchen
 *
 */
@Getter
@Setter
public class Person {
    private String name;      //姓名
    private int age;  //岁数

    public Item(String name, int age) {  
        this.name = name;  
        this.age = age;  
    }  
}
