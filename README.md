# Cloud-native Java Examples from JAX 2017

These are the examples of my cloud-native Java session at the JAX conference in Mainz in 2017.

##How to get them up and running:
1. create a local directory, init a Git repository in there, add the two files from the config directory and commit them to the Git repository
2. Enter the directory name (fully qualified) in config-server/src/main/resources/application.properties
3. Enter a) a mvn clean package and then a java -jar target/[JAR_FILE] in this order in the following directories:
3.1 config-server
3.2 hystrix-dashboard
3.3 eureka-server
3.4 customer-service
3.5 customer-client
