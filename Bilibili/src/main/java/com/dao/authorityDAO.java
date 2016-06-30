package com.dao;

import com.pojo.Authority;

/**
 * Created by frank_xiang on 2016/6/28.
 */


/**
 * authorityDAO接口 提供了对authority进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface authorityDAO {
    public void createAuthority(Authority authority);
    public void deleteAuthority(int authId);
    public void updateAuthority(Authority authority);
    public Authority findAuthorityById(int authId);
}
