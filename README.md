# com.amazon.in

Selenium Java Maven TestNG

Sample Selenium WebDriver Maven Projects I created in Java by using TestNG and Page Object Model (POM) which is used to create and organize the page objects. & Page Factory to initialize the webElements.

Setup
Install Marven and TestNG in Eclipse, and downloaded the selenium chrome webdriver.
You can go to Eclipse Market place and download or go to https://mvnrepository.com/
Basically you need to install the following items:
Java (11.0.12)
Selenium (3.141.59)
Maven (3.8.4)
TestNG(6.14.2)

Create a Maven project
From Eclipse - File - New - Other - Maven - Maven Project, Next;
Check "Create a simple project" and "Use default Workspace location" with absolute path point to \eclipse-space, Next;
Group Id: com.qa.amazon, Artifact Id: com.qa.amazon, Finish.
Modify JRE System Library
Right click JRE System Library listed under the newly create Mavan project, properties, select Workspace default JRE, Apply and Close.

Modify pom.xml by Aadding all the dependencies needed for the project.

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.qa.amazon</groupId>
  <artifactId>com.qa.amazon</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <name>Selenium Automation</name>
  <description>Selenium Automation</description>

<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.141.59</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.14.2</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.0.0</version>
		</dependency>
		
	</dependencies>

</project>

Create a com.base package and in that create DriverScript class and a another package for all the pages
Create a Hepler class in the utility package and keep the code which is reusable.
 
Create com.tests package for all the testcase related files.
Create a Base test which extends DriverScript class and initialize all the pages.

Configfile
Create a config.properties file to store all the environment variables.

Convert Maven project to TestNG
Right click on the newly created Maven project, TestNG, Convert to TestNG, a testng.xml will be created below pom.xml, Finish.

Execute
Right click on the testng.xml, Run as, TestNG Suite;
Check results in Console and in the test-output folder.

Debug
Print variable in Console when executing the scripts: System.out.println(variablename)

Run Time
Source code and run time are different, run time are located at "target" folder which is at the same level of "src" folder.
Normally you change your source code, save it, then run from testng.xml - run as TestNG Suite, the "target" folder will automatically updated to your lateset code.
However, if you find run time code is not updating after you modified your source code, do the following 2 steps:
Clean the project (top menu Project - Clean)
Update the maven project (Project > Maven > Update Maven Project)
