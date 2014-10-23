sparkjava-quickstart-archetype
==============================

An archetype to quickly get started with [SparkJava Framework][spark]

## Prequisites

### Java 8
SparkJava requires Java8. Make sure you have an according version installed.

### Apache Maven

This project is an archetype for [Apache Maven][maven]. Please install before proceeding.

## Usage

### Create the project
 1. Check out the source code with

     git clone https://github.com/mnrasul/sparkjava-quickstart-archetype.git
    
 2. Install the archetype into your local repository with
 
      mvn clean install
     
 3. Create a new SparkJava project with
 
     mvn archetype:generate -DarchetypeGroupId=com.github.mnrasul.archetypes \
     -DarchetypeArtifactId=sparkjava-quickstart-archetype -DarchetypeVersion=0.0.1-SNAPSHOT \
     -DgroupId=org.yourcompany.somegroup -DartifactId=YourApp -Dversion=0.0.1-SNAPSHOT \
    

### Run the project
  
  1. Develop, develop, develop! ;)
  
  2. Create an executable jar containing all dependencies as easy as
     
      mvn clean package
     
  3. Run the JAR with
  
      java -jar target/YourApp-0.0.1-SNAPSHOT.jar  


[spark]: http://www.sparkjava.com
[maven]: http://maven.apache.org