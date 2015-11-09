You are given as a standard input the number of employees in a company, the first names of two selected employees in a company, and the direct line management relations between every employee. Each person in the company can directly line manage a maximum 2 other employees.

The input has the following format:
- FIRST LINE: the number of unique employees in the company
- SECOND LINE: the name of a the first selected employee
- THIRD LINE: the name of a the second selected employee
- SUBSEQUENT LINES: line management relations (no cycles) in format: EmployeeX EmployeeY (). First line consist top manager.

Write a program that reads the input from stdin and then outputs the name of the single employee at the lowest point in the hierarchy to which the two selected employees report, either directly or indirectly. If one of selected employees report to each other (directly or not) print out the name of the higher one in the hierarchy

EXAMPLE 1:
Input:
6
Hilary
James
Sarah Fred
Sarah Paul
Fred Hilary
Fred Jenny
Jenny James

Output:
Fred

EXAMPLE 2:
Input:
5
Gareth
Alex
June Alex
June Qing
Qing Paul
Qing Gareth

Output:
June