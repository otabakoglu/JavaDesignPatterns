package com.example;

/**
 * Created by Rubi on 24.04.2017.
 */

public class NoFaxImpl implements Fax{
    @Override
    public void fax() {
        System.out.printf("NoFax");
    }
}
