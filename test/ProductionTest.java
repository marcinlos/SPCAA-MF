import org.junit.Assert;

import java.util.concurrent.CyclicBarrier;

import static java.lang.Math.abs;

public abstract class ProductionTest {

    public static double EPS = 1e-6;

    protected CyclicBarrier barrier;

    protected void setupBarrier(int count) {
        barrier = new CyclicBarrier(count);
    }

    public static void assertVectorEquals(double[] expected, double[] actual) {
        for (int i = 0; i < 3; ++i) {
            if (abs(expected[i] - actual[i]) >= EPS) {
                Assert.fail("Vectors differ at [" + i + "]\n" +
                        "Expected: " + PrettyPrint.print(expected) + "\n" +
                        "Actual  : " + PrettyPrint.print(actual));
            }
        }
    }

    public static void assertMatrixEquals(double[][] expected, double[][] actual) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (abs(expected[i][j] - actual[i][j]) >= EPS) {
                    Assert.fail("Matrices differ at [" + i + "][" + j + "]\n" +
                            "Expected:\n" + PrettyPrint.print(expected) +
                            "Actual:\n" + PrettyPrint.print(actual));
                }
            }
        }
    }
}
