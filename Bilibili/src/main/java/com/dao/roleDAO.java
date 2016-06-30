package com.dao;

import com.pojo.Role;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface roleDAO {
    public void createRole(Role role);
    public void deleteRole(int roleId);
    public void updateRole(Role role);
    public Role findRoleById(int roleId);
}
