package com.mp.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")

public class User {

    private Long id;
    private String userName;
    @TableField(exist = false)
    private String password;
    private String name;
    private Integer age;
    @TableField("email")
    private String email;
}
