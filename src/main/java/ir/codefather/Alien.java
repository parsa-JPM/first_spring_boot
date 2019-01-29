package ir.codefather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private Laptop laptop;


    public Alien() {
        System.out.println("obj created");
    }


    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void test() {
        System.out.println("this is alien");
        laptop.compile();
    }
}
