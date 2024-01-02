-- Create Database
CREATE DATABASE SchoolDB;

-- Use the created database
USE SchoolDB;

-- Create Students Table
CREATE TABLE Students (
    StudentID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    DateOfBirth DATE,
    Email VARCHAR(100),
    CONSTRAINT UC_StudentEmail UNIQUE (Email)
);

-- Create Courses Table
CREATE TABLE Courses (
    CourseID INT AUTO_INCREMENT PRIMARY KEY,
    CourseName VARCHAR(100) NOT NULL,
    Department VARCHAR(50)
);

-- Create StudentCourses Table for Many-to-Many Relationship
CREATE TABLE StudentCourses (
    StudentID INT,
    CourseID INT,
    EnrollmentDate DATE,
    PRIMARY KEY (StudentID, CourseID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);


-- Basic Queries

-- Select all students
SELECT * FROM Students;

-- Select distinct departments
SELECT DISTINCT Department FROM Courses;

-- Select students with last name 'Smith'
SELECT * FROM Students WHERE LastName = 'Smith';

-- Select students with last name 'Smith' or first name 'John'
SELECT * FROM Students WHERE LastName = 'Smith' OR FirstName = 'John';

-- Order students by date of birth in descending order
SELECT * FROM Students ORDER BY DateOfBirth DESC;

-- Insert a new student
INSERT INTO Students (FirstName, LastName, DateOfBirth, Email) 
VALUES ('Alice', 'Johnson', '1995-08-15', 'alice.johnson@example.com');

-- Update email for student with StudentID 1
UPDATE Students SET Email = 'john.smith@example.com' WHERE StudentID = 1;

-- Delete student with StudentID 5
DELETE FROM Students WHERE StudentID = 5;

-- Select top 5 students
SELECT * FROM Students LIMIT 5;

-- Select students with first name starting with 'J'
SELECT * FROM Students WHERE FirstName LIKE 'J%';

-- Select students with IDs 1, 3, 5
SELECT * FROM Students WHERE StudentID IN (1, 3, 5);

-- Select students with date of birth between 1990-01-01 and 2000-01-01
SELECT * FROM Students WHERE DateOfBirth BETWEEN '1990-01-01' AND '2000-01-01';

-- Alias: Select FirstName as Name, DateOfBirth as DOB from Students
SELECT FirstName AS Name, DateOfBirth AS DOB FROM Students;


-- Join Operations

-- Inner Join: List students and their courses
SELECT Students.FirstName, Courses.CourseName FROM Students 
INNER JOIN StudentCourses ON Students.StudentID = StudentCourses.StudentID 
INNER JOIN Courses ON StudentCourses.CourseID = Courses.CourseID;

-- Left Join: List all students and their courses
SELECT Students.FirstName, Courses.CourseName FROM Students 
LEFT JOIN StudentCourses ON Students.StudentID = StudentCourses.StudentID 
LEFT JOIN Courses ON StudentCourses.CourseID = Courses.CourseID;

-- Right Join: List all courses and their students
SELECT Students.FirstName, Courses.CourseName FROM Students 
RIGHT JOIN StudentCourses ON Students.StudentID = StudentCourses.StudentID 
RIGHT JOIN Courses ON StudentCourses.CourseID = Courses.CourseID;

-- Full Join (Union of Left and Right Join): List all students and their courses, and all courses and their students
SELECT Students.FirstName, Courses.CourseName FROM Students 
LEFT JOIN StudentCourses ON Students.StudentID = StudentCourses.StudentID 
LEFT JOIN Courses ON StudentCourses.CourseID = Courses.CourseID
UNION
SELECT Students.FirstName, Courses.CourseName FROM Students 
RIGHT JOIN StudentCourses ON Students.StudentID = StudentCourses.StudentID 
RIGHT JOIN Courses ON StudentCourses.CourseID = Courses.CourseID;


-- Other Operations

-- Union: Combine distinct lists of student and course names
SELECT FirstName FROM Students
UNION
SELECT CourseName FROM Courses;

-- Create Index on LastName in Students table
CREATE INDEX idx_lastname ON Students (LastName);

-- Drop a temporary table (if exists)
DROP TABLE IF EXISTS TempTable;

-- Alter Table: Add a new column 'Gender' to Students table
ALTER TABLE Students ADD COLUMN Gender VARCHAR(10);

-- View: Create a view of students with first and last names
CREATE VIEW StudentView AS SELECT FirstName, LastName FROM Students;



