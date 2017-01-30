# eclipse-value-annotation
Try to solve the problem why Value annotation doesn't work while running test with Eclipse

Actually there is no problem with code, only need to edit /etc/environment and restart the OS. Command source /etc/environment might not work directly per my verification.

### Run and build
Step-1: 
./gradlew clean build

Step-2:
java -jar build/libs/sample-0.0.1-SNAPSHOT.jar
