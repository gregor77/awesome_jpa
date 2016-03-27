package src.bookboogie.jpa.tenant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, String>{
    Tenant findByTenantId(Long tenantId);
}
