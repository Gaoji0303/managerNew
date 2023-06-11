package com.example.managernew.pojo;

import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author admin
 * @since 2023-06-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id	
     */
    private String id;

    /**
     * 账户
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 部门
     */
    private String dept;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("updateTime")
    private Date updateTime;

    /**
     * 删除时间
     */
    @TableField("deleteTime")
    private Date deleteTime;

    /**
     * 删除标志
     */
    @TableField("deleteFlag")
    private String deleteFlag;


}
