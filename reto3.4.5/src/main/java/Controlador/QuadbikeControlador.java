package Controlador;

import co.usa.reto345.reto345.modelo.Quadbike;
import co.usa.reto345.reto345.service.QuadbikeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Quadbike")
public class QuadbikeControlador {

    @Autowired
    private QuadbikeServicio quadbikeService;
    @GetMapping("/all")
    public List<Quadbike> getQuadbike(){
        return quadbikeService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Quadbike> getQuadbike(@PathVariable("id") int quadbikeId) {
        return quadbikeService.getQuadbike(quadbikeId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike save(@RequestBody Quadbike quadbike) {
        return quadbikeService.save(quadbike);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike update(@RequestBody Quadbike quadbike) {
        return quadbikeService.update(quadbike);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){

        return quadbikeService.deleteQuadbike(id);
    }

}
