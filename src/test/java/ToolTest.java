import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




class ToolTest {
    @Test
    void testSum(){
        int res;
        res=Calculator.calculate(5,3,"add");
        assertEquals(8,res);

        res=Calculator.calculate(9,3,"add");
        assertEquals(12,res);
    }

    @Test
    void testMult(){
        int res;
        res=Calculator.calculate(5,3,"mult");
        assertEquals(15,res);

    }

    @Test
    void testPower(){
        int res;
        res=Calculator.calculate(5,3,"power");
        assertEquals(125,res);

    }
}