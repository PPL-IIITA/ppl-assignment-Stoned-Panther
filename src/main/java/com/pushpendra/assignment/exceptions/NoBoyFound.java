package com.pushpendra.assignment.exceptions;

import com.pushpendra.assignment.Girl.CommittedGirl;

/**
 * Created by panther on 18/4/17.
 */
public class NoBoyFound extends Throwable {

    public NoBoyFound(CommittedGirl g) {
        System.out.println("NoBoyFound exception catched");
        System.out.println("No boy found for girl-> " + g.name);
    }
}
