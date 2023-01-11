import static org.junit.jupiter.api.Assertions.*;

class GeronTest {

    @org.junit.jupiter.api.Test
    void geron() {
        var res = new Geron();
        assertEquals(6.0, res.geron(3, 4, 5));
    }
}