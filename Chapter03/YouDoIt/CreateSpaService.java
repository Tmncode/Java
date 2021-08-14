package Chapter03.YouDoIt;

import Chapter03.YouDoIt.SpaService;

import java.util.Scanner;

public class CreateSpaService {

    public static void main(String[] args) {

        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();

        firstService = getData(firstService);
        secondService = getData(secondService);

        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }

    public static SpaService getData(SpaService serve){

        String service;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter service >> ");
        service = keyboard.nextLine();

        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println();
        serve.setServiceDescription(service);
        serve.setPrice(price);
        return serve;
    }

}
