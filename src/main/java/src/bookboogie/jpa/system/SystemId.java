package src.bookboogie.jpa.system;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
public class SystemId implements Serializable {

    @Getter @Setter
    private Long tenantId;

    @Getter @Setter
    private Long seq;

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        if (! super.equals(o)) {
            return false;
        }

        SystemId systemId = (SystemId) o;
        return this.tenantId.equals(systemId.getTenantId()) &&
                this.seq.equals(systemId.getSeq());
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 89 * hash + (this.tenantId != null ? this.tenantId.hashCode() : 0);
        hash = 89 * hash + (this.seq != null ? this.seq.hashCode() : 0);
        return hash;
    }

}
