Write a program to give available medals to one each of an Athlete.
If one Athlete receives a gold then no one can be assigned the same. One medal can be assigned to only one person.

Solution:
Use Singleton pattern and factory pattern.

Create Athlete class and create Gold, Silver and Bronze classes which extends Athlete.
Implement getInstance method in each so only one instance is available for each gold, silver and bronze objects.
Create a factory method to create these objects.

