package src.bookboogie.jpa.system;

import lombok.Data;
import lombok.NoArgsConstructor;
import src.bookboogie.jpa.tenant.Tenant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class System {

    @EmbeddedId
    private SystemId systemId;

    private String systemName;

    private String jdbcUrl;

    private String jdbcName;

    private String jdbcPw;

    private String databaseName;

    private String schemaName;

    @ManyToOne
    @JoinColumn(name = "tenantId", referencedColumnName = "tenant_id", insertable=false, updatable=false)
    private Tenant tenant;

}
