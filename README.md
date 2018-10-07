# Twitter-Informatics                      ![](https://travis-ci.org/DivyenduDutta/Twitter-Informatics.svg?branch=master)
A spring boot application that displays various details (raw and processed details) of an user. 

Raw data is unprocessed data ie, data directly obtained from the twitter API.

Processed data (#TO-DO) is data on which certain relevant machine learning algorithms have been applied to gain 
further insights.

![alt text](https://github.com/DivyenduDutta/Twitter-Informatics/blob/master/images/Initial%20draft.png)

# Technology Stack

The back-end is written in spring boot.

The front-end (view) is written in React. Redux is used to manage application state.

Spring Social Twitter is used to work with twitter API.


# How to run application
## Spring Boot Server - http://localhost:8080/profile
1. Clone the repo.
2. Open a terminal in the root project folder.
3. Type `mvn spring-boot:run`

## React app - http://localhost:3000
1. Navigate into Twitter-Informatics-UI
2. Open a terminal and run `npm install` if not already done
3. Type `npm start`

Use ` curl -H "Accepent-type: application/json" -X POST -d '{"name":"electon"}' http://localhost:8080/profile` to test the web service

