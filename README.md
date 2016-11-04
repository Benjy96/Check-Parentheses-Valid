# Check-Parentheses-Valid
Stack Data Structure - FILO (First In Last Out)

*First*
__
__
__
*Last* ---PROCESS---- (())  <- Brackets to be checked and pushed onto stack, or if closing bracket, pop LAST then validate they match


Checks brackets. If it is a left bracket, it pushes it onto the stack, - bracket goes to bottom and stays there as the first element.

Then, if the iterator encounters a closing bracket: ')' or ']', etc, it will pop the *last* element of the stack (off the top of the stack), and will check they both match by calling the Match() method. If they both match (e.g.: '()'), then the method will return true, and the program will continue until the stack is emptied.
