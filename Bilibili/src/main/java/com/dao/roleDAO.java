package com.dao;

import com.pojo.Role;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * roleDAO接口 提供了对role进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface roleDAO {
    public void createRole(Role role);
    public void deleteRole(int roleId);
    public void updateRole(Role role);
    public Role findRoleById(int roleId);
}
