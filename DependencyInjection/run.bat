@echo off
REM Set the MAVEN_HOME variable to the path where Maven is installed
SET MAVEN_HOME=C:\path\to\apache-maven-3.8.7
REM Add Maven bin directory to the system PATH
SET PATH=%MAVEN_HOME%\bin;%PATH%

REM Navigate to the project directory
cd /d C:\Users\YourUsername\OneDrive\Desktop\week2\DependencyInjection

REM Run Maven clean and package commands
mvn clean package

pause
