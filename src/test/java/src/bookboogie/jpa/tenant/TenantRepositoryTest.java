package src.bookboogie.jpa.tenant;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import src.bookboogie.jpa.Application;
import src.bookboogie.jpa.tenant.repository.TenantRepositoryImpl;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TenantRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(TenantRepositoryTest.class);

    @Autowired
    private TenantRepositoryImpl tenantRepositoryImpl;

    @Test
    public void testGetTenantAll() {
//        List<Tenant> tenants = tenantRepositoryImpl.findAll();
        List<Tenant> tenants = tenantRepositoryImpl.findAllRightJoin();
        assertNotNull(tenants);
        assertThat("tenants size is bigger than zero", tenants.size(), greaterThan(0));

        for (Tenant tenant : tenants) {
            logger.info("#### " + tenant.toString());
        }
    }
}
