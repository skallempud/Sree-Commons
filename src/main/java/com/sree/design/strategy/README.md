Strategy pattern:

The strategy pattern is behavioral pattern which enables and algorithm behavior to be selected during run time.
Pattern helps in avoiding if else conditions and giving responsibilities based on behavior during run time. If new strategy needs to be implemented it could be done without altering the context.

Solution:
Create a client --> Create context --> Context calls a method in interface.

Interface will be implemented by different classes who define the strategies in each class.
This behavior is picked during run time by context class based on client requirement.
