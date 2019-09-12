package pl.bykowski.springbootcaffe;

import org.springframework.web.bind.annotation.*;
import pl.bykowski.springbootcaffe.entity.Cup;
import pl.bykowski.springbootcaffe.repo.CupRepo;


// http://localhost:8080/swagger-ui.html#/coffee-cup/getUsingGET

@RestController
@RequestMapping("/cup")
public class CupApi {

    private CupRepo cupRepo;

    public CupApi (CupRepo cupRepo){
        this.cupRepo = cupRepo;
    }

    @PostMapping
    public void addCup(@RequestBody Cup cup) {
        cupRepo.save(cup);
    }

    @GetMapping
    public Iterable<Cup> getCups (){
       return cupRepo.findAll();
    }

}
