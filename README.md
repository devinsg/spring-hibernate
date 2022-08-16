# spring-hibernate
- pluralsight: https://app.pluralsight.com/library/courses/spring-jpa-hibernate/table-of-contents
- github: https://github.com/bh5k/spring-jpa

# Architecture MVC, n-tier, often 3 layers, JPA - Java Persistence API
- Controller: annotated with @Controller, handle request/response, no business logic, coordinate with service and repository, handle exception and routing
- Service: annotated with @Service, describes verds/actions of system, business logic belongs here, ensure business object state, transactional, often same methods as repository
- Repository: annotated with @Repository, known as data of system, database interaction, 1-1 mapping object and 1-1 database table mapping.
- have 2 type of Injection: Setter, Constructor

# Some propular annotations from JPA (Java Persistence API)
- @PersistentContext - inject entity manager
- @Service - location of business logic
- @Repository - database integration
- @Transactional - beginning of transaction

# Fetch Types
- Lazy: db query when property is called
- Eager: db query when object is created

# Projection
- projection is a great way to present objects to the UI.
- objects added using JPQL (Java Persistence Query Language)
- projection objects can be JPA Entities
- will need constructor for the projection

# Named Queries
- cleaner then adhoc JPQL
- not required but focuses on the domain
- named parameters

# API Testing Endpoint:
- http://localhost:8088/api/v1/user/info?firstname=anh&lastname=vo&age=25

# Questions & Answers:
- the limitation of Spring JPA: 
=> ability to create queries based on method names relies on a fixed set of keywords that can sometimes be insufficient.
- the interface from Spring Data MongoDB contains methods that make use of low level bulk commands for insert, update, and remove on collections
=> BulkOperations
