
*This repository is intended for recording and documentation of the overall process of my project,  which includes development process, tools, platform, and the domain (i.e. Application for World Airport Information System). and replicate the data to different back-end servers *

# Project Purpose 
Purpose of the project is to track all airports information in the world for travelers in order to get or search for the exact airport and city of the country so for the mentioned purpose Using Restful API for World Airport Dataset which will be accessible from Mongo database 
will query some useful information about world's airport, add some missing airports, update airport information or delete it. And all these methods will be implemented using RESTfull API methods (POST, GET, PUT and DELETE), Java or Node.js as a server side programming language, Mongo database as a backend ...

# Glossary

## Definitions for Project
As of January 2017, the OpenFlights Airports Database contains over 10,000 airports,ferry terminals spanning the globe,  Each entry contains the following information:
* Airport ID: 	Unique OpenFlights identifier for this airport.
* Name:	Name of airport. May or may not contain the City name.
* City:	Main city served by airport. May be spelled differently from Name.
* Country:	Country or territory where airport is located. See countries.dat to cross-reference to ISO 3166-1 codes.
* IATA:	3-letter IATA code. Null if not assigned/unknown.
* ICAO:	4-letter ICAO code.
Null if not assigned.
* Latitude:	Decimal degrees, usually to six significant digits. Negative is South, positive is North.
* Longitude:	Decimal degrees, usually to six significant digits. Negative is West, positive is East.
* Altitude:	In feet.
* Timezone:	Hours offset from UTC. Fractional hours are expressed as decimals, eg. India is 5.5.
* DST:	Daylight savings time. One of E (Europe), A (US/Canada), S (South America), O (Australia), Z (New Zealand), N (None) or U (Unknown). See also: Help: Time
Tz: database time zone	Timezone in "tz" (Olson) format, eg. "America/Los_Angeles".
Type:	Type of the airport. Value "airport" for air terminals,  and "unknown" if not known. In airports.csv, only type=airport is included.

Note: Rules for daylight savings time change from year to year and from country to country. The current data is an approximation for 2009, built on a country level. Most airports in DST-less regions in countries that generally observe DST (eg. AL, HI in the USA, NT, QL in Australia, parts of Canada) are marked incorrectly.


## Acronyms and Abbreviations
* **Airport:** The place where aiplane land and collect passengers.
* **REST:** Representational State Transfer
* **API:** Application Programming Interface


## Synonyms
will be added later 


# Constraints

The application is providing information of All Airports in the world. 
The project is limited up to some fields which contain basic information about the world's Airport. 

# Data Model 

## UseCase 
![UseCase](/uploads/4c5e53a6ae626e00e54e846561f18d91/UseCase.png)







## Json Schema

''{
   "ID": 7,
   "Code": "Narsarsuaq",
   "City": "Narssarssuaq",
   "Country": "Greenland",
   "Airport": "UAK",
   "Latitude": 61.160517,
   "Longtitude": -45.425978,
   "Timezone": "America/Godthab"
 }''

# Data Sourcing (Data Set)
In this project, we are going to use all countries airport Datasource as a Dataset. it consists more than 6000 records  

# Tool (Technologies)
working on taking the decision to use 

### Docker
* Docker is the world’s leading software container platform. Developers use Docker to eliminate “works on my machine” problems when collaborating on code with co-workers. 

* Docker platform will be used to it's image as a container for services, databases, etc

### Mongo DB

* MongoDB is an open source database that uses a document-oriented data model.

* MongoDB will be using as a data storage for this application in data is formated in Json

* It is NoSQL database type. it is schema-less with fast performance used to store data related to worlds airport.

### Node.js

* Node.js is a very powerful JavaScript-based framework/platform built on Google Chrome's JavaScript V8 Engine. it is used to query data with Mongo DB



## JAVA (Spring Boot Framework)

* Java a is a very powerful programming language. Based on different powerful characteristics it is very useful to use it for this project.

* Spring boot IDE is one of the new Framework with detail library easy to build the application.


### REST API
* REST API is used in order to communicate with the database for inserting, updating, searching and deleting of the data.

### PostMan 
* iA Little About Postman. Postman is a Google Chrome app for interacting with HTTP APIs. It presents you with a friendly GUI for constructing requests and reading responses.





# Architecture Diagram
![SystemArcheticture](/uploads/b03cbf5d309ae24603621578371cc017/SystemArcheticture.jpg)


# Requirements
* All project requirement is devided into 2 parts Functional and Non-Functional Requirments

## Functional Requirements

* System will have the ability to insert all required information for airports.

* System will have the ability to update inserted data.

* System will have the ability to delete inserted data.

* System will have the ability to search airport by ID.

* System will have the ability to search airport by name.

* System will have the ability to search the total airports by country.

## Non-Functional Requirements

* Availability: The system will be always available as computer or server is on and implementation of the replica one primary node and two other secondary nodes.

* Volume: Refer to the space reserved by the database.

* Robustness: The application will provide error message in case of any error in the system.


## Research on mongodb Replication 

* 

# General Architecture for Mongo DB Replication.

![System_Archeticture](/uploads/e894fe793fe57e78537561e1b1f4dc7a/System_Archeticture.png)

https://medium.com/towards-data-science/how-to-deploy-a-mongodb-replica-set-using-docker

# Architecture for our replica set with Docker.

![Docker_Replica_Set](/uploads/388af4bb409bfe154276e6e72b8c205a/Docker_Replica_Set.jpg)

## Replication of Mongo Data base in Docker 

* Replication is a technique used my MongoDB to ensure that your data is always backed up for safe keeping, in case one of your database servers decide to crash, shut down or turn into Ultron. Even though replication as a concept sounds easy, it’s quite daunting for newcomers to set up their own replica sets, much less containerize them.
This tutorial is a beginner friendly way to set up your own MongoDB replica sets using docker.

### Pre-requisites

* The only thing we need installed on our machines is Docker, and…. that’s it! We don’t even need to install MongoDB to create our replica set since we can access the shell through our containers itself.

### Steps 

1. create a MongoDB container from mongo latest image
	docker pull mongo

* We are going to have 3 containers from the mongo image, all inside their own docker container network. Let’s name them mongo1, mongo2, and mongo3. These will be the three mongo instances of our replica set. We are also going to expose each of them to our local machine so that we can access any of them using the mongo shell interface from our local machine if we need to (you will have to install MongoDB on your own machine to do this). Each of the three mongo containers should be able to communicate with all other containers in the network.

2. Setting up the network in docker
	shows all network: docker network ls

3. We will be adding a new network called my-mongo-cluster:  docker network create my-mongo-cluster

4. Setting Up our containers :docker run -d -v /opt/mongodb:/data/db -p 30001:27017 --name mongo1 --net my-mongo-cluster mongo mongod --replSet my-mongo-set

		### Let’s see what each part of this command does:

		* docker run: Start a container from an image
		* -p 30001:27017: Expose port 27017 in our container, as port 30001 on the localhost
		* --name mongo1 : name this container “mongo1”
		* --net my-mongo-cluster : Add this container to the “my-mongo-cluster” network.
		* mongo : the name of the image we are using to spawn this container
		* mongod --replSet my-mongo-set : Run mongod while adding this mongod instance to the replica set named “my-mongo-set”

5. Setting up 2nd containers or nodes: docker run -d -v /opt/mongodb:/data/db -p 30002:27017 --name mongo2 --net my-mongo-cluster mongo mongod --replSet my-mongo-set

6. Setting up 3rd containers or nodes: docker run -d -v /opt/mongodb:/data/db -p 30003:27017 --name mongo3 --net my-mongo-cluster mongo mongod --replSet my-mongo-set

7. Setting up replication
	Now that we have all our mongo instances up and running, let’s turn them into a replica set. Connect to the mongo shell in any of the containers.

	docker exec -it mongo1 mongo.

	This command will open up the mongo shell in our running mongo1 container (but you can also run it from the mongo2 or mongo3 container as well).

	### Inside the mongo shell, we first create our configuration :

	 db = (new Mongo('localhost:27017')).getDB('test')
		test
		> config = {
		  	"_id" : "my-mongo-set",
		  	"members" : [
		  		{
		  			"_id" : 0,
		  			"host" : "mongo1:27017"
		  		},
		  		{
		  			"_id" : 1,
		  			"host" : "mongo2:27017"
		  		},
		  		{
		  			"_id" : 2,
		  			"host" : "mongo3:27017"
		  		}
		  	]
		  }


		 * The first _id key in the config, should be the same as the --replSet flag which was set for our mongod instances, which is my-mongo-set in our case. We then list all the members we want in our replica set. Since we added all our mongo instances to our docker network. Their name in each container resolver to their respective ip addresses in the my-mongo-cluster network.

		We finally start the replica set by running

	9. rs.initiate(config) { "ok" : 1 }


	* in our mongo shell. If all goes well, your prompt should change to something like this:

	for primary node identification is :my-mongo-set:PRIMARY>
	
	
	# Dockerize the project
	
	* dockerize the project using docker and docker-compose.yml file 
	
    # Steps 
    
    * git pull the project and run the following command but make sure that port 8080 is free
    * type : docker-compose up --build
    * After completion of the command implement one of REST API method getAll please type htttp://localhost:8080/airport/all
    * you will have all the data
    * 
    

