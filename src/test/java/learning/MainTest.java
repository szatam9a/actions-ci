package learning;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void main() {
        Entity entity = new Entity();
        assertTrue(entity.isComplete());
    }
}