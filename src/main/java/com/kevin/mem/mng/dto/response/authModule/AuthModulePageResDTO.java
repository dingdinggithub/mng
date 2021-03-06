package com.kevin.mem.mng.dto.response.authModule;

import com.kevin.common.domain.dto.DTO;
import com.kevin.mem.mng.enums.AuthTypeEnum;
import com.kevin.mem.mng.enums.StatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 权限模块关系PageResDTO
 *
 * @author 丁海峰
 * @date 2018-11-24 02:26:50
 */
@Data
public class AuthModulePageResDTO implements Serializable, DTO {
    /**
     * 主键
     */
    private Long id;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限所在的模块id
     */
    private Long moduleId;

    /**
     * 权限所在的模块名称
     */
    private String moduleName;
    /**
     * 请求的url
     */
    private String url;
    /**
     * 类型，1：菜单，2：按钮，3：其他
     */
    private Integer type;

    /**
     * 类型，1：菜单，2：按钮，3：其他
     */
    private String typeDesc;

    /**
     * 权限模块在当前层级下的顺序，由小到大
     */
    private Integer seq;
    /**
     * 状态，1：正常，0：冻结
     */
    private Integer status;
    /**
     * 状态，1：正常，0：冻结
     */
    private String statusDesc;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否已删除
     */
    private Integer isDeleted;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 更新人
     */
    private String updateBy;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    public void setType(Integer type) {
        this.type = type;
        this.typeDesc = AuthTypeEnum.getDesc(type);
    }

    public void setStatus(Integer status) {
        this.status = status;
        this.statusDesc = StatusEnum.getDesc(this.status);
    }
}
	