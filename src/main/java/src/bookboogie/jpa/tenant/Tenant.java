package src.bookboogie.jpa.tenant;

import lombok.Data;
import lombok.NoArgsConstructor;
import src.bookboogie.jpa.system.*;
import src.bookboogie.jpa.system.System;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Tenant {

    @Id
    @GeneratedValue
    @Column(name = "tenant_id")
    private Long tenantId;

    private String tenantName;

    private Long superTenantId;

    private String superTenantYn;

    @OneToMany(mappedBy = "tenant")
    private List<System> systems = new ArrayList<>();

}
