package com.issue1.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * Entity
 *
 * @author zhouxv
 */
@Data
@TableName("service")
public class Service {

    /**
     * 服务Id
     */
    @TableId(value = "serviceId", type = IdType.AUTO)
    private Integer serviceid;

    /**
     * 服务名称
     */
    @Valid
    @TableField("serviceName")
    @NotBlank(message = "服务名称不能为空")
    private String servicename;

    /**
     * 删除状态
     */
    @TableField("deleteState")
    private Integer deletestate;

    /**
     * 测评状态
     */
    @TableField("state")
    private Integer state;

    /**
     * 服务的参评公司
     */
    @Valid
    @TableField("serviceCompany")
    @NotBlank(message = "参评公司不能为空")
    private String servicecompany;

    /**
     * 服务类型,九个类别之一
     */
    @Valid
    @TableField("serviceType")
    @NotBlank(message = "服务类型不能为空")
    private String servicetype;

    /**
     * 测试机构
     */
    @TableField("testOrganization")
    private String testorganization;

    /**
     * 服务的综合安全等级
     */
    @TableField("serviceLevel")
    private String servicelevel;

    @TableField("issue2ResultId")
    private Integer issue2resultid;
}
