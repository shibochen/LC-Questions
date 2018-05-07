# Recursion

A `recursive method` is one that directly or indirectly invokes iteself.
- direct recursion: function calls itself
  - Ex. function A calls function A
- indirect recursion:  a function is called not by itself but by another function that it called.
  - Ex. function A calls function B, function B calls function A.
For a recursive method to terminate, there must be one or more `base cases/stopping condition`

Recursion:
- nontail recursion: There are pending operations on tail position.
- tail recursion: there are no pending operations to be performed on return from a recursive call.
