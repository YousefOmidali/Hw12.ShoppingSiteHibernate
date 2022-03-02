package withOutHibernate.repository;

import withOutHibernate.entity.Customer;
import withOutHibernate.entity.ShoppingCard;

import java.util.List;

public interface CustomerInterface extends UserInterface<Customer>{

    List<ShoppingCard> findShoppingCardByUserId(int id);
}
