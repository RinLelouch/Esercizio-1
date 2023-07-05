package Controller;

import Service.MealService;
import entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class FirstController {
    @Autowired
    private MealService mealService;

    @PutMapping(value = "/meal")
    public ResponseEntity<String> addMeal(@RequestBody Meal meal){
       mealService.addMeal(meal);
       return ResponseEntity.ok("Meal added!");
    }

    @PostMapping (value = "/meal/{name}")
    public ResponseEntity<String> updateMealByName (@PathVariable ("name") String name , @RequestBody Meal meal){
        mealService.getMeals().removeIf(m->m.getName().equals(name));
        mealService.updateMeal(meal);
        return ResponseEntity.ok("Meal updated!");
    }
    @DeleteMapping (value= "/meal/{name}")
    public ResponseEntity<String> deleteMealByName (@PathVariable ("name") String name){
        mealService.getMeals().removeIf(m->m.getName().equals(name));
        return ResponseEntity.ok("Meal Deleted!");
    }
    @DeleteMapping (value = "/meal/price/{price}")
    public ResponseEntity<String> deleteMealByPrice (@PathVariable ("price") Integer price){
        mealService.getMeals().removeIf(m->m.getPrice()>price);
        return ResponseEntity.ok("Meals deleted!");
    }
  @PutMapping (value = "/meal/{name}/price")
    public ResponseEntity<String>  updatePriceByName (@PathVariable ("name") String name, @RequestBody Integer price){
        Optional<Meal> oMeal = mealService.getMeals().stream().filter(m-> m.getName().equals(name)).findFirst();
        if(oMeal.isPresent()){
            oMeal.get().setPrice(price);
            return ResponseEntity.ok("Price updated!");
        }
        else {
            return ResponseEntity.ok("Error variables are not inserted corrected or the meal does not exist");
        }


  }
}
