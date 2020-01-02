package com.personal.example.employeeapp.repositories;

import com.personal.example.employeeapp.models.Department;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


public class DepartmentRepositoryImpl {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Department> findDepartmentsThatHaveEmployeesNamed(String name) {
        List<Department> result = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Department.class);
            cr.createAlias("employees", "employeeAlias");
            cr.add(Restrictions.eq("employeeAlias.name", name));
            result  = cr.list();
        }
        catch (HibernateException ex) {
            ex.printStackTrace();;
        }

        return result;
    }

}
