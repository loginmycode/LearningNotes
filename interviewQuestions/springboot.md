@Component
  - Definition: A Spring annotation used to mark a Java class as a Spring-managed bean. It enables automatic registration of the class in the Spring IoC container during component scanning.\

Primary Use: 
        Marks a class as a generic Spring-managed component in an application (e.g., service, utility, or other supporting classes).\

Key Features:
The class annotated with @Component is automatically detected and managed by the Spring container.
Can be used alongside specialized stereotypes like @Service, @Repository, and @Controller.


- @Entity
Definition:

   A JPA annotation used to mark a class as a persistent entity that maps to a database table.
Primary Use: Specifies that the class is a part of the data model and represents a table in the database.
Part of: Java Persistence API (JPA), not Spring directly.
Key Features:
Used with ORM tools like Hibernate to manage database operations.
The class annotated with @Entity represents a table, and its fields represent columns.
Requires an @Id annotation to define the primary key.



Dependecy injection Types : 
  
  
  - field Injection
    example class is Person
    @autowired
    private Person person 
  - Constructor Injectin

    private Person person;

    public mainClassName(person person){

        this.person= person;
    }

  - setConstroctor Injection

    @autowired
    public void setMainClassName(person person){
            this.person= person;
    }



  - If there is two class you made both as @component there will be error to pick one

  You can use @primary for any one class
  or you can make @qualifier

    
