package withOutHibernate.service;

import withOutHibernate.repository.CategoryRepository;
import withOutHibernate.entity.Category;

public class CategoryService extends ShopService<Category, CategoryRepository> {

    public CategoryService() {
        super(new CategoryRepository());
    }

    public CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
    }

 //   @Override
 //   public void save(Category category) {
 //       super.save(category);
 //   }
//
 //   @Override
 //   public void update(Category category) {
 //       super.update(category);
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
 //   public Category findById(int id) {
 //       return super.findById(id);
 //   }
}
