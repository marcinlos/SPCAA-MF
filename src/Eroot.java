import java.util.concurrent.CyclicBarrier;

class Eroot extends Production {
    Eroot(Vertex Vert, CyclicBarrier Count) {
        super(Vert, Count);
    }

    Vertex apply(Vertex T) {
        // Solve the system
        // ...

        // Undo the swap made by A2 !!!
        double x0 = T.m_x[1];
        T.m_x[1] = T.m_x[0];
        T.m_x[0] = x0;

        return T;
    }
}