package java.com.example.test.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Transaction extends Reward{
    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Customer customer;
    private Double total;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date saveDate;

    @Override
    public Long getPoints() {
        this.points = 0l;

        if (this.total > 50 && this.total <= 100) {
            this.points += (this.total.intValue() - 50) * 1;

        }

        if (this.total > 100) {
            this.points += 50;
            this.points += (this.total.intValue() - 100) * 2;
        }

        return this.points;
    }


}
