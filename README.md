# Employee Wage Computation

This is a simple Java console application that simulates employee wage computation based on random attendance, working hours, and company rules.

## Objective

The application calculates the total employee wage for a month by:

- Checking daily attendance (Absent, Full-time, Part-time)
- Calculating daily wage
- Accumulating total working hours and days
- Stopping once a maximum limit of working hours or days is reached

## Features Implemented

- [x] UC1: Check employee attendance
- [x] UC2: Calculate daily wage
- [x] UC3: Handle part-time employee wage
- [x] UC4: Use `switch` case to handle attendance types
- [x] UC5: Calculate total wage for a month with constraints
- [x] UC6: (Merged with UC5) Stop if max 100 hours or 20 days is reached
- [x] UC7: Refactor using class method and class variables

## Logic

- WAGE_PER_HOUR = ₹20
- FULL_DAY_HOUR = 8
- PART_TIME_HOUR = 4
- MAX_WORKING_DAYS = 20
- MAX_WORKING_HOURS = 100

## Technologies Used

- Java
- Random class (for simulating attendance)
- Loops and `switch` statements

## How to Run

```bash
javac com.employeewage.EmployeeWage.java
java com.employeewage.EmployeeWage
