A spring boot example demonstrating aop.  Greeting service creates a message containing the requester's name.  An aspect inspects
the name before method invocation and throws InvalidNameException if the name is 'swearWord'.


