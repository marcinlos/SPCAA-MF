
/**
 * @(#)P3.java
 *
 *
 * @author 
 * @version 1.00 2015/2/23
 */
import java.util.concurrent.CyclicBarrier;

class P3 extends Production {
    P3(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex T) {

        return T;
    }
}