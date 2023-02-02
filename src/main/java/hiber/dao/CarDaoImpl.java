package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Car> getListCars() {
        String query = "FROM Car";
        List<Car> listCars = sessionFactory.getCurrentSession().createQuery(query).getResultList();
        return listCars;
    }

}
