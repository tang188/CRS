package com.tangzh.domain;

public class FormKey {
    private Integer id;

    private String jno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJno() {
        return jno;
    }

    public void setJno(String jno) {
        this.jno = jno == null ? null : jno.trim();
    }
}