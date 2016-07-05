package com.pojo;

import java.util.Collection;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * Authority类 表达用户权限的实体类（基于JavaBean概念）
 * <p>
 *     Authority私有成员<br>
 *     authId       权限的ID，用于查找功能<br>
 *     authName     权限的名称，描述权限的基本属性<br>
 *     authContent  权限的内容，描述了权限的说明信息<br>
 * </p>
 */
public class Authority {
    private int authId;
    private String authName;
    private String authContent;
    private Collection<RoleAuthority> roleAuthoritiesByAuthId;

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthContent() {
        return authContent;
    }

    public void setAuthContent(String authContent) {
        this.authContent = authContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authority authority = (Authority) o;

        if (authId != authority.authId) return false;
        if (authName != null ? !authName.equals(authority.authName) : authority.authName != null) return false;
        if (authContent != null ? !authContent.equals(authority.authContent) : authority.authContent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = authId;
        result = 31 * result + (authName != null ? authName.hashCode() : 0);
        result = 31 * result + (authContent != null ? authContent.hashCode() : 0);
        return result;
    }

    public Collection<RoleAuthority> getRoleAuthoritiesByAuthId() {
        return roleAuthoritiesByAuthId;
    }

    public void setRoleAuthoritiesByAuthId(Collection<RoleAuthority> roleAuthoritiesByAuthId) {
        this.roleAuthoritiesByAuthId = roleAuthoritiesByAuthId;
    }
}
