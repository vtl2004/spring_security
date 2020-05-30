package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    private final EntityManager entityManager;

    public RoleDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Role> findAllRoles() {
        List<Role> roles = entityManager.createQuery("From Role ", Role.class).getResultList();
        return roles;
    }


}
