package cn.bdqn.zzs.mapper;

import cn.bdqn.zzs.entity.Tbuser;

import java.util.List;

/**
 * Created by hasee on 2017/5/22.
 */
public interface TbuserMapper {
    public Tbuser login(Tbuser users);
    public List<Tbuser> queryAllUser();
    public void addUser(Tbuser users);
    public void updateUser(Tbuser users);
    public void deleteUser(int userid);
    public List<Tbuser> queryUserByUserid(int userid);
}
