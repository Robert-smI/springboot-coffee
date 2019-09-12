package pl.bykowski.springbootcaffe.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Place {


    public String name;
    public String adres;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "place") // nazwa pola z którym koresponduje
    private Set <Coffee> coffeeSet;


    public Place() {
    }


    public Place(String name, String adres, Set<Coffee> coffeeSet) {
        this.name = name;
        this.adres = adres;
        this.coffeeSet = coffeeSet;
    }


    public void addCoffee (Coffee coffee){
        coffeeSet.add(coffee);
    }



    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Coffee> getCoffeeSet() {
        return coffeeSet;
    }

    public void setCoffeeSet(Set<Coffee> coffeeSet) {
        this.coffeeSet = coffeeSet;
    }
}


