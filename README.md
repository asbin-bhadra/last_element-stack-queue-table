## About
I have implemented functions ofstack and Queue , finding last number of a list, print table of each list in a list in scala language with SBT.

## Stack Features
1. push(List(),1)- Adds an element to the stack
1. pop(List(1,2,4,5)) - Remove an element from the top of the stack
1. isEmpty(List()) - Check if stack is empty or not.
1. peek(List(1,5,4,6,2) - Fetch the first element of the stack.

## Queue Features
1. enqueue(List(),1) - Adds an item to the queue.
1. dequeue(List(1,2,4,5)) - Remove an item from the queue
1. isEmpty(List()) - Check if Queue is empty or not.
1. peek(List(1,5,4,6,2) - Fetch the first element of the Queue.


## Other Feature
getLastElement(List(3,4,2,5)) - It will return the last element and index of the list.
tableOfList(List(1,2,3,5)) - It will print the table of each element of the list.

## Compile Code
```
sbt compile
```

## Generate scalastyle config file ( Already created in this project )
```
sbt scalastyleGenerateConfig
```

## Check scalastyle for code
```
sbt scalastyle