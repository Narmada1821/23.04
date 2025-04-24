FROM ubuntu:latest

FROM openjdk:11-jre-slim

RUN mkdir /opt/tomcat

WORKDIR /opt/tomcat
