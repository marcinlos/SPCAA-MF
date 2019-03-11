import java.util.concurrent.CyclicBarrier;

class A1 extends Production {

    A1(Vertex Vert, CyclicBarrier Barrier) {
        super(Vert, Barrier);
    }

    Vertex apply(Vertex T) {
        System.out.println("A1");
        //fill T.m_a and T.m_b with your system here

        return T;
    }
}