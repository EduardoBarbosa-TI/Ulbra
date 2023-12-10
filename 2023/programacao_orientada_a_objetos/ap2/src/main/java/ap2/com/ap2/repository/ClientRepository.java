package ap2.com.ap2.repository;

import ap2.com.ap2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Modifying
    @Query("update Client u set u.name = ?1, u.age = ?2, u.job = ?3  where u.id = ?4")
    void update(String name, int age, String job, int id);
}
