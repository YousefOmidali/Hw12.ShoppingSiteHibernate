package withHibernate.RepositoriesH;

import org.hibernate.SessionFactory;
import withHibernate.EntityH.Customer;
import withHibernate.SessionFactory.SessionFactorySingleton;

import java.util.List;

public class CustomerRepositoryImpl implements BaseRepository {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    @Override
    public Customer save(Customer customer) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.save(customer);
                transaction.commit();
                return customer;
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            }
        }
    }

    @Override
    public void update(Customer customer) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.update(customer);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            }
        }
    }

    @Override
    public void delete(Customer customer) {
        try (var session = sessionFactory.openSession()) {
            var transaction = session.beginTransaction();
            try {
                session.delete(customer);
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            }
        }
    }

    @Override
    public Customer findById(Long id) {
        try (var session = sessionFactory.openSession()) {
            return session.find(Customer.class, id);
        }
    }

    @Override
    public List<Customer> findAll() {
        throw new UnsupportedOperationException("Find All IDK how to implement yet!");
    }
}
