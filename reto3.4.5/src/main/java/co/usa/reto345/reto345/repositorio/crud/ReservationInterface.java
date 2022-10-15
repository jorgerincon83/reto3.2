package co.usa.reto345.reto345.repositorio.crud;

import co.usa.reto345.reto345.modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository <Reservation,Integer> {
}
