package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.RoleDao;
import web.model.Role;

import java.util.List;
@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDao roleDao;
    @Transactional(readOnly = true)
    @Override
    public List<Role> findAllRoles() {
        List<Role> rolesList = roleDao.findAllRoles();
        return rolesList;
    }

}
