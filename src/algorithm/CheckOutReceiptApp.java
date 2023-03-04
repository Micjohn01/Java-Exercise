//package Algorithm;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CheckOutReceiptApp {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Scanner input = new Scanner(System.in);
//
//        ArrayList<String>itemList = new ArrayList<>();
//        ArrayList<Integer>quantityList = new ArrayList<>();
//        ArrayList<Double>unitPriceList = new ArrayList<>();
//
//        System.out.println("Welcome to Prince Ebeano Supermarket");
//        while (true) {
//            System.out.println("What item did you purchase?");
//            String item = input.nextLine();
//            itemList.add(item);
//
//            System.out.println("The quantity/quantities purchased please");
//            int quantity = in.nextInt();
//            quantityList.add(quantity);
//
//            System.out.println("What's the price per unit?");
//            double unitPrice = input.nextDouble();
//            unitPriceList.add(unitPrice);
//
//            System.out.println("Do you still have more items to add?");
//            String option = input.nextLine().toUpperCase().toLowerCase()
//            if(!option.equals("Yes || yes")){
//                CheckOutReceiptAppTest.display(itemList, quantityList, unitPriceList);
//                break;
//
//            }
//        }
//    }
//}
