## collinsonAPI

API project for CitiBikes Endpoint for Collinson

## Objective

The objective of this project is to testing the GET Request for the API with the given endpoint
And to validate that the city Frankfurt is in country DE and also to fetch the Latitude and Longitude
values for the city Frankfurt.


## System Requirements:

Operating System : Windows & Linux
Maven installed on your machine to run the application using Maven

## Project Info:

This complete API project is implemented using RestAssured with JUnit framework.
Here is the structure of the  Project:
Goto collinsonAPI/citibikiAPIRestAssured project.  In the src/test/java folder structure we can find the following packages:

* featureFiles --> 
                
                      This package consists of cityBike.feature file where in the actual test scenario is defined.
                      \src\test\java\featureFiles\cityBike.feature
* model --> 
    
                      This package consists of the Location class with the getters and setters defined for the fields city, country, latitude and longitude.
                      \src\test\java\model\Location.java
* resources -->       

                      This package also consists of the config.properties file where the BaseURL is configured.
                      \src\test\java\resources\config.properties
* runner --> 

                      This package consists of the TestRunner.class file
                      \src\test\java\runner\TestRunner.java
* stepDefinitions --> 
                      
                      This package consists of MyStepDefs.java class which is defined with all the step definitions derived from the cucumber feature file.
                      \src\test\java\stepDefinitions\MyStepDefs.java
                      
                      This package consists of all the utility methods required
                      \src\test\java\resources\NetworkUtility.java

## Ways to Execute the Project:

    First make sure that your local machine is installed with the latest Maven
    Import the project into the IDE (Eclipse / IntelliJ / VisualStudio).

Way-1:
-----
    In the IDE navigate to the following location: \collinsonAPI\citibikeAPIRestAssured\src\test\java\featureFiles\
    and open the file: cityBike.feature and run as cucumber feature file
    This should successfully run and display with the results in the console.
Way-2:
-----
    In the IDE navigate to the following location: \collinsonAPI\citibikeAPIRestAssured\src\test\java\runner\
    and open the file: TestRunner.java and run this file as Junit.test
    This should successfully run and display with the results in the console.
Way-3:
-----
    In the IDE right click on the project name and run as "maven test"
    This should successfully run and display with the results in the console.
Way-4:
-----
    On your local machine 
    open the command prompt and navigate to the project folder location
    and once running the following command "maven clean install" 
    This should successfully run and display with the results in the console.

## POM.xml:

The POM.xml file is defined with all the list of the dependencies which are required for creating and executing the project successfully using RestAssured with JUnit frameworks.
