
/**
 * @(#)P2.java
 *
 *
 * @author 
 * @version 1.00 2015/2/23
 */
import java.util.concurrent.CyclicBarrier;

class P2 extends Production {
    P2(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex T) {

        return T;
    }
}
