# eCommerce Microservices Architecture Project
Overview

This project implements a robust microservices-based architecture to manage various services for an e-commerce platform. The system is designed to handle independent services like inventory management, product catalog, order processing, and API gateway integration.
# Key Features:

    Service-Oriented Architecture: Each microservice handles a specific domain concern, ensuring modularity and scalability.
    Spring Boot Microservices: Built with Java and Spring Boot for rapid development and ease of integration.
    API Gateway: Centralized access point for service requests using an API Gateway pattern.
    Service Discovery: Eureka Server for service registration and discovery.
    Database Management: Different services use databases optimized for their individual needs.
    Inter-Service Communication: Leveraged REST APIs for communication between services.
    Fault Tolerance and Monitoring: Integrated Spring Boot Actuator for service monitoring and resilience.

# Tech Stack:

    Backend: Java 11, Spring Boot
    Service Discovery: Eureka Server
    API Gateway: Spring Cloud Gateway
    Database: H2 Database, PostgreSQL
    Build Tools: Maven
    Version Control: Git

# Microservices Included:

    Inventory Service: Tracks product stock levels.
    Product Service: Manages product details and categories.
    Order Service: Handles customer orders and processing.
    Eureka Server: Service discovery and registration center.
    API Gateway: Manages request routing and access control.

