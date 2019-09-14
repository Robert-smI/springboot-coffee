package pl.bykowski.springbootcaffe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;
import pl.bykowski.springbootcaffe.entity.Coffee;
import pl.bykowski.springbootcaffe.repo.CoffeRepo;
import pl.bykowski.springbootcaffe.repo.CupRepo;
import pl.bykowski.springbootcaffe.repo.PlaceRepo;

import java.util.Optional;

// http://localhost:8080/swagger-ui.html#/coffee-api/getUsingGET

@RestController
@RequestMapping("/api")
public class CoffeeApi {

    private CoffeRepo coffeRepo;

    private CupRepo cupRepo;

    private PlaceRepo placeRepo;

    public static int limiter = 0;

    @Autowired
    public CoffeeApi(CoffeRepo coffeRepo, CupRepo cupRepo, PlaceRepo placeRepo) {
        this.coffeRepo = coffeRepo;
        this.cupRepo = cupRepo;
        this.placeRepo = placeRepo;
    }

    @GetMapping("/coffeelist")
    public Iterable<Coffee> getCoffes() {
        return coffeRepo.findAll();
    }

    @GetMapping("/coffee")
    public Optional<Coffee> getCoffesById(@RequestParam Long id) {
        return coffeRepo.findById(id);
    }

    @PostMapping
    public void addCoffee(@RequestBody Coffee coffee) {
        coffeRepo.save(coffee);
    }



    @DeleteMapping
    public void removeCoffe(@RequestParam Long id) {
     coffeRepo.deleteById(id);
    }

    @PutMapping
    public void putCoffee(@RequestBody Coffee coffee) {
        Optional<Coffee> element = coffeRepo.findById(coffee.getId());
        if (element.isPresent()) {
            coffeRepo.save(coffee);
        }
//        Coffee foundElement = null;
//        for (Coffee coffee1 : coffeList) {
//            if(coffee1.getId().equals(coffee.getId()))
//            {
//                foundElement = coffee1;
//            }
//        }
    }


//    @EventListener(ApplicationReadyEvent.class)
//    public void get() {
//        Coffee coffee1 = new Coffee("Prima", "Black");
//        Coffee coffee2 = new Coffee("Czibo", "Black");
//        Coffee coffee3 = new Coffee("Jacobs", "Black");
////        coffeList.add(coffee1);
////        coffeList.add(coffee2);
////        coffeList.add(coffee3);
//        coffeRepo.save(coffee1);
//        coffeRepo.save(coffee2);
//        coffeRepo.save(coffee3);
//    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
//
//        while (limiter<1) {
//                    Cup cup = new Cup(Size.MEDIUM);
//        Cup cup1 = new Cup(Size.SMALL);
//        cupRepo.save(cup);
//        cupRepo.save(cup1);
//
//        Place place = new Place("bar barista", "szczecin");
//        placeRepo.save(place);
//
//
//        Coffee coffee = new Coffee("prima", "black");
//        Coffee coffee1 = new Coffee("tchibo", "white");
//        coffee.setCup(cup);
//        coffee1.setCup(cup1);
//        coffee.setPlace(place);
//        coffee1.setPlace(place);
//
//        coffeRepo.save(coffee);
//        coffeRepo.save(coffee1);
//
//            limiter++;
//        }

    }

}
