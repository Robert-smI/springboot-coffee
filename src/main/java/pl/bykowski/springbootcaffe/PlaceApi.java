package pl.bykowski.springbootcaffe;

import org.springframework.web.bind.annotation.*;
import pl.bykowski.springbootcaffe.entity.Place;
import pl.bykowski.springbootcaffe.repo.PlaceRepo;

@RestController
@RequestMapping("/place")
public class PlaceApi {

    private PlaceRepo placeRepo;

    public PlaceApi(PlaceRepo placeRepo) {
        this.placeRepo = placeRepo;
    }

    @PostMapping
    public void addPlace (@RequestBody Place place){
        placeRepo.save(place);
    }
    @GetMapping
    public Iterable<Place> showPlaces (){
       return placeRepo.findAll();
    }

}
