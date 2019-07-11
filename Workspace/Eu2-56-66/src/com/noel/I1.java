package com.noel;

public interface I1 {

}
interface I2 { }
class C1 implements I1 { }
class C2 implements I2 { }
class C3 extends C1 implements I2 { }
/*
 * correct c4 can extend c3, does not need
 * to implement I1 as it extends C1 which
 * implements I1
 */
class C4 extends C3 implements I1, I2 { }
