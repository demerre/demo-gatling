# Gatling Example Project

This is an example project demonstrating the use of Gatling for load testing in a Java project.

## What is Gatling?

[Gatling](https://gatling.io/) is an open-source load testing tool designed to analyze and measure the performance of web applications.

## Features

- **Performance Testing**: Simulate high load on web applications to assess their performance.
- **Stress Testing**: Determine the maximum capacity of your web applications by applying heavy load.
- **Automated Load Testing**: Integrate with CI/CD pipelines to automate load testing processes.

## Getting Started

### Prerequisites

- **Java 8** or higher
- **Maven** or **Gradle** installed

### Adding Gatling to Your Project

Add the following dependencies to your `pom.xml` if you are using Maven:

```xml
<dependency>
    <groupId>io.gatling</groupId>
    <artifactId>gatling-core</artifactId>
    <version>3.8.3</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>io.gatling</groupId>
    <artifactId>gatling-highcharts</artifactId>
    <version>3.8.3</version>
    <scope>test</scope>
</dependency>
