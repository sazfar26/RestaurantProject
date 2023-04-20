/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;

import java.util.ArrayList;

/**
 *
 * @author sufia
 */
public class Module3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FastFoodKitchen kitchen = new FastFoodKitchen();

        //Part A
//        int orderPosition = kitchen.findOrderSeq(99);
//        System.out.println("Using sequential search >> order position is " + orderPosition);
        //Part B
//        kitchen.selectionSort();
          kitchen.insertionSort();
        ArrayList<BurgerOrder> sortedOrders = kitchen.getOrderList();
        int orderSize;
        for (BurgerOrder order : sortedOrders) {
            orderSize = order.getNumCheeseburgers() + order.getNumHamburgers() + order.getNumVeggieburgers();
            System.out.println(order.getOrderNum() + " has " + orderSize + " burgers.");

        }
        //Part D
        int orderPosition = kitchen.findOrderBin(2);
        System.out.println("Using binary search >> order position is " + orderPosition);

    }

}
