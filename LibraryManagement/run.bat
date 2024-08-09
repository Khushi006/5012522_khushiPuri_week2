@echo off
setlocal

REM Set the classpath to include the Spring libraries and the directory with compiled classes
set CLASSPATH=lib\spring-core-5.3.24.jar;lib\spring-context-5.3.24.jar;lib\spring-beans-5.3.24.jar;lib\commons-logging-1.2.jar;C:\Users\lenovo\OneDrive\Desktop\week2\LibraryManagement

REM Compile the Java files
javac -cp %CLASSPATH% C:\Users\lenovo\OneDrive\Desktop\week2\LibraryManagement\BookRepository.java C:\Users\lenovo\OneDrive\Desktop\week2\LibraryManagement\BookService.java C:\Users\lenovo\OneDrive\Desktop\week2\LibraryManagement\App.java

REM Run the application
java -cp %CLASSPATH% com.library.App

endlocal
