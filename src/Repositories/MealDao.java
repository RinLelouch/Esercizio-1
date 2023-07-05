package Repositories;

import entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealDao extends JpaRepository<Meal,Long>{
//  List<Meal> findByLastName (String lastName);
}
