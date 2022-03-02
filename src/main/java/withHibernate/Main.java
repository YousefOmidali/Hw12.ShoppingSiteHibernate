package withHibernate;

import withHibernate.EntityH.Customer;
import withHibernate.RepositoriesH.CustomerRepositoryImpl;
import withHibernate.SessionFactory.SessionFactorySingleton;

public class Main {
    public static void main(String[] args) {
        var sessionFactory = SessionFactorySingleton.getInstance();

        var customerRepositoryImpl = new CustomerRepositoryImpl();
        var customer =
                new Customer("username1", "password1", "Tehran");

        customerRepositoryImpl.save(customer);

        customer.setAddress("Kish");
        customerRepositoryImpl.update(customer);

        customerRepositoryImpl.delete(customer);

    }
}
