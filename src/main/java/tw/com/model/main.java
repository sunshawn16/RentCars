package tw.com.model;

import tw.com.model.model.Cart;
import tw.com.model.model.Vehicle;
import tw.com.model.utils.Parser;

import java.io.IOException;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Paths.get;
import static java.util.stream.Collectors.toList;

public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the rent system:");
        List<String> lines = readAllLines(get("/Users/xiaosun/practice/Mars/src/main/java/tw/com/model/resource/input"));
        Parser parser = new Parser();
        List<Vehicle> vehicles = lines.stream().map(line -> parser.convertLineToVehicle(line)).collect(toList());
        Cart cart = new Cart();
        cart.initialCart(vehicles);

        System.out.println("the total is:");
        cart.checkout(vehicles);
    }
}
