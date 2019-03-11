import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FullSolverTest {

    @Test
    public void buildingTreeWorks() {
        Executor executor = new Executor();
        Vertex root = executor.run();

        String tree = PrettyPrint.printTreeStructure(root);
        String msg = "Invalid tree:\n" + tree;

        assertEquals(msg, root.m_label, "root");
        checkSubtree(msg, root.m_left, 3);
        checkSubtree(msg, root.m_right, 2);
    }

    @Test
    public void solvingWorks() {
        Executor executor = new Executor();
        Vertex root = executor.run();

        double[] solution = extractSolution(collectLeaves(root));

        int n = 12;
        double h = 1. / n;
        double[] expected = new double[n + 1];
        for (int i = 0; i <= n; ++i) {
            expected[i] = i * h;
        }

        String msg = "Incorrect solution\n" +
                "Expected: " + PrettyPrint.print(expected) + "\n" +
                "Actual  : " + PrettyPrint.print(solution) + "\n";
        assertArrayEquals(msg, expected, solution, ProductionTest.EPS);
    }

    private void checkSubtree(String msg, Vertex node, int depth) {
        assertNotNull(msg, node);
        assertEquals(msg, node.m_label, depth > 0 ? "int" : "node");

        if (depth > 0) {
            checkSubtree(msg, node.m_left, depth - 1);
            checkSubtree(msg, node.m_right, depth - 1);
        }
    }

    private List<Vertex> collectLeaves(Vertex root) {
        List<Vertex> leaves = new ArrayList<>();
        Queue<Vertex> nodes = new ArrayDeque<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Vertex v = nodes.remove();
            if (v.m_label.equals("node")) {
                leaves.add(v);
            } else {
                nodes.add(v.m_left);
                nodes.add(v.m_right);
            }
        }
        return leaves;
    }

    private double[] extractSolution(final List<Vertex> leafs) {
        double[] solution = new double[leafs.size() + 1];
        solution[0] = leafs.get(0).m_x[1];
        for (int i = 0; i < leafs.size(); ++i) {
            solution[i + 1] = leafs.get(i).m_x[2];
        }
        return solution;
    }

}
