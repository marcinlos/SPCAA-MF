import java.util.concurrent.CyclicBarrier;

class A extends Production {

    A(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex T) {
        System.out.println("A");
        //fill T.m_a and T.m_b with your system here

        return T;
    }
}