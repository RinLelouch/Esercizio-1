package Service;


import entity.Meal;
import Repositories.MealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;


    @Autowired
    public MealService(MealDao mealDao) {
        this.mealDao = mealDao;
    }

    public void addMeal(Meal meal) {
        mealDao.save(meal);
    }

    public List<Meal> getMeals() {
        return mealDao.findAll();
    }

    public void deleteMeal(long id) {
        mealDao.deleteById(id);
    }

    public void updateMeal(Meal meal) {
        mealDao.save(meal);
    }





}
