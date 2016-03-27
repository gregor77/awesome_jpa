package src.bookboogie.jpa.tenant;

public interface TenantService {

    Tenant findByTenantId(Long tenantId);

    void create(Tenant tenant);
}
