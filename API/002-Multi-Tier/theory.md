# Multi-tier architecture

Splitting app into different environments and softwares
+ Reduce coupling, apps arent as dependant on each other
+ Easier to scale up or down different layers which require modification
+ If one goes down the whole app shouldnt go down, easier to fix stuff (or keep it hidden as being broken..)

<Diagram>

Presentation Layer
Business Layer
Persistence/Data Layer

Business Layer diagram

Controller
Service
Model
Database
Repo class extending CRUD 