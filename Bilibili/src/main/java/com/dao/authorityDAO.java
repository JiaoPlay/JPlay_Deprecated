package com.dao;

import com.pojo.Authority;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface authorityDAO {
    public void createAuthority(Authority authority);
    public void deleteAuthority(int authId);
    public void updateAuthority(Authority authority);
    public Authority findAuthorityById(int authId);
}
