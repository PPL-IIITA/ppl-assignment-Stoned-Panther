package com.pushpendra.assignment.exceptions;

import com.pushpendra.assignment.Boy.CommittedBoys;

/**
 * Created by panther on 18/4/17.
 */
public class NoGirlFound extends Throwable{
    public NoGirlFound(CommittedBoys b) {
        System.out.println("NoGirlFound Exception catched");
        System.out.println("No Girl Found for boy->" + b.name);
    }
}
