package com.asofdate.hauth.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by hzwy23 on 2017/5/17.
 */
public class ResourceEntity {
    @JsonProperty("Res_id")
    private String Res_id;

    @JsonProperty("Res_name")
    private String Res_name;

    @JsonProperty("Res_attr")
    private String Res_attr;

    @JsonProperty("Res_attr_desc")
    private String Res_attr_desc;

    @JsonProperty("Res_up_id")
    private String Res_up_id;

    @JsonProperty("Res_type")
    private String Res_type;

    @JsonProperty("Res_type_desc")
    private String Res_type_desc;

    @JsonProperty("Sys_flag")
    private String Sys_flag;

    public String getRes_id() {
        return Res_id;
    }

    public void setRes_id(String res_id) {
        Res_id = res_id;
    }

    public String getRes_name() {
        return Res_name;
    }

    public void setRes_name(String res_name) {
        Res_name = res_name;
    }

    public String getRes_attr() {
        return Res_attr;
    }

    public void setRes_attr(String res_attr) {
        Res_attr = res_attr;
    }

    public String getRes_attr_desc() {
        return Res_attr_desc;
    }

    public void setRes_attr_desc(String res_attr_desc) {
        Res_attr_desc = res_attr_desc;
    }

    public String getRes_up_id() {
        return Res_up_id;
    }

    public void setRes_up_id(String res_up_id) {
        Res_up_id = res_up_id;
    }

    public String getRes_type() {
        return Res_type;
    }

    public void setRes_type(String res_type) {
        Res_type = res_type;
    }

    public String getRes_type_desc() {
        return Res_type_desc;
    }

    public void setRes_type_desc(String res_type_desc) {
        Res_type_desc = res_type_desc;
    }

    public String getSys_flag() {
        return Sys_flag;
    }

    public void setSys_flag(String sys_flag) {
        Sys_flag = sys_flag;
    }
}
