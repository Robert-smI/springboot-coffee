package pl.bykowski.springbootcaffe.entity;

import pl.bykowski.springbootcaffe.Size;

import javax.persistence.*;

@Entity
public class Cup {


    public Cup() {
    }


    public Cup(Size size) {
        this.size = size;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Size size;

    public Long getId() {
        return id;
    }

    public Size getSize() {
        return size;
    }


    public void get (){

    }

}
