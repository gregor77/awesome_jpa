package src.bookboogie.jpa.tenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.bookboogie.jpa.tenant.repository.TenantRepository;

@Service
public class TenantServiceImpl implements TenantService{

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public Tenant findByTenantId(Long tenantId) {
        return tenantRepository.findByTenantId(tenantId);
    }

    @Override
    public void create(Tenant tenant) {
        tenantRepository.save(tenant);
    }
}
