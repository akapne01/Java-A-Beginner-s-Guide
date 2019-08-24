package OCA_Programmer_Exam_Guide.practice;

import WhizLabsTests.practice_1.P1_8;

import java.util.*;
import java.sql.*;

public class Pleant {
    Pleant getType() {
        return this;
    }

    public static void main(String[] args) {
        System.out.println(new Pleant().getType());
        double d = 0000_1.6;
        double dd = 000001.9;
        System.out.println(d);
        System.out.println(dd);
        System.out.println(new Long("3"));
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.remove("A");
        System.out.println(a);
        Pleant p = new Pleant();
        System.out.println(p.m((short)9));
    }

    String m(short a) {
        return "a";
    }

    String m(short ... a) {
        return "b";
    }




}
