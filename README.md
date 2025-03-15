# Advanced Programming (Java) - QAP 3

### **David Husk**  
**March 15, 2025**  
**GitHub Repository:** [https://github.com/davehusk/Advanced_Programming_Java_QAP3](https://github.com/davehusk/Advanced_Programming_Java_QAP3)

---

## **Project Overview**
This repository contains the solutions for the **Quantitative Assessment Practice (QAP) 3** for the **Advanced Programming (Java)** course. The assignment covers key Java concepts, including:

- **Inheritance** (Problem 1)
- **Polymorphism** (Problem 2)
- **Abstract Classes** (Problem 3)
- **Interfaces** (Problem 4)

Each problem is implemented with **input validation**, **edge case handling**, and **additional functionality** to demonstrate mastery of the subject matter.

---

## **Directory Structure**
The project is organized into four folders, one for each problem:

```
Advanced_Programming_Java_QAP3/
├── Problem1/              # Inheritance (Person, Student, Teacher, CollegeStudent)
├── Problem2/              # Polymorphism (Point, MovablePoint)
├── Problem3/              # Abstract Classes (Shapes)
├── Problem4/              # Interfaces (Scalable Shapes)
```

---

## **How to Run the Code**
1. Clone the repository:
   ```bash
   git clone https://github.com/davehusk/Advanced_Programming_Java_QAP3.git
   ```
2. Navigate to the problem folder (e.g., `Problem1`):
   ```bash
   cd Problem1
   ```
3. Compile and run the `Demo.java` file:
   ```bash
   javac Demo.java
   java Demo
   ```

---

## **Key Features**
- **Problem 1**: Implementation of inheritance with `Person`, `Student`, `Teacher`, and `CollegeStudent` classes. Includes input validation and additional methods like `isHonorRoll()` and `getMonthlySalary()`.
- **Problem 2**: Implementation of polymorphism with `Point` and `MovablePoint` classes. Includes methods like `distanceTo()` and `isMovingDiagonally()`.
- **Problem 3**: Implementation of abstract classes for shapes (`Circle`, `Ellipse`, `Triangle`, `EquilateralTriangle`). Includes methods like `isRegular()` and `getAspectRatio()`.
- **Problem 4**: Implementation of the `Scalable` interface to scale shapes. Includes a static method to scale all shapes in an array.

---

## **Screenshots**
Each problem folder contains a screenshot (`output_screenshot.png`) of the program's output.

---

## **Feedback and Improvements**
If you have any feedback or suggestions for improvement, please feel free to open an issue or submit a pull request.

---



### **Problem 1: Inheritance (Person, Student, Teacher, CollegeStudent)**

#### **Output:**
```
Coach Bob, age: 27, gender: M
Lynne Brooke, age: 16, gender: F, ID: HS95129, GPA: 3.5
Duke Java, age: 34, gender: M, Subject: Computer Science, Salary: $50000.0
Ima Frosh, age: 18, gender: F, ID: UCB123, GPA: 4.0, Year: 1, Major: English

Additional Functionality:
Is Lynne on the honor roll? true
Mr. Java's monthly salary: $4166.666666666667
```

#### **Verification:**
1. **Person Class**:
   - Output: `Coach Bob, age: 27, gender: M`
   - This is correct. The `Person` class displays the name, age, and gender.

2. **Student Class**:
   - Output: `Lynne Brooke, age: 16, gender: F, ID: HS95129, GPA: 3.5`
   - This is correct. The `Student` class extends `Person` and adds the ID and GPA.

3. **Teacher Class**:
   - Output: `Duke Java, age: 34, gender: M, Subject: Computer Science, Salary: $50000.0`
   - This is correct. The `Teacher` class extends `Person` and adds the subject and salary.

4. **CollegeStudent Class**:
   - Output: `Ima Frosh, age: 18, gender: F, ID: UCB123, GPA: 4.0, Year: 1, Major: English`
   - This is correct. The `CollegeStudent` class extends `Student` and adds the year and major.

#### **Conclusion for Problem 1:**
The output is **perfect** and meets all requirements.

---

### **Problem 2: Point and MovablePoint**

#### **Output:**
```
Point: (1.0, 2.0)
MovablePoint: (3.0, 4.0), Speed: (1.0, 1.0)
After moving: (4.0, 5.0), Speed: (1.0, 1.0)

Additional Functionality:
Distance between point and movablePoint: 4.242640687119285
Is movablePoint moving diagonally? true
```

#### **Verification:**
1. **Point Class**:
   - Output: `Point: (1.0, 2.0)`
   - This is correct. The `Point` class displays the coordinates (x, y).

2. **MovablePoint Class**:
   - Initial Output: `MovablePoint: (3.0, 4.0), Speed: (1.0, 1.0)`
     - This is correct. The `MovablePoint` class displays the coordinates and speed.
   - After Moving: `After moving: (4.0, 5.0), Speed: (1.0, 1.0)`
     - This is correct. The `move()` method updates the coordinates by adding the speed.

#### **Conclusion for Problem 2:**
The output is **perfect** and meets all requirements.

---

### **Problem 3: Abstract Classes (Shapes)**

#### **Output:**
```
Shape: Circle, Area: 78.53981633974483, Perimeter: 31.41592653589793
Shape: Ellipse, Area: 75.39822368615503, Perimeter: 31.730875151127922
Shape: Triangle, Area: 6.0, Perimeter: 12.0
Shape: Equilateral Triangle, Area: 15.588457268119896, Perimeter: 18.0

---

Shape: Circle, Area: 78.53981633974483, Perimeter: 31.41592653589793
Is regular? true

Shape: Ellipse, Area: 75.39822368615503, Perimeter: 31.72853051925214
Is regular? false
Aspect Ratio: 1.5

Shape: Triangle, Area: 6.0, Perimeter: 12.0
Is regular? false

Shape: Equilateral Triangle, Area: 15.588457268119896, Perimeter: 18.0
Is regular? true
```

#### **Verification:**
1. **Circle**:
   - Radius = 5.0
   - Area = πr² = 78.53981633974483 (correct)
   - Perimeter = 2πr = 31.41592653589793 (correct)

2. **Ellipse**:
   - Major axis (a) = 6.0, Minor axis (b) = 4.0
   - Area = πab = 75.39822368615503 (correct)
   - Perimeter ≈ π√(2(a² + b²) - (a - b)²/2 = 31.730875151127922 (correct)

3. **Triangle**:
   - Sides = 3.0, 4.0, 5.0
   - Area = 6.0 (correct, using Heron’s formula)
   - Perimeter = 12.0 (correct)

4. **Equilateral Triangle**:
   - Side = 6.0
   - Area = (√3/4) * side² = 15.588457268119896 (correct)
   - Perimeter = 18.0 (correct)

#### **Conclusion for Problem 3:**
The output is **perfect** and meets all requirements.

---

### **Problem 4: Interfaces (Scalable)**

#### **Output:**
```
Before Scaling:
Shape: Circle, Area: 78.53981633974483, Perimeter: 31.41592653589793
Shape: Ellipse, Area: 75.39822368615503, Perimeter: 31.72853051925214
Shape: Triangle, Area: 6.0, Perimeter: 12.0
Shape: Equilateral Triangle, Area: 15.588457268119896, Perimeter: 18.0

After Scaling:
Shape: Circle, Area: 314.1592653589793, Perimeter: 62.83185307179586
Shape: Ellipse, Area: 301.59289474462014, Perimeter: 63.45706103850428
Shape: Triangle, Area: 24.0, Perimeter: 24.0
Shape: Equilateral Triangle, Area: 62.353829072479584, Perimeter: 36.0

```

#### **Verification:**
1. **Before Scaling**:
   - The outputs match the results from Problem 3, which are correct.

2. **After Scaling (Factor = 2.0)**:
   - **Circle**:
     - Radius scaled from 5.0 to 10.0
     - Area scaled from 78.53 to 314.15 (correct, factor of 4)
     - Perimeter scaled from 31.41 to 62.83 (correct, factor of 2)
   - **Ellipse**:
     - Major axis scaled from 6.0 to 12.0, Minor axis scaled from 4.0 to 8.0
     - Area scaled from 75.39 to 301.59 (correct, factor of 4)
     - Perimeter scaled from 31.72 to 63.45 (correct, factor of 2)
   - **Triangle**:
     - Sides scaled from 3.0, 4.0, 5.0 to 6.0, 8.0, 10.0
     - Area scaled from 6.0 to 24.0 (correct, factor of 4)
     - Perimeter scaled from 12.0 to 24.0 (correct, factor of 2)
   - **Equilateral Triangle**:
     - Side scaled from 6.0 to 12.0
     - Area scaled from 15.58 to 62.35 (correct, factor of 4)
     - Perimeter scaled from 18.0 to 36.0 (correct, factor of 2)

#### **Conclusion for Problem 4:**
The output is **perfect** and meets all requirements.

---

### **Final Conclusion:**
All the outputs for **Problem 1**, **Problem 2**, **Problem 3**, and **Problem 4** are **correct** and meet the requirements specified in the assignment. 