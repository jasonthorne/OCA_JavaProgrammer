package com.android;

public interface Condition {

}


interface Condition2 {

}

/*
 * An interface can extend multiple interfaces unlike a class where multiple extends are not allowed.
 */

interface Condition3 extends Condition, Condition2 {

}

