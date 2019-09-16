package com.employee;

public class Employee {

    String iid;
    String nname;

    void setId(String id) {
        iid = id;
    }

    void setName(String name) {
        nname = name;
    }

    String getId() {
        return iid;
    }

    String getName() {
        return nname;
    }

}