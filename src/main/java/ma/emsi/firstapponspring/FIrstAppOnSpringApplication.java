package ma.emsi.firstapponspring;

import ma.emsi.firstapponspring.entitys.Produit;
import ma.emsi.firstapponspring.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FIrstAppOnSpringApplication implements CommandLineRunner {
    @Autowired
    private ProductRepo productRepo;
    public static void main(String[] args) {
        SpringApplication.run(FIrstAppOnSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepo.save(new Produit(null,"PC",43000,2));
        productRepo.save(new Produit(null,"phone",43000,2));
        productRepo.save(new Produit(null,"picala",43000,2));
        List<Produit> produits= productRepo.findAll();
        produits.forEach(p-> System.out.println(p.toString()));
        Produit produit=productRepo.findById(Long.valueOf(1)).get();
        System.out.println("***********");
        System.out.println(produit.getId());
        System.out.println(produit.getName());
        System.out.println(produit.getQuantity());
        System.out.println("***********");
        List<Produit> produitslist=productRepo.findByNameContains("C");
        produitslist.forEach(p-> System.out.println(p));
        System.out.println("***********");
        List<Produit> produitslist2=productRepo.search("%C%");
        produitslist2.forEach(p-> System.out.println(p));
        System.out.println("***********");












    }
}
