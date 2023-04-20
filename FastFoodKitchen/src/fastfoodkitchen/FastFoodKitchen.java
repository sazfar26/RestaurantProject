/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

import java.util.*;

/**
 *
 * @author sufia
 */
public class FastFoodKitchen {

    private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
    private static int nextOrderNum;

    //Constructor for the class FastFoodKitchen,
    //populates FastFoodKitchen with 3 default orders.
    public FastFoodKitchen() {
        BurgerOrder orderC = new BurgerOrder(1, 1, 0, 2, false, 3);
        BurgerOrder orderB = new BurgerOrder(0, 0, 3, 3, false, 2);
        BurgerOrder orderA = new BurgerOrder(3, 5, 4, 10, true, 1);
        orderList.add(orderA);
        FastFoodKitchen.incrementNextOrderNum();
        orderList.add(orderB);
        FastFoodKitchen.incrementNextOrderNum();
        orderList.add(orderC);
        FastFoodKitchen.incrementNextOrderNum();
    }

    //Retrieves order number for next order.
    /**
     *
     * @return order number for next order
     */
    public int getNextOrderNum() {
        return nextOrderNum;
    }

    //Increments order number, so order numbers aren't repeated.
    /**
     *
     */
    private static void incrementNextOrderNum() {
        nextOrderNum++;
    }

    //Adds customer's order to the order list.
    /**
     *
     * @param ham number of hamburgers
     * @param cheese number of cheeseburgers
     * @param veggie number of veggieburgers
     * @param soda number of sodas
     * @param toGo is order to go/for here
     * @return the current order's number.
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo) {
        BurgerOrder newOrder = new BurgerOrder(ham, cheese, veggie, soda, toGo, nextOrderNum);
        orderList.add(newOrder);
        FastFoodKitchen.incrementNextOrderNum();
        return (nextOrderNum - 1);
    }

    //Used to cancel previous order.
    /**
     *
     * @return whether order can be cancelled or not
     */
    public boolean cancelLastOrder() {
        if (!orderList.isEmpty()) {
            orderList.remove((orderList.size() - 1));
            nextOrderNum--;
            return true;
        } else {
            return false;
        }
    }

    //Used to retrieve the number of pending orders.
    /**
     *
     * @return length of order list
     */
    public int getNumOrdersPending() {
        return orderList.size();
    }

    //Used to determine if a given order is done or not.
    /**
     *
     * @param orderID order number
     * @return false if order is in progress, true if done
     */
    public boolean isOrderDone(int orderID) {
        boolean decision = true;
        for (BurgerOrder i : orderList) {
            if (i.getOrderNum() == orderID) {
                decision = false;
                return decision;
            } else {
                decision = true;
            }
        }
        return decision;
    }

    //Used to cancel a given order
    /**
     *
     * @param orderID
     * @return true if order gets canceled, false if cannot be cancelled
     */
    public boolean cancelOrder(int orderID) {
        boolean decision = false;
        for (BurgerOrder i : orderList) {
            if (i.getOrderNum() == orderID) {
                orderList.remove(i);
                decision = true;
                return decision;
            } else {
                decision = false;
            }
        }
        return decision;
    }

    public int findOrderSeq(int orderID) {
        for (int j = 0; j < orderList.size(); j++) {
            if (orderList.get(j).getOrderNum() == orderID) {
                return j;
            }
        }
        return -1;
    }

    public void selectionSort() {
        for (int j = 0; j < orderList.size() - 1; j++) {
            int minIndex = j;
            for (int k = j + 1; k < orderList.size(); k++) {
                if (orderList.get(k).getTotalNumBurgers() < orderList.get(minIndex).getTotalNumBurgers()) {
                    minIndex = k;
                }
            }
            BurgerOrder temp = orderList.get(j);
            orderList.set(j, orderList.get(minIndex));
            orderList.set(minIndex, temp);
        }

    }

    public void insertionSort() {
        for (int j = 1; j < orderList.size(); j++) {
            BurgerOrder temp = orderList.get(j);
            int possibleIndex = j;
            while ((possibleIndex > 0) && (orderList.get(possibleIndex - 1).getTotalNumBurgers() > temp.getTotalNumBurgers())) {
                orderList.set(possibleIndex, orderList.get(possibleIndex - 1));
                possibleIndex--;
            }
            orderList.set(possibleIndex, temp);
        }
    }

    public int findOrderBin(int orderID) {
        int left = 0;
        int right = orderList.size() - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (orderID < orderList.get(middle).getOrderNum()) {
                right = middle - 1;
            } else if (orderID > orderList.get(middle).getOrderNum()) {
                left = middle + 1;
            } else {
                return middle + 1;
            }
        }
        return -1;
    }

    public ArrayList<BurgerOrder> getOrderList() {
        return orderList;
    }

}
