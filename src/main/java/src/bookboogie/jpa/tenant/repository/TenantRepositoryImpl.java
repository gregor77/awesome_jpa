package src.bookboogie.jpa.tenant.repository;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.stereotype.Repository;
import src.bookboogie.jpa.tenant.QTenant;
import src.bookboogie.jpa.tenant.Tenant;

import java.util.List;

@Repository
public class TenantRepositoryImpl extends QueryDslRepositorySupport implements TenantRepositoryCustom{

    private static final QTenant tenant = QTenant.tenant;

    public TenantRepositoryImpl() {
        super(Tenant.class);
    }

    public List<Tenant> findAllRightJoin() {
        return from(tenant)
                .rightJoin(tenant.systems)
                .list(tenant);
    }

    public List<Tenant> findAllInnerJoin() {
        return from(tenant)
                .innerJoin(tenant.systems)
                .list(tenant);
    }

    @Override
    public List<Tenant> findAll() {
        return null;
    }
}
