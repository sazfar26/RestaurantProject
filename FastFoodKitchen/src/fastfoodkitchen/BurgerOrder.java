/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author sufia
 */
public class BurgerOrder {
    //Fields below
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;
    
    //Constructor below
    public BurgerOrder(int hamburgers, int cheeseburgers, int veggieburgers, int sodas, boolean togo, int ordernum) {
        numHamburgers = hamburgers;
        numCheeseburgers = cheeseburgers;
        numVeggieburgers = veggieburgers;
        numSodas = sodas;
        orderToGo = togo;
        orderNum = ordernum;
    }

    //Getter methods below
    public int getNumHamburgers() {
        return numHamburgers;
    }

    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }

    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }

    public int getNumSodas() {
        return numSodas;
    }
    public boolean isOrderToGo() {
        return orderToGo;
    }
    public int getOrderNum() {
        return orderNum;
    }

    //Setter methods below
    public void setNumHamburgers(int newNumHamburgers) {
        if (newNumHamburgers < 0) {
            System.out.println("Error. Please enter a valid number.");
        } else {
            this.numHamburgers = newNumHamburgers;
        }
    }

    public void setNumCheeseburgers(int newNumCheeseburgers) {
        if (newNumCheeseburgers < 0) {
            System.out.println("Error. Please enter a valid number.");
        } else {
            this.numCheeseburgers = newNumCheeseburgers;
        }
    }

    public void setNumVeggieburgers(int newNumVeggieburgers) {
        if (newNumVeggieburgers < 0) {
            System.out.println("Error. Please enter a valid number.");
        } else {
            this.numVeggieburgers = newNumVeggieburgers;
        }
    }

    public void setNumSodas(int newNumSodas) {
        if (newNumSodas < 0) {
            System.out.println("Error. Please enter a valid number.");
        } else {
            this.numSodas = newNumSodas;
        }
    }
    
    public void setOrderToGo(boolean newToGo) {
       this.orderToGo = newToGo; 
    }
    
    public void setOrderNum(int newOrderNum) {
        if (newOrderNum < 0) {
            System.out.println("Error. Please enter a valid number.");
        } else {
            this.orderNum = newOrderNum;
        }
    }
    
    public int getTotalNumBurgers() {
        return numCheeseburgers + numHamburgers + numVeggieburgers;
    }
}
