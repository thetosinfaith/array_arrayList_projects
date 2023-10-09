import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventoryManagementSystemTest {
@Test
void testCanAddProducts(){

    InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

assertEquals(2, inventoryManagementSystem.add(n));



    }


}
