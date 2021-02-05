package com.blog.yeonji.introduce.generator.model;

import java.util.Date;

public class CmitMemberRecommend {
    private Integer RM_SKEY;

    private Integer MEM_SKEY;

    private String RM_MEMBER1;

    private String RM_MEMBER2;

    private String RM_MEMBER3;

    private Date CREATED_DT;

    private Integer CREATOR;

    private Date LAST_MODIFIED_DT;

    private Integer LAST_MODIFIER;

    private String NOTE;

    public Integer getRM_SKEY() {
        return RM_SKEY;
    }

    public void setRM_SKEY(Integer RM_SKEY) {
        this.RM_SKEY = RM_SKEY;
    }

    public Integer getMEM_SKEY() {
        return MEM_SKEY;
    }

    public void setMEM_SKEY(Integer MEM_SKEY) {
        this.MEM_SKEY = MEM_SKEY;
    }

    public String getRM_MEMBER1() {
        return RM_MEMBER1;
    }

    public void setRM_MEMBER1(String RM_MEMBER1) {
        this.RM_MEMBER1 = RM_MEMBER1;
    }

    public String getRM_MEMBER2() {
        return RM_MEMBER2;
    }

    public void setRM_MEMBER2(String RM_MEMBER2) {
        this.RM_MEMBER2 = RM_MEMBER2;
    }

    public String getRM_MEMBER3() {
        return RM_MEMBER3;
    }

    public void setRM_MEMBER3(String RM_MEMBER3) {
        this.RM_MEMBER3 = RM_MEMBER3;
    }

    public Date getCREATED_DT() {
        return CREATED_DT;
    }

    public void setCREATED_DT(Date CREATED_DT) {
        this.CREATED_DT = CREATED_DT;
    }

    public Integer getCREATOR() {
        return CREATOR;
    }

    public void setCREATOR(Integer CREATOR) {
        this.CREATOR = CREATOR;
    }

    public Date getLAST_MODIFIED_DT() {
        return LAST_MODIFIED_DT;
    }

    public void setLAST_MODIFIED_DT(Date LAST_MODIFIED_DT) {
        this.LAST_MODIFIED_DT = LAST_MODIFIED_DT;
    }

    public Integer getLAST_MODIFIER() {
        return LAST_MODIFIER;
    }

    public void setLAST_MODIFIER(Integer LAST_MODIFIER) {
        this.LAST_MODIFIER = LAST_MODIFIER;
    }

    public String getNOTE() {
        return NOTE;
    }

    public void setNOTE(String NOTE) {
        this.NOTE = NOTE;
    }
}