package withOutHibernate.service;

import withOutHibernate.repository.OrderRepository;
import withOutHibernate.entity.Order;

public class OrderService extends ShopService<Order, OrderRepository> {

    public OrderService() {
        super(new OrderRepository());
    }

    public OrderService(OrderRepository orderRepository) {
        super(orderRepository);
    }

 //   @Override
 //   public void save(Order order) {
 //       super.save(order);
 //   }
//
 //   @Override
 //   public void update(Order order) {
 //       super.update(order);
 //   }
//
 //   @Override
 //   public void findAll() {
 //       super.findAll();
 //   }
//
 //   @Override
 //   public void delete(int id) {
 //       super.delete(id);
 //   }
//
 //   @Override
 //   public Order findById(int id) {
 //       return super.findById(id);
 //   }
}
