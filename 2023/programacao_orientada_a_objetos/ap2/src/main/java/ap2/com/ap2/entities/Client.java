package ap2.com.ap2.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
@Table(name = "clients")
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String job;
    private int age;
}
