package tw.com.model.utils;

import org.junit.Test;
import tw.com.model.model.Vehicle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParserTest {
    @Test
    public void testConvertSuccessfully() throws Exception {
        Parser parser = new Parser();
        Vehicle vehicle = parser.convertLineToVehicle("6 依维柯 1000 载货:0吨");
        assertThat(vehicle.getName(),is("依维柯"));
    }
}