package com.company.algorithms.rearrangeLastN;


public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();

        new Thread(() -> customer.widthdraw(15000)).start();
        new Thread(() -> customer.deposit(5000)).start();
    }


}

class Customer {
    int amount = 10000;

    synchronized void widthdraw(int amount) {
        System.out.println(this.amount);
        System.out.println("Going to withdraw.");

        if (this.amount < amount) {
            System.out.println("Less Balance, waiting for deposit.");
        }

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.amount);
    }

    synchronized void deposit(int amount) {
        System.out.println("Deposit.");
        this.amount += amount;
        System.out.println("Deposit completed.");
        notify();
    }
}
//    public static void main(String[] args) {
//        SinglyLinkedList<Integer> list = new SinglyLinkedList<>(1);
//
//        int[] array = new int[]{2, 3, 4, 5};
//        for (int i = 0; i < array.length; i++) {
//            list.add(array[i]);
//        }
//
//        list.rearrangeLastN(3);
//        list.print();
//        System.out.println(list.get(2));
//    }
//
//}
