# kotlin-app for profiles

Build a simple portfolio Kotlin web app that displays the profile image, name, some text with
the experience and a 5 tweet list of the user’s Twitter timeline.
The second part should be a simple API with 3 endpoints: 2 for the profile content, and 1
for the last 5 tweets.

###Tech
This repo uses:
- Gradle
- Kotlin with SpringBoot 
- Swagger-ui with OAS 3.0
- Docker , Dockerfile

###How to use:
To run the app backend use the following command:
```./runApp.sh```
The command will do the following tasks:
1. Build the .jar of the application
1. Build the docker image based on the Dockerfile created
1. Run the docker image exposing the 8080 port