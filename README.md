# Student-Course-Management
 
Main Function Modules
(1) Student management functions: adding, deleting, modifying and querying student information Student information includes: student number, name and class name 
(2) Grade entry function: adding, deleting, modifying and querying grades. The grades are divided into three categories: attendance, homework and computer work, accounting for 20%, 30% and 50% respectively. The full mark is set at 100, so a total of 20 marks for attendance, 30 marks for assignments and 50 marks for practicals. (3) Data backup function 
(3) Data backup function Teachers can upload their transcripts to their email address for backup. You must therefore have a mailbox settings screen to allow the teacher to set a backup mailbox and password. 

Note: A teacher may be teaching several classes at the same time, so consider the management of grades for multiple courses.

Development and operating environment
- Development platform: Android 
- Development language: Java. 
- Development tools : Android Studio. 
- Database system: SQLite 3.0.


(1) Student side functions
1. Main interface 
The main interface adopts listview, no information is displayed when no class is selected, there is a class selection button at the bottom right corner, click on it to enter the class selection page, click on the arrow at the top left corner after the class selection is completed, you can enter the menu page, the menu page can display the avatar, name, at the same time, you can click on "my information" to enter the information viewing page, you can click on "exit" to re-enter the login page. Enter the information view page, you can click "Exit" to re-enter the login page.

2. Course Selection Interface
This interface is used to select courses, by using listview and item, read data from the database to display course information, there is a small box on the right side of the course information, by checking the small box and then click to confirm to complete the selection of courses.


3. Suggestion interface
This interface is used to make suggestions to students and will upload the suggestions to the database for teachers and administrators to view, but teachers can only view the content of students' messages and cannot see students' related information, while administrators can view the content of messages and the information of students who have left messages.

4. Message viewing interface
This interface is used for students to view their own personal information, such as student number, name, class, age, etc.

(2) Teacher side functions
1. Main interface
The main interface uses listview, which does not display any information when you are not viewing the information of the course you are teaching, there is a view button at the bottom, after clicking on it, you can display the relevant course information of the teacher in the database, you can click on the course to enter the student course information page, the page shows all the information of the students who have taken the course, you can enter and modify the student's grade information in this page. It also allows teachers to back up their grades using their email address. Click on the menu in the top left hand corner of the page to display avatars, names, and access to teacher information by clicking on 'My Information', or 'Log Out' to re-enter the login page.

2. Student results interface
You can view the information of students who have taken the course and enter the student grades entry/modification page by clicking on it. The total number of students who have taken the course is also displayed at the bottom and allows teachers to sort the information about students by class, by grade, by name, calculate average grades and export all grades.

3. Student results scoring screen
You can enter roll call, assignments and machine grades, and score the grades entered, as well as set up email addresses for student report card backup.

4. Student message interface
Student messages can be viewed, but only the content of the message can be viewed, not the information about the student.
5. Message viewing interface
This interface is used for teachers to view their own personal information, such as teacher number, name, title, age, etc.

(3) Administrator functions
1. Main page
Use fragement to correspond to students, teachers and administrators respectively. By using the refresh button, you can refresh the data related to the query.
2. Account addition page
You can add student, teacher and administrator users respectively.
3. Account information view screen
You can view the user information and login information of student, teacher and administrator users respectively, and allow you to use the search function to find this information.
4. Course View
You can view the status of the course set up and see the teachers, course names and other relevant information for the courses offered.
5. Message Enquiry
You can view student messages and see both the content of the message and the information about the student who posted it.

(2) Server side functions
1. Database connection
Connect to the SQLlite database via JDBC, and add, delete, change and check the data in the database.
2. Receive requests
Receive requests from the student, teacher and administrator sides.
3. Processing functions
Process and handle the relevant grade information passed by the user, and pass the processed data back to the database.
4. Sending data
Sends the data in the database required by the user to the client.
