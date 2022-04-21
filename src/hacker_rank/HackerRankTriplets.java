package hacker_rank;

import java.util.ArrayList;
import java.util.List;

public class HackerRankTriplets {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);

        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);

        List<Integer> points = new ArrayList<>();
        points.add(0);
        points.add(0);

        for (int i=0; i<a.size(); i++) {
           if (a.get(i) > b.get(i)) {
               int alicesPoints = points.get(0)+1;
               points.set(0, alicesPoints);
           } else if (a.get(i) < b.get(i)) {
               int bobsPoints = points.get(1)+1;
               points.set(1, bobsPoints);
           }
        }

        System.out.println(points);
    }
}
