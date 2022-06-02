import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixAddtionTest {
    @Test
    void 두_개의_2x2행렬_더하기() {
        MatrixAddtion matrixAddtion = new MatrixAddtion();

        int[][] fmatrix = {{1, 2}, {2, 3}};
        int[][] smatrix = {{3, 4}, {5, 6}};

        int[][] answer = matrixAddtion.add(fmatrix, smatrix);

        assertThat(answer)
                .hasDimensions(2, 2)
                .isEqualTo(new int[][]{{4, 6}, {7, 9}});
    }

    @Test
    void 두_개의_1x2행렬_더하기() {
        MatrixAddtion matrixAddtion = new MatrixAddtion();

        int[][] fmatrix = {{1}, {2}};
        int[][] smatrix = {{3}, {4}};

        int[][] answer = matrixAddtion.add(fmatrix, smatrix);

        assertThat(answer)
                .hasDimensions(2, 1)
                .isEqualTo(new int[][]{{4}, {6}});
    }
}
