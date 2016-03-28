package src.bookboogie.jpa.tenant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;
import src.bookboogie.jpa.tenant.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, String>, QueryDslPredicateExecutor<Tenant>{
    Tenant findByTenantId(Long tenantId);
}
