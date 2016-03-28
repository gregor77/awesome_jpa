package src.bookboogie.jpa.tenant.repository;

import src.bookboogie.jpa.tenant.Tenant;

import java.util.List;

public interface TenantRepositoryCustom {
    public List<Tenant> findAll();
}
