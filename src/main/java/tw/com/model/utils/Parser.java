package tw.com.model.utils;

import tw.com.model.model.Vehicle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final Pattern INPUT_LINE_PATTERN = Pattern.compile(".+:(\\d+).");

    public Vehicle convertLineToVehicle(String line) {
        String[] strings = line.split(" ");

        int id = Integer.parseInt(strings[0]);
        String name = strings[1];
        int price = Integer.parseInt(strings[2]);
        Matcher matcher = INPUT_LINE_PATTERN.matcher(strings[3]);
        int busload = 0;
        if (matcher.find()) {
            busload = Integer.parseInt(matcher.group(1));
            System.out.println(busload);
        }
        return new Vehicle(id, name, price, busload);
    }
}
