package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"Bmw"));
        brands.add(new Brand(2,"mercedes"));
        brands.add(new Brand(3,"togg"));
        brands.add(new Brand(4,"Fiat"));
        brands.add(new Brand(5,"Reno"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
