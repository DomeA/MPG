package com.domeastudio.data.pojo;

import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * Created by domea on 16-4-10.
 */
@JsonRootName("beans")
public class Beans {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
