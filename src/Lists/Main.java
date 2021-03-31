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

        for (int i = 0; i < 100000 ; i++) {
            l1.add(random.nextInt(1000));
        }

        LocalDateTime finishArr = LocalDateTime.now();

        int durationArr = (int) ChronoUnit.MILLIS.between( startArr, finishArr);

        System.out.println("Arraylist creation takes "+durationArr+"ms");

        List<Integer> l2 = new LinkedList<>();

        LocalDateTime startLinked = LocalDateTime.now();

        for (int i = 0; i < 100000 ; i++) {
            l2.add(random.nextInt(1000));
        }
        LocalDateTime finishLinked = LocalDateTime.now();

        int durationLinked = (int) ChronoUnit.MILLIS.between( startLinked, finishLinked);

        System.out.println("Linked list creation takes "+durationLinked+"ms");
        System.out.println("-----------------------------------------------------------");

        LocalDateTime startAddArr = LocalDateTime.now();

        for (int i = 0; i<1000;i++){

            l1.add(r1);
        }

        for (int i = 0; i < 1000; i++) {
            l1.add((int)l1.size()/2,r1);
        }

        for (int i = 0; i < 1000; i++) {
            l1.add(l1.size(),r1);
        }

        LocalDateTime finishAddArr = LocalDateTime.now();

        int durationAddArr = (int) ChronoUnit.MILLIS.between(startAddArr,finishAddArr);

        System.out.println("Adding elements to arraylist takes "+durationAddArr+"ms");

        LocalDateTime startAddLinked = LocalDateTime.now();

        for (int i = 0; i<1000;i++){

            l2.add(r1);
        }

        for (int i = 0; i < 1000; i++) {
            l2.add((int)l2.size()/2,r1);
        }

        for (int i = 0; i < 1000; i++) {
            l2.add(l2.size(),r1);
        }

        LocalDateTime finishAddLinked = LocalDateTime.now();

        int durationAddLinked = (int) ChronoUnit.MILLIS.between(startAddLinked,finishAddLinked);

        System.out.println("Adding elements to Linked list takes "+durationAddLinked+"ms");

        System.out.println("-----------------------------------------------------------");

        LocalDateTime startModArr = LocalDateTime.now();

        for (int i = 0; i<1000;i++){

            l1.set(i, r1);
        }

        for (int i = 0; i < 1000; i++) {
            l1.set((int)l1.size()/2-500+i,r1);
        }

        for (int i = 0; i < 1000; i++) {
            l1.set((int)l1.size()-i-1,r1);
        }

        LocalDateTime finishMOdArr = LocalDateTime.now();

        int durationMOdArr = (int) ChronoUnit.MILLIS.between(startModArr,finishMOdArr);

        System.out.println("Updating elements on arraylist takes "+durationAddArr+"ms");

        LocalDateTime startModLinked = LocalDateTime.now();

        for (int i = 0; i<1000;i++){

            l2.set(i, r1);
        }

        for (int i = 0; i < 1000; i++) {
            l2.set((int)l2.size()/2-500+i,r1);
        }

        for (int i = 0; i < 1000; i++) {
            l2.set((int)l2.size()-i-1,r1);
        }

        LocalDateTime finishMOdLinked = LocalDateTime.now();

        int durationMOdLinked = (int) ChronoUnit.MILLIS.between(startModArr,finishMOdArr);

        System.out.println("Updating elements on linked list takes "+durationAddLinked+"ms");

        System.out.println("-----------------------------------------------------------");

        LocalDateTime startDelArr = LocalDateTime.now();

        for (int i = 0; i<1000;i++){

            l1.remove(i);
        }

        for (int i = 0; i < 1000; i++) {
            l1.remove((int)l1.size()/2-500+i);
        }

        for (int i = 0; i < 1000; i++) {
            l1.remove((int)l1.size()-i-1);
        }

        LocalDateTime finishDelArr = LocalDateTime.now();

        int durationDelArr = (int) ChronoUnit.MILLIS.between(startDelArr,finishDelArr);

        System.out.println("Deleting elements from arraylist takes "+durationDelArr+"ms");


        LocalDateTime startDelLinked = LocalDateTime.now();

        for (int i = 0; i<1000;i++){

            l2.remove(i);
        }

        for (int i = 0; i < 1000; i++) {
            l2.remove((int)l2.size()/2-500+i);
        }

        for (int i = 0; i < 1000; i++) {
            l2.remove((int)l2.size()-i-1);
        }

        LocalDateTime finishDelLinked = LocalDateTime.now();

        int durationDelLinked = (int) ChronoUnit.MILLIS.between(startDelLinked,finishDelLinked);

        System.out.println("Deleting elements from linked list takes "+durationAddLinked+"ms");
    }

}

//        Arraylist creation takes 12ms
//        Linked list creation takes 28ms
//        -----------------------------------------------------------
//        Adding elements to arraylist takes 19ms
//        Adding elements to Linked list takes 124ms
//        -----------------------------------------------------------
//        Updating elements on arraylist takes 19ms
//        Updating elements on linked list takes 124ms
//        -----------------------------------------------------------
//        Deleting elements from arraylist takes 31ms
//        Deleting elements from linked list takes 124ms