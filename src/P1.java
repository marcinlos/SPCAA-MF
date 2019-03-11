
/**
 * @(#)P1.java
 * @author
 * @version 1.00 2015/2/23
 */

import java.util.concurrent.CyclicBarrier;

class P1 extends Production {
    P1(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex S) {

        return S;
    }
}
