# My String Immutable
## Decription:
### Attributes
- private char [] ref --> Character array to store characters of the string
### Constructors
- MyStringBuffer(String passedStr) --> Make the passed string as type My String by filling the character array 
and end it with '\u0000' (NULL)
### Methods
- void print() --> Print the string
- int indexOf (char x) --> Get index of a character in the string , if it's not exist it returns -1
- int length() --> Get length of string
- void erase(int index, int length) --> Erase characters of the string , as it's immutuble it store the result in new location <br>
@parameters <br>
&nbsp;&nbsp;- int index : the start of eraseing "\n"
&nbsp;&nbsp;- int length : the length of erasing "\n"
- void insert(int index , String str) --> Insert characters of the string , as it's immutuble it store the result in new location <br>
@parameters <br>
&nbsp;&nbsp;- int index : the start of inserting "\n"
&nbsp;&nbsp;- String str : the string to insert "\n"
