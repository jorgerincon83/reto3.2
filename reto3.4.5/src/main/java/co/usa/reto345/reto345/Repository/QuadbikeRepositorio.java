package co.usa.reto345.reto345.Repository;

import co.usa.reto345.reto345.modelo.Quadbike;
import co.usa.reto345.reto345.repositorio.crud.QuadbikeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class QuadbikeRepositorio {
    @Autowired
    private QuadbikeInterface quadbikecrudRepository;

    public List<Quadbike> getAll(){
        return (List<Quadbike>) quadbikecrudRepository.findAll();
    }

    public Optional<Quadbike> getQuadbike(int id){
        return quadbikecrudRepository.findById(id);
    }

    public Quadbike save(Quadbike quadbike){
        return quadbikecrudRepository.save(quadbike);
    }

    public void delete(Quadbike quadbike){
        quadbikecrudRepository.delete(quadbike);
    }


}
