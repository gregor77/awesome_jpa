package src.bookboogie.jpa.system;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import src.bookboogie.jpa.Application;
import src.bookboogie.jpa.tenant.Tenant;
import src.bookboogie.jpa.tenant.TenantService;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class SystemServiceTest {

    @Autowired
    private SystemService systemService;

    private System system;

    @Before
    public void setUp() {
        system = new System();
//        systemService.create(system);
    }

    @Test
    public void 시스템_추가_테스트() {
//        assertNotNull(tenant);
    }
}
