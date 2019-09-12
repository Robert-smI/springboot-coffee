package pl.bykowski.springbootcaffe.entity;

import javax.persistence.*;

@Entity
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;

    @OneToOne
    private Cup cup;

    @ManyToOne
  //  @JoinColumn(name = "place_id")
    private Place place;


    public void setCup(Cup cup) {
        this.cup = cup;
    }

    public Cup getCup() {
        return cup;
    }

    public Coffee() {
    }

    public Coffee(String name, String type) {
      //  this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
