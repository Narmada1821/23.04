FROM ubuntu:latest

FROM openjdk:11-jre-slim

RUN mkdir /opt/tomcat

WORKDIR /opt/tomcat
3  RUN
•	Purpose: Executes a command during the image build process.
•	Syntax:

RUN <command>
•	Example:

RUN apt-get update && apt-get install -y curl

