# Budget Tracker

A console-based budget tracking application built with Java.

## Tech Stack
- Java 21+

## Features
- Add income and expense transactions
- Search transactions by ID
- View financial statistics (total income, expenses, balance)
- Input validation with exception handling

## How to Run
1. Clone this repository
```
   git clone https://github.com/kai0609-bit/Budget-Tracker
```
2. Compile
```
   javac *.java
```
3. Run
```
   java Main
```

## Class Structure
| Class | Description |
|-------|-------------|
| `Searchable` | Interface for search functionality |
| `Transaction` | Model class representing a transaction |
| `BudgetManager` | Manages transactions and statistics |
| `Main` | Entry point of the application |

## Running Tests

1. Navigate to the project directory
2. Run the following command:
```
   mvn test
```
3. Test results will be displayed in the terminal

## Test Coverage
| Class | Tests |
|-------|-------|
| `Transaction` | Valid creation, Zero amount, Blank ID |
| `BudgetManager` | Add transaction, Find by ID, Find by ID not found |

## Author
GitHub: @kai0609-bit
