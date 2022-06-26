package com.example.myapplication;

import android.graphics.drawable.shapes.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity {


    public void main() {



    }

}
public class b {
    void antherClass() {
        new a() {
            public void printLocal() {
                System.out.println(dataFiledInClassA);
                funInClassA();
            }
        };
    }

}
class a {

}

