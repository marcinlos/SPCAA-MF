import java.util.concurrent.CyclicBarrier;

class AN extends Production {

    AN(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex T) {
        System.out.println("AN");
        //fill T.m_a and T.m_b with your system here

        return T;
    }
}