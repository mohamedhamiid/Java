# Book Library
## Description:
- Here we input info from user
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
It's a type of books but it has additional attributes and methods so it **inherit book class**
#### Attributes
- private double minutes --> Minutes of each book
#### Constructors
- AudioBook() --> Call the (no-arg constructor) of the Parent
- AudioBook(String title , LocalDate date , double price,double minutes) --> call the (no-arg constructor) + Initialize attributes of Audio Book
#### Setters and Getters
- public void setMinutes(int minutes)
- public double getMinutes()
#### Methods
- public String toString() --> Call (toString) in parent +  Make the minutes as string
- public void print() --> Print the info of each book by print the string of the previous method
- public boolean equals(Object obj) --> Check if book is already exist
### 3) TextBook 
It's a type of books but it has additional attributes and methods so it **inherit book class**
#### Attributes
- private int pages --> pages of each book
#### Constructors
- TextBook() --> Call the (no-arg constructor) of the Parent
- TextBook(String title , LocalDate date , double price,int pages) --> call the (no-arg constructor) + Initialize attributes of Text Book
#### Setters and Getters
- public void setPages(int pages)
- public int getPages()
#### Methods
- public String toString() --> Call (toString) in parent +  Make the pages number as string
- public void print() --> Print the info of each book by print the string of the previous method
- public boolean equals(Object obj) --> Check if book is already exist

