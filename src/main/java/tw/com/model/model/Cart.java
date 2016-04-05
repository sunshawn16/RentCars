package tw.com.model.model;

import tw.com.model.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    private List<Vehicle> cartList;


    public int checkout(List<Vehicle> cartList) {
        int sum = 0;
        for (Vehicle vehicle : cartList) {
            int subSum = vehicle.getNumber() * vehicle.getPrice() * vehicle.getRentDay();
            sum += subSum;
        }
        return sum;
    }

    public void initialCart(List<Vehicle> vehicles) {
        System.out.println("Here are vehicles can be rent:");
        System.out.println("Do you want to continue:1.Yes;2.No");
        Scanner scanInput = new Scanner(System.in);
        String input = "";

        while(true) {
            input = scanInput.nextLine();
            System.out.println("The input is : " + input);
            if (input.equals(2)) {
                System.out.println("Welcome back!");
                break;
            }

            showVehicleList(vehicles);

            System.out.println("input the id of the vehicle");
            int id = InputUtils.getInputNum();
            if (id > vehicles.size()) {
                System.out.println("the id is not exists");
                continue;
            }
            System.out.println("input the number of the vehicle");
            int number = InputUtils.getInputNum();
            System.out.println("input the days of the rent");
            int rentDay = InputUtils.getInputNum();
            Vehicle targetV = vehicles.get(id - 1);
            Vehicle cartVehicle = new Vehicle(targetV.getId(), targetV.getName(), targetV.getPrice(), targetV.getBusload());
            cartVehicle.setNumber(number);
            cartVehicle.setRentDay(rentDay);
            cartList = new ArrayList<>();
            cartList.add(cartVehicle);

            System.out.println("Do you want to continue shopping:1.Yes;2.No");
            input = scanInput.nextLine();
            if (input.equals(2)) {
                System.out.println("Welcome back!");
                break;
            }
        }
    }

    private void showVehicleList(List<Vehicle> vehicles) {
        System.out.println("Here are the vehicles:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getId() + " " + vehicle.getName() + " " +
                    vehicle.getPrice() + " " + vehicle.getBusload());

        }
    }

}
