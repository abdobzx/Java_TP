# Travaux Pratiques

This repository contains practical works (Travaux pratiques) organized on different branches. Each branch corresponds to a different practical exercise or task. Below is a list of branches along with a brief description of the practical work contained within each branch:

## Branches:

### [TP_1.2]
1. Create the IDao interface with a getDate method
2. Create an implementation of this interface 
3. Create the iMe interface with a calculation method
4. Create an implementation of this interface using loose coupling
5. Inject dependencies:
  has. By static instantiation
  b. By dynamic instantiation
  c. Using the Spring Framework
       - XML version
       - Annotation version

### [TP_2.2]
1. Install IntelliJ Ultimate
2. Create a Spring Initializer project with JPA, H2, Spring Web and Lombock dependencies
3. Create the JPA Product entity having the attributes:
        - id of type Long
        - name of type String
        - double type price
        - quantity of type int
4. Configure the persistence unit in the application.properties file
5. Create the JPA Repository interface based on Spring data
6. Test some patient management operations:
     - Add products
     - View all products
     - Consult a product
     - Search for products
     - Update a product
     - delete a product
7. Migrate from H2 Database to MySQL

### [TP_3]
Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients. L'application doit permettre les fonctionnalités suivantes :
Afficher les patients
Faire la pagination
Chercher les patients
Supprimer un patient
Faire des améliorations supplémentaires
