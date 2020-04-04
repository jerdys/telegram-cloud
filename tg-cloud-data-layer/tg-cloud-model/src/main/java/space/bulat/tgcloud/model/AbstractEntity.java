package space.bulat.tgcloud.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 * 04.04.2020
 *
 * @author Bulat Muzipov
 */
@MappedSuperclass
public abstract class AbstractEntity {

    public static final String GENERATOR = "seq_gen";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR)
    private Long id;

    private Boolean deleted;

    @Override
    public boolean equals(final Object o) {
        return o != null &&
                (
                        this == o
                                || o.getClass().isAssignableFrom(this.getClass())
                                && Objects.equals(this.id, ((AbstractEntity) o).id)
                );
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
