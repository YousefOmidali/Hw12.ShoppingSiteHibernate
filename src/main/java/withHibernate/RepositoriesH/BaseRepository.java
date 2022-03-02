package withHibernate.RepositoriesH;

import withHibernate.EntityH.Customer;

import java.util.List;

public interface BaseRepository {
    Customer save(Customer contact);
    void update(Customer contact);
    void delete(Customer contact);
    Customer findById(Long id);
    List<Customer> findAll();
}
