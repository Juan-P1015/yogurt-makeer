# Yogur Maker API

# Descripción
Yogur Maker API es una aplicación desarrollada con Java y Spring Boot, hecha para gestionar la elaboración de yogur
El sistema permite administrar recetas, lotes, revisar la temperatura y ver el proceso de fermentación

# Arquitectura
- Controller → Peticiones HTTP (API REST)
- Service → Lógica
- Exception → Manejo de errores
- Model → Entidades del sistema
- DTO → Transferencia de datos
- Repository → Acceso a la base de datos

# Tecnologias
El proyecto fue desarrollado con:
Java 17  
Spring Boot 
Spring Web 
Spring Data JPA  
Hibernate 
Maven 
MySQL / H2 Database
Postman


# Estructura
```bash
src/
 └── main/
     ├── java/com/yogurmaker/
     │    ├── controller/
     │    ├── service/
     │    │     └── impl/
     │    ├── repository/
     │    ├── model/
     │    ├── dto/
     │    ├── exception/
     │    └── YogurMakerApplication.java
     │
     └── resources/
          ├── application.properties
          └── data.sql
```

# Ejecución
1. Clonar el repositorio
```bash
git clone https://github.com/Juan-P1015/yogurt-maker.git
cd yogur
```
 Configurar base de datos

 2. Editar el archivo:
```bash
src/main/resources/application.properties
```
Ejemplo
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/yogur_db
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3. Ejecutar el proyecto
```bash
./mvnw spring-boot:run
```

