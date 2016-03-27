package src.bookboogie.jpa.tenant;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import src.bookboogie.jpa.Application;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TenantServiceTest {

    @Autowired
    private TenantService tenantService;

    private Tenant newTenant;

    @Before
    public void setUp() {
        newTenant = new Tenant();
        newTenant.setTenantName("테넌트1");
        tenantService.create(newTenant);
    }

    @Test
    public void 테넌트_추가_테스트() {
        Tenant tenant = tenantService.findByTenantId(newTenant.getTenantId());
        assertNotNull(tenant);
    }
}
