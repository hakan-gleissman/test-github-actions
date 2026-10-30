package se.sprinto.hakan;

import se.sprinto.hakan.model.Computer;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Computer computer = new Computer("Macbook pro", 1000000);
        Computer computer1 = new Computer("PC", 100000);
        List<Computer> computerList = List.of(computer, computer1);
        WebshopService webshopService = new WebshopService();
        System.out.println(webshopService.findMostExpensiveComputer(computerList));
    }
}
