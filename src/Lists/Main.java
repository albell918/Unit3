package Lists;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit3
 * @class Main
 * @since 30.03.2021 - 13.28
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();

        LocalDateTime startArr = LocalDateTime.now();

        Random random = new Random();

        int r1 = random.nextInt(1000);

        for (int i = 0; i < 100000; i++) {
            l1.add(random.nextInt(1000));
        }

        LocalDateTime finishArr = LocalDateTime.now();

        int durationArr = (int) ChronoUnit.MILLIS.between(startArr, finishArr);

        System.out.println("Arraylist creation takes " + durationArr + "ms");

        List<Integer> l2 = new LinkedList<>();

        LocalDateTime startLinked = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            l2.add(random.nextInt(1000));
        }
        LocalDateTime finishLinked = LocalDateTime.now();

        int durationLinked = (int) ChronoUnit.MILLIS.between(startLinked, finishLinked);

        System.out.println("Linked list creation takes " + durationLinked + "ms");
        System.out.println("-----------------------------------------------------------");

        LocalDateTime startAddArrBeg = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            l1.add(r1);
        }
        LocalDateTime finishAddArrBeg = LocalDateTime.now();
        int durationAddArrBeg = (int) ChronoUnit.MILLIS.between(startAddArrBeg, finishAddArrBeg);
        System.out.println("Adding elements to the beginning of the arraylist takes " + durationAddArrBeg + "ms");

        LocalDateTime startAddArrMid = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l1.add((int) l1.size() / 2, r1);
        }
        LocalDateTime finishAddArrMid = LocalDateTime.now();
        int durationAddArrMid = (int) ChronoUnit.MILLIS.between(startAddArrMid, finishAddArrMid);
        System.out.println("Adding elements to the middle of the arraylist takes " + durationAddArrMid + "ms");
        LocalDateTime startAddArrEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l1.add(l1.size(), r1);
        }

        LocalDateTime finishAddArrEnd = LocalDateTime.now();

        int durationAddArrEnd = (int) ChronoUnit.MILLIS.between(startAddArrEnd, finishAddArrEnd);

        System.out.println("Adding elements to the end of the arraylist takes " + durationAddArrEnd + "ms");

        LocalDateTime startAddLinkedBeg = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            l2.add(r1);
        }
        LocalDateTime finishAddLinkedBeg = LocalDateTime.now();
        int durationAddLinkedBeg = (int) ChronoUnit.MILLIS.between(startAddLinkedBeg, finishAddLinkedBeg);
        System.out.println("Adding elements to the beginning of the Linked list takes " + durationAddLinkedBeg + "ms");

        LocalDateTime startAddLinkedMid = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l2.add((int) l2.size() / 2, r1);
        }
        LocalDateTime finishAddLinkedMid = LocalDateTime.now();
        int durationAddLinkedMid = (int) ChronoUnit.MILLIS.between(startAddLinkedMid, finishAddLinkedMid);
        System.out.println("Adding elements to the middle of the Linked list takes " + durationAddLinkedMid + "ms");

        LocalDateTime startAddLinkedEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l2.add(l2.size() - 5, r1);
        }
        LocalDateTime finishAddLinkedEnd = LocalDateTime.now();
        int durationAddLinkedEnd = (int) ChronoUnit.MILLIS.between(startAddLinkedEnd, finishAddLinkedEnd);
        System.out.println("Adding elements to the end of the Linked list takes " + durationAddLinkedEnd + "ms");

        System.out.println("-----------------------------------------------------------");

        LocalDateTime startModArrBeg = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            l1.set(i, r1);
        }
        LocalDateTime finishMOdArrBeg = LocalDateTime.now();
        int durationMOdArrBeg = (int) ChronoUnit.MILLIS.between(startModArrBeg, finishMOdArrBeg);
        System.out.println("Updating elements on the beginning of the arraylist takes " + durationMOdArrBeg + "ms");

        LocalDateTime startModArrMid = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l1.set((int) l1.size() / 2 - 500 + i, r1);
        }
        LocalDateTime finishMOdArrMid = LocalDateTime.now();
        int durationMOdArrMid = (int) ChronoUnit.MILLIS.between(startModArrMid, finishMOdArrMid);
        System.out.println("Updating elements in the middle of the arraylist takes " + durationMOdArrMid + "ms");

        LocalDateTime startModArrEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l1.set((int) l1.size() - i - 5, r1);
        }
        LocalDateTime finishMOdArrEnd = LocalDateTime.now();


        int durationMOdArrEnd = (int) ChronoUnit.MILLIS.between(startModArrEnd, finishMOdArrEnd);
        System.out.println("Updating elements at the end of the arraylist takes " + durationMOdArrEnd + "ms");


        LocalDateTime startModLinkedBeg = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            l2.set(i, r1);
        }
        LocalDateTime finishMOdLinkedBeg = LocalDateTime.now();
        int durationMOdLinkedBeg = (int) ChronoUnit.MILLIS.between(startModLinkedBeg, finishMOdLinkedBeg);
        System.out.println("Updating elements on the beginning of the linked list takes " + durationMOdLinkedBeg + "ms");

        LocalDateTime startModLinkedMid = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l2.set((int) l2.size() / 2 - 500 + i, r1);
        }
        LocalDateTime finishMOdLinkedMid = LocalDateTime.now();
        int durationMOdLinkedMid = (int) ChronoUnit.MILLIS.between(startModLinkedMid, finishMOdLinkedMid);
        System.out.println("Updating elements in the middle of the linked list takes " + durationMOdLinkedMid + "ms");

        LocalDateTime startModLinkedEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l2.set((int) l2.size() - i - 1, r1);
        }
        LocalDateTime finishMOdLinkedEnd = LocalDateTime.now();

        int durationMOdLinkedEnd = (int) ChronoUnit.MILLIS.between(startModLinkedEnd, finishMOdLinkedEnd);
        System.out.println("Updating elements at the end of the linked list takes " + durationMOdLinkedEnd + "ms");

        System.out.println("-----------------------------------------------------------");

        LocalDateTime startDelArrBeg = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {

            l1.remove(i);
        }
        LocalDateTime finishDelArrBeg = LocalDateTime.now();

        int durationDelArrBeg = (int) ChronoUnit.MILLIS.between(startDelArrBeg, finishDelArrBeg);

        System.out.println("Deleting elements from the beginning of the arraylist takes " + durationDelArrBeg + "ms");

        LocalDateTime startDelArrMid = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l1.remove((int) l1.size() / 2 - 500 + i);
        }
        LocalDateTime finishDelArrMid = LocalDateTime.now();
        int durationDelArrMid = (int) ChronoUnit.MILLIS.between(startDelArrMid, finishDelArrMid);
        System.out.println("Deleting elements from the middle of the arraylist takes " + durationDelArrMid + "ms");

        LocalDateTime startDelArrEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l1.remove((int) l1.size() - i - 5);
        }
        LocalDateTime finishDelArrEnd = LocalDateTime.now();
        int durationDelArrEnd = (int) ChronoUnit.MILLIS.between(startDelArrEnd, finishDelArrEnd);
        System.out.println("Deleting elements from the end of the arraylist takes " + durationDelArrEnd + "ms");

        LocalDateTime startDelLinkedBeg = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {

            l2.remove(i);
        }
        LocalDateTime finishDelLinkedBeg = LocalDateTime.now();
        int durationDelLinkedBeg = (int) ChronoUnit.MILLIS.between(startDelLinkedBeg, finishDelLinkedBeg);
        System.out.println("Deleting elements from the beginning of the linked list takes " + durationDelLinkedBeg + "ms");

        LocalDateTime startDelLinkedMid = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l2.remove((int) l2.size() / 2 - 500 + i);
        }
        LocalDateTime finishDelLinkedMid = LocalDateTime.now();
        int durationDelLinkedMid = (int) ChronoUnit.MILLIS.between(startDelLinkedMid, finishDelLinkedMid);
        System.out.println("Deleting elements from the middle of the linked list takes " + durationDelLinkedMid + "ms");

        LocalDateTime startDelLinkedEnd = LocalDateTime.now();
        for (int i = 0; i < 1000; i++) {
            l2.remove((int) l2.size() - i - 1);
        }
        LocalDateTime finishDelLinkedEnd = LocalDateTime.now();
        int durationDelLinkedEnd = (int) ChronoUnit.MILLIS.between(startDelLinkedEnd, finishDelLinkedEnd);
        System.out.println("Deleting elements from the end of the linked list takes " + durationDelLinkedEnd + "ms");
    }

}

//        Arraylist creation takes 17ms
//        Linked list creation takes 19ms
//        -----------------------------------------------------------
//        Adding elements to the beginning of the arraylist takes 0ms
//        Adding elements to the middle of the arraylist takes 20ms
//        Adding elements to the end of the arraylist takes 0ms
//        Adding elements to the beginning of the Linked list takes 0ms
//        Adding elements to the middle of the Linked list takes 161ms
//        Adding elements to the end of the Linked list takes 0ms
//        -----------------------------------------------------------
//        Updating elements on the beginning of the arraylist takes 1ms
//        Updating elements in the middle of the arraylist takes 0ms
//        Updating elements at the end of the arraylist takes 0ms
//        Updating elements on the beginning of the linked list takes 6ms
//        Updating elements in the middle of the linked list takes 175ms
//        Updating elements at the end of the linked list takes 0ms
//        -----------------------------------------------------------
//        Deleting elements from the beginning of the arraylist takes 42ms
//        Deleting elements from the middle of the arraylist takes 13ms
//        Deleting elements from the end of the arraylist takes 0ms
//        Deleting elements from the beginning of the linked list takes 1ms
//        Deleting elements from the middle of the linked list takes 127ms
//        Deleting elements from the end of the linked list takes 1ms
//
//        In this test scenario, array list is faster than arraylist at all
//        tasks, except deleting elements from the beginning