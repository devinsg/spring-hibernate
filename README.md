# spring-hibernate
- pluralsight: https://app.pluralsight.com/library/courses/spring-jpa-hibernate/table-of-contents
- github: https://github.com/bh5k/spring-jpa

# Architecture MVC, n-tier, often 3 layers
- Controller: annotated with @Controller, handle request/response, no business logic, coordinate with service and repository, handle exception and routing
- Service: annotated with @Service, describes verds/actions of system, business logic belongs here, ensure business object state, transactional, often same methods as repository
- Repository: annotated with @Repository, known as data of system, database interaction, 1-1 mapping object and 1-1 database table mapping.

- Type of Injection: Setter, Constructor

