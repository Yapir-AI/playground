This is a training project, that manages different pets.  


## Tech Stack
- Java
- Spring
- Hibernate
- Postgres

## Guidelines
### Entity ids are uuid
All Entity @Id should be UUID
### Entity class name ends with Entity
Any class annotated with @Entity should be suffixed by 'Entity'
### We use fluent setters
Setters should be fluent and return this when written
### Entity should implement equals and hashcode
Entities should implement equals using id only (after null/equity checks) and hashcode using class only.
