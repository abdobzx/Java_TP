package ma.emsi.firstapponspring.repo;

import ma.emsi.firstapponspring.entitys.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepo extends JpaRepository<Produit,Long> {
    List<Produit> findByNameContains(String mc);
    @Query("select q from Produit q where q.name like :x ")

    List<Produit> search(@Param("x") String mc);


}
