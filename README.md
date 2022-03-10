# javaSpringBoot_Viladoms
Introduction to BD H2 with Spring Boot. Core Concepts: H2 DB, SQL, JDBC, JPA DATA, @Entity @CrudRepository, Application.properties, datasoruce, URL, Driver, dialect, DDL, @Entity, @OneToMany, @ManyToOne, @ManyToMany, @JoinColumn


# Introduction to BD H2 with Spring Boot

-  libraryH2Command : first project with only H2 DB JDBC Java Dependency and JPA DATA
-  libraryH2Command2 : copy from the first project  just to add an AUTO-GENERATED ID 
-  customer : project with H2 DB JPA and all CRUD operations
-  libraryH2Command3 JPA @ManyToOne Unidirectional owning-side Many between @Entity User (reverse or not-owning side) and @Entity Book (owning side)  
-  libraryH2Command4 JPA @ManyToOne and @OneToMany Bidirectional between @Entity User (not-owning side) and @Entity Book (owning side)
-  libraryH2Command5 JPA @ManyToMany by @JoinTable between @Entity Author (owning side) and @Entity Book (inverse not-owning side)
-  libraryH2Command6 JPA @ManyToMany by @Entity Borrows between @Entity User (owning side) and @Entity Book (inverse not-owning side)
