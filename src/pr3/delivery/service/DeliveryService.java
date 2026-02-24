package pr3.delivery.service;

import pr3.delivery.model.*;
import java.util.*;

public class DeliveryService {

    public void printAllVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.getVehicleInfo();
            System.out.println("Delivery cost: " + v.calculateDeliveryCost());
            System.out.println("--------------------");
        }
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v.model + " delivery cost: " + v.calculateDeliveryCost());
        }
    }

    public double calculateTotalCost(List<Vehicle> vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateDeliveryCost();
        }
        return total;
    }
}