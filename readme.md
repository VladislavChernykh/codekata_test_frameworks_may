## Part 1

Implement Calculator class and cover its methods with JUnit tests with both positive and negative scenarios. Group negative and positive tests cases into separate test suites.
Add following functionality:
1. Addition, subtraction, multiplication, division, root/power function for int and double values.
2. Division, root/power should check parameters and throw IllegalArgumentException (division by zero etc.).
3. isPrime function and design test parameters for negative timeout scenario.
4. Fibonacci sequence function. Use Java Hamcrest matchers to validate result.
5. Handle all edge cases.

## Part 2

Migrate your tests to TestNG.
Also, your tests should have to:

- Configured via testng.xml
- Run in parallel
- Grouped and Prioritized test cases (add more tests if it’s required)
- Support a few parameters
- Dependencies between tested methods
