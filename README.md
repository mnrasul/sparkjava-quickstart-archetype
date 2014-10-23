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
      
### Create an RPM

You can create RPMs for distributions which use [upstart][upstart]. That is Fedora from 9-15, the CentOS and RedHat 6 series and it's derivates.

To create the RPM, run maven with

    mvn clean package -P rpmUpstart

The RPM and the specfile are created below

    ${project.build.directory}/rpm/${project.artifactId}

You can install this rpm with

    yum localinstall /path/to/your.rpm
    
It will start automatically during system boot. For configuration of JAVA_OPTS and more please see

    /etc/sysconfig/${project.artifactId}

[spark]: http://www.sparkjava.com
[maven]: http://maven.apache.org
[upstart]: http://en.wikipedia.org/wiki/Upstart