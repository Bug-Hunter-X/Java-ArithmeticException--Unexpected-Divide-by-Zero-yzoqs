# Java ArithmeticException: Unexpected Divide by Zero

This repository demonstrates a Java program that throws an `ArithmeticException` due to division by zero. The unusual aspect of this bug is that the zero divisor is not explicitly coded, potentially making it harder to debug in larger, more complex programs.

The `UncommonBug.java` file contains the erroneous code. The `UncommonBugSolution.java` provides a corrected version that handles potential division by zero.

**How to reproduce:**
1. Compile and run `UncommonBug.java`.  Observe the `ArithmeticException`.
2. Compare with the solution in `UncommonBugSolution.java` which demonstrates robust handling of potential division-by-zero scenarios.