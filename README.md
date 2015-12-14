# Practice 2013 - 01: Gradabase

## Background
It’s the end of the year for Hunt Valley Elementary. Everyone passed their
classes and is moving forward a grade; update everyone’s grade level in the
database. Kindergarden is represented by a 0, First grade by a 1, and so on.
The Hunt Valley Elementary is a K-6 school. Only print out student’s grade
levels who are still at Hunt Valley Elementary.

## Description

### Input
The first line of input is a number, n, representing the number of test cases.
Each case will start with a number, m, representing the number of entries in
that test case followed by a list of m integers between 0 and 6, with each
number on its own line. There will be anywhere from 1 to 500 test cases with
anywhere from 1 to 500 students per case

### Output
For each case, output the line “Case x:” where x is the case number, on a single
line, followed by a list of integers, each on a new line, between 1 and 6. If
the student has graduated from the school, do not print them.

## Sample
### Input
```
3
10
6
1
2
3
6
6
6
1
0
0
2
1
1
1
6
```

### Output
```
Case 1:
2
3
4
2
1
1
Case 2:
2
2
Case 3:
```
