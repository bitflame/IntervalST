import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalSTTest {
    IntervalST iST = new IntervalST();
    @BeforeEach
    void setUp() {
        iST.put(17.0, 19.0, 1.0);
        iST.put(5.0, 8.0, 1.0);
        iST.put(21.0, 24.0, 1.0);
        iST.put(4.0, 8.0, 1.0);
        iST.put(15.0, 18.0, 1.0);
        iST.put(7.0, 10.0, 1.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(iST.isEmpty());
    }

    @Test
    void size() {
        Assertions.assertEquals(1,iST.size());
    }

    @Test
    void contains() {
    }

    @Test
    void get() {
    }

    @Test
    void put() {
    }

    @Test
    void deleteMin() {
    }

    @Test
    void deleteMax() {
    }

    @Test
    void delete() {
    }

    @Test
    void min() {
    }

    @Test
    void max() {
    }

    @Test
    void floor() {
    }

    @Test
    void floor2() {
    }

    @Test
    void ceiling() {
    }

    @Test
    void select() {
    }

    @Test
    void rank() {
    }

    @Test
    void keys() {
    }

    @Test
    void testKeys() {
    }

    @Test
    void testSize() {
    }

    @Test
    void height() {
    }

    @Test
    void levelOrder() {
    }

    @Test
    void testPut() {
    }
}