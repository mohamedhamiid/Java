# Book Library
## Description:
### 1) Book (Parent)
#### Attributes
- protected static int NoOfBooks --> Count the number of books in general
- protected int id --> Give give ID of each book based on previous attribute
- protected String title --> Title of each book
- protected java.time.LocalDate date --> Date of each book using (LocalDate)
- protected double price --> Price of each book
##### Constructors
- Book() --> Increase NoOfBooks
- Book(String title , LocalDate date , double price) --> call the (no-arg constructor) + Initialize attributes of Book
#### Setters 
- public void setTitle(String title)
- public void setDate(java.util.Date date)
- public void setPrice(double price)
#### Methods
- public String toString() --> Make the info of each book as string
- public void print() --> Print the info of each book by print the string of the previous method
### 2) AudioBook 
It's a type of books so it <b> inherit book class <\b>
