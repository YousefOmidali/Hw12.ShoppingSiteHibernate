package withOutHibernate.service;

import withOutHibernate.repository.BaseRepository;
import withOutHibernate.repository.UserInterface;
import withOutHibernate.entity.User;
import withOutHibernate.service.ShopService;

public abstract class UserService<E extends User,R extends BaseRepository<E>> extends ShopService<E,R> {

    private R r;

    public UserService(R r) {
        super(r);
        this.r=r;
    }

    public E login(String username,String password){
        UserInterface<E> userInterface = (UserInterface<E>) r;
        return userInterface.login(username, password);
    }
}
