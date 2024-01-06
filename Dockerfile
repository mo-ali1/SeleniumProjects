FROM openjdk:11
COPY src/test/java/ /tmp
WORKDIR /tmp
CMD java com.paraBank.tests.Hello2
