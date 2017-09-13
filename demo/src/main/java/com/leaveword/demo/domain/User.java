package com.leaveword.demo.domain;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    @Column(nullable = false, columnDefinition = "Int(11) COMMENT '用户主键'")
    private int userID;
    @Column(nullable = false, columnDefinition = "Varchar(40) COMMENT '用户名' default '未命名'")
    private String userName;
    @Column(nullable = false, columnDefinition = "Varchar(40) COMMENT '用户密码' default ' '")
    private String userPassword;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false, columnDefinition = "datetime COMMENT '注册时间'")
    private Timestamp registerTime;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
