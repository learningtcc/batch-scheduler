package com.asofdate.hauth.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hzwy23 on 2017/6/18.
 */
public class OrgEntity {
    @JsonProperty("org_id")
    private String org_id;

    @JsonProperty("org_desc")
    private String org_desc;

    @JsonProperty("up_org_id")
    private String up_org_id;

    @JsonProperty("domain_id")
    private String domain_id;

    @JsonProperty("create_date")
    private String create_date;

    @JsonProperty("modify_date")
    private String modify_date;

    @JsonProperty("create_user")
    private String create_user;

    @JsonProperty("modify_user")
    private String modify_user;

    @JsonProperty("code_number")
    private String code_number;

    @JsonProperty("org_dept")
    private String org_dept;

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_desc() {
        return org_desc;
    }

    public void setOrg_desc(String org_desc) {
        this.org_desc = org_desc;
    }

    public String getUp_org_id() {
        return up_org_id;
    }

    public void setUp_org_id(String up_org_id) {
        this.up_org_id = up_org_id;
    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public String getModify_user() {
        return modify_user;
    }

    public void setModify_user(String modify_user) {
        this.modify_user = modify_user;
    }

    public String getCode_number() {
        return code_number;
    }

    public void setCode_number(String code_number) {
        this.code_number = code_number;
    }

    public String getOrg_dept() {
        return org_dept;
    }

    public void setOrg_dept(String org_dept) {
        this.org_dept = org_dept;
    }
}
