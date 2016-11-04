# Check-Parentheses-Valid
Stack Data Structure - FILO (First In Last Out)

*First*
__
__
__
*Last*


Checks brackets. If it is a left bracket, it pushes it onto the stack, so goes to bottom and stays there as the first element.

Then, if the iterator encounters a closing bracket: ')' or ']', etc, it will pop the *last* element off the stack (off the top of the stack), and will check they both match by calling the Match() method. If they both match (e.g.: '()'), then the method will return true, and the program will continue until the stack is emptied.
