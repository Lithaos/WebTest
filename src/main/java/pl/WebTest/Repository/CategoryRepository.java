package pl.WebTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.WebTest.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	public Category findByCategoryName(String categoryName);

}
