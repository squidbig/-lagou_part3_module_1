package com.lagou.testClass;

import java.io.Serializable;

public class LagouTest implements Serializable {

    String name;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
