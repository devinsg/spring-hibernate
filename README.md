# spring-hibernate
- pluralsight: https://app.pluralsight.com/library/courses/spring-jpa-hibernate/table-of-contents
- github: https://github.com/bh5k/spring-jpa

# Architecture MVC, n-tier, often 3 layers, JPA - Java Persistence API
- Controller: annotated with @Controller, handle request/response, no business logic, coordinate with service and repository, handle exception and routing
- Service: annotated with @Service, describes verds/actions of system, business logic belongs here, ensure business object state, transactional, often same methods as repository
- Repository: annotated with @Repository, known as data of system, database interaction, 1-1 mapping object and 1-1 database table mapping.
- have 2 type of Injection: Setter, Constructor

# JPA (Java Persistence API) annotations
- @PersistentContext - inject entity manager
- @Service - location of business logic
- @Repository - database integration
- @Transactional - beginning of transaction

# JPQL (Java Persistence Query Language)
- 
- 

# API Testing Endpoint:
- http://localhost:8088/api/v1/user/info?firstname=anh&lastname=vo&age=25

