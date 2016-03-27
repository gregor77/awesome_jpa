package src.bookboogie.jpa.tenant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, String>, QueryDslPredicateExecutor<Tenant>{
    Tenant findByTenantId(Long tenantId);
}
