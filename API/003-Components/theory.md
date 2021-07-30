# Components

Components are special types of beans, that should only be created once. 
Beans such as a controller which connects to the client is only needed once

Beans are declared with an annotation using the @

@Component
Instructs Spring to create this bean at runtime, runs constantly and is used to control the app

@Service
Exactly the same as the component, but shows the 'intent' of this class

@Repository
Used for data-access interfaces @Repository allows conversion of data for app use

@Controller
Allows for implementation of Spring Web Endpoints (http://getAll) using @RequestMapping

@RestController
A controller specifically for creating REST endpoints, applies @ResponseBody to all endpoints for JSON format

@Entity
Entities are classes that represent tables in the database
They require an @Id, constructor and getters and setters

Exercises 
- Go through creating the components
- Create a controller that returns a string when a certain get request is sent
- Create a Post 