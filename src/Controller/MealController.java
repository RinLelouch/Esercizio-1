package Controller;

import Service.MealService;
import entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MealController {
    @Autowired
    private MealService mealService;
    @PutMapping (value = "/insert-meal")
    public ResponseEntity<Meal> addMeal(@RequestBody Meal meal){
        mealService.addMeal(meal);
        return ResponseEntity.ok(meal);

    }
    @GetMapping(value ="/meals")
    public ResponseEntity<List<Meal>> getMeals(){
        return ResponseEntity.ok(mealService.getMeals());
    }
    @GetMapping (value = "/meal/{name}")
    public ResponseEntity<List<Meal>> getMealByName (@PathVariable("name") String name){

        return ResponseEntity.ok( mealService.getMeals().stream().filter(meal -> meal.getName().equals(name)).toList());
    }
    @GetMapping (value = "/meal/description-match/{phrase}")
    public ResponseEntity<List<Meal>> getMealByDescription(@PathVariable ("phrase") String phrase){
        return ResponseEntity.ok( mealService.getMeals().stream().filter(meal -> meal.getName().contains(phrase)).toList());
    }
    @GetMapping (value = "/meal/{priceMax}-{priceMin}")
    public ResponseEntity<?> getMealByPrice(@RequestParam ("priceMax") Integer priceMax ,
    @RequestParam ("priceMin") Integer priceMin){
            return ResponseEntity.ok(mealService.getMeals().stream().filter(meal -> meal.getPrice()> priceMin && meal.getPrice() < priceMax ).toList())
    }
}
