package com.lambda.usebean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda {

    public void test(){
        List<Person> list = new ArrayList<Person>();

        Person person1 = new Person("满福",18);
        Person person2 = new Person("福满多",51);
        Person person3 = new Person("高富帅",31);

        List<String> studentList = list.stream().filter(item->item.getAge()>18)
                                                .sorted(Comparator.comparing(Person::getAge).reversed())
                                                .map(Person::getName)
                                                .collect(Collectors.toList());

        System.out.println(studentList);




    }


}
