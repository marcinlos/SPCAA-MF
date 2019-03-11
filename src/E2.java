import java.util.concurrent.CyclicBarrier;

class E2 extends Production {
    E2(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex T) {

        return T;
    }
}