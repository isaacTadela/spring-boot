Spring-boot application with a REST controller, which expose a Swagger API catalog

The following is a job qualification exercise which requires knowledge in the following technologies:

- Java
- Spring boot 
- Swagger 
- REST API/JSON
- Docker 

The application expose the following APIs:

-List of the inventory items list (item no, name, amount, inventory code)      
GET	/items

-Read item details (by item no)       
GET	/items/no

-Withdrawal quantity of a specific item from stock             
PUT	/items/no/w/{num}

-Deposit quantity of a specific item to stock			                                 
PUT	/items/no/d/{num}

-Add item to stock						                                                     
POST	/items

-Delete an item from stock
DELETE	/items/no

-Data persisted on H2 DB using JPA.				

-The application pack and run from docker.

You can go to /swagger-ui and see all the API of the app.
In the future i will creating Angular pages which enable to create/read/update and/delete the item,
and in the meanwhile you can use Postman to see the resposes.

You can find the docker imarg here:
https://hub.docker.com/r/iitzhakk/spring-inventory
