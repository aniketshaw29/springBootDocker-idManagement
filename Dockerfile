#from dockerHub
#FROM openjdk:8
FROM public.int.repositories.cloud.sap/maven:3-sapmachine-17

#our port will get mapped to our localhost, to make it available outside the container
EXPOSE 9998

ADD target/id-management-aniket.jar id-management-aniket.jar

ENTRYPOINT [ "java","-jar","/id-management-aniket.jar" ]




#use the below commands in cmd:
#docker build -t id-management-aniket.jar .
#docker run -p 9090:9999 id-management-aniket.jar

#to hit the run go to localhost:9090
