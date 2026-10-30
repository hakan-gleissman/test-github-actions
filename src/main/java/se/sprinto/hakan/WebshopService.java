package se.sprinto.hakan;

import se.sprinto.hakan.model.Computer;

import java.util.List;

public class WebshopService {

    public Computer findMostExpensiveComputer(List<Computer> computers) {
        Computer computer = computers.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow();

        return computer;
    }
}
