package Problems;

/**
 * This question is asked in Samsung Interview. <br>
 *
 * <p>Given a binary matrix of dimensions with R rows and C columns. Start from cell(0, 0), moving
 * in the right direction. Perform the following operations: <br>
 *
 * <p>If the value of matrix[i][j] is 0, then traverse in the same direction and check the next
 * value. If the value of matrix[i][j] is 1, then update matrix[i][j] to 0 and change the current
 * direction clockwise. ie - up, right, down, or left directions change to right, down, left, and up
 * respectively. Find the index of the cell where you will be forced to exit the matrix while
 * performing the given traversal.
 */
public class LastCellInaMatrix {

    enum Direction {
        up,
        right,
        down,
        left
    }

    /**
     * Get the clock wise direction for the given direction
     *
     * @param direction current direction
     * @return rotated clock-wise direction.
     */
    static Direction getUpdatedClockWiseDirection(Direction direction) {
        switch (direction) {
            case up:
                return Direction.right;
            case right:
                return Direction.down;
            case down:
                return Direction.left;
            case left:
                return Direction.up;
            default:
                return direction;
        }
    }

    /**
     * Get the updated traversed cell for the given direction
     * @param i current row of matrix
     * @param j current column of matrix
     * @param direction updated direction
     * @return updated cell
     */
    static int[] getTraversedCellForDirection(int i, int j, Direction direction) {
        switch (direction) {
            case up:
                return new int[] {i - 1, j};
            case right:
                return new int[] {i, j + 1};
            case down:
                return new int[] {i + 1, j};
            case left:
                return new int[] {i, j - 1};
            default:
                return new int[] {i, j};
        }
    }

    /**
     * Function to check if the current cell is exit cell of the Matrix
     *
     * @param matrix matrix that need to be traversed
     * @param i current row of the matrix
     * @param j current column of the matrix
     * @param R Max row of the matrix
     * @param C Max col of the matrix
     * @param direction current direction of the matrix
     * @return return true if it's a exit cell otherwise it's false.
     */
    private static boolean isExitCellOfTheMatrix(int[][] matrix, int i, int j, int R, int C, Direction direction) {
        if (matrix[i][j] == 0) {
            // If the matrix[i,j] value is 0 and validate direction wise.
            return (direction == Direction.right && (j + 1) > C)
                    || (direction == Direction.left && (j - 1) < 0)
                    || (direction == Direction.up && (i - 1) < 0)
                    || (direction == Direction.down && (i + 1) > R);
        } else {
            // If the matrix[i,j] value is 1.
            return (direction == Direction.up && (j + 1) > C)
                    || (direction == Direction.down && (j - 1) < 0)
                    || (direction == Direction.left && (i - 1) < 0)
                    || (direction == Direction.right && (i + 1) > R);
        }
    }

    static int[] endPointsRecursive(int[][] matrix, int i, int j, int R, int C, Direction direction) {
        if (isExitCellOfTheMatrix(matrix, i, j, R, C, direction)) {
            return new int[] {i, j};
        } else if (matrix[i][j] == 0) {
            // Get the updated cell
            int[] updatedCell = getTraversedCellForDirection(i, j, direction);
            // Continues with same direction.
            endPointsRecursive(matrix, updatedCell[0], updatedCell[1], R, C, direction);
        } else if (matrix[i][j] == 1) {
            // Update matrix value to 0.
            matrix[i][j] = 0;
            // Get the updated direction
            Direction updatedDirection = getUpdatedClockWiseDirection(direction);
            // Get the updated cell
            int[] updatedCell = getTraversedCellForDirection(i, j, updatedDirection);
            // Continues with same direction.
            endPointsRecursive(matrix, updatedCell[0], updatedCell[1], R, C, updatedDirection);
        }
        return new int[] {i, j};
    }

    // Recursion
    static int[] endPoints(int[][] matrix, int R, int C) {
        // code here
        return endPointsRecursive(matrix, 0, 0, R - 1, C - 1, Direction.right);
    }
}
