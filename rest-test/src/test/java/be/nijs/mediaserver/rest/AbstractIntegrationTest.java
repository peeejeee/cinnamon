package be.nijs.cinnamon.rest;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = cinnamonApplication.class)
@TransactionConfiguration(defaultRollback = true)
public abstract class AbstractIntegrationTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Before
    public void setUp() throws Exception {
//        Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
//        for (EntityType<?> entity : entities) {
//            entityManager.createQuery("delete from " + entity.getName()).executeUpdate();
//        }
//        entityManager.flush();
    }
}
